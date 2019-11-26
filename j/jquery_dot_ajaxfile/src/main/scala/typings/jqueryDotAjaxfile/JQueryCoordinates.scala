package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used to specify coordinates.
  */
trait JQueryCoordinates extends js.Object {
  var left: Double
  var top: Double
}

object JQueryCoordinates {
  @scala.inline
  def apply(left: Double, top: Double): JQueryCoordinates = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryCoordinates]
  }
}

