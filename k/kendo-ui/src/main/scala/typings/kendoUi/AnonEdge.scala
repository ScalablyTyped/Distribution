package typings.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdge extends js.Object {
  var edge: Boolean
  var mozilla: Boolean
  var msie: Boolean
  var opera: Boolean
  var safari: Boolean
  var version: String
  var webkit: Boolean
}

object AnonEdge {
  @scala.inline
  def apply(
    edge: Boolean,
    mozilla: Boolean,
    msie: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): AnonEdge = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdge]
  }
}

