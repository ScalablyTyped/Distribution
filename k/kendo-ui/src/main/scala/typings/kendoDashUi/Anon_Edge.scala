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
    val __obj = js.Dynamic.literal(edge = edge, mozilla = mozilla, msie = msie, opera = opera, safari = safari, version = version, webkit = webkit)
  
    __obj.asInstanceOf[Anon_Edge]
  }
}

