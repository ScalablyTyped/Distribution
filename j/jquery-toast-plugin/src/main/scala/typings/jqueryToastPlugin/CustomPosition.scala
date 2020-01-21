package typings.jqueryToastPlugin

import typings.jqueryToastPlugin.jqueryToastPluginStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPosition extends js.Object {
  var bottom: Double | auto
  var left: Double | auto
  var right: Double | auto
  var top: Double | auto
}

object CustomPosition {
  @scala.inline
  def apply(bottom: Double | auto, left: Double | auto, right: Double | auto, top: Double | auto): CustomPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomPosition]
  }
}

