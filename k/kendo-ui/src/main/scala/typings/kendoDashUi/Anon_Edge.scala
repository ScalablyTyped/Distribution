package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Edge extends js.Object {
  var edge: Boolean
  var mozilla: Boolean
  var msie: Boolean
  var opera: Boolean
  var safari: Boolean
  var version: String
  var webkit: Boolean
}

object Anon_Edge {
  @scala.inline
  def apply(
    edge: Boolean,
    mozilla: Boolean,
    msie: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): Anon_Edge = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Edge]
  }
}

