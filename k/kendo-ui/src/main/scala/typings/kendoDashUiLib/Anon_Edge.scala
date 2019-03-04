package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Edge extends js.Object {
  var edge: scala.Boolean
  var mozilla: scala.Boolean
  var msie: scala.Boolean
  var opera: scala.Boolean
  var safari: scala.Boolean
  var version: java.lang.String
  var webkit: scala.Boolean
}

object Anon_Edge {
  @scala.inline
  def apply(
    edge: scala.Boolean,
    mozilla: scala.Boolean,
    msie: scala.Boolean,
    opera: scala.Boolean,
    safari: scala.Boolean,
    version: java.lang.String,
    webkit: scala.Boolean
  ): Anon_Edge = {
    val __obj = js.Dynamic.literal(edge = edge, mozilla = mozilla, msie = msie, opera = opera, safari = safari, version = version, webkit = webkit)
  
    __obj.asInstanceOf[Anon_Edge]
  }
}

