package typings.ionicCore.virtualScrollUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var length: Double
  var offset: Double
}

object Range {
  @scala.inline
  def apply(length: Double, offset: Double): Range = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

