package typings.jsreportPhantomPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var bottom: Double | String
  var left: Double | String
  var right: Double | String
  var top: Double | String
}

object Margin {
  @scala.inline
  def apply(bottom: Double | String, left: Double | String, right: Double | String, top: Double | String): Margin = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Margin]
  }
}

