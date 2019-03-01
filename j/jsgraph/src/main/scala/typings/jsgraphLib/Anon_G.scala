package typings
package jsgraphLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_G extends js.Object {
  var g: jsgraphLib.jsgraphMod.jsgraphNs.DirectedGraph
  var u: java.lang.String
}

object Anon_G {
  @scala.inline
  def apply(g: jsgraphLib.jsgraphMod.jsgraphNs.DirectedGraph, u: java.lang.String): Anon_G = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("u")(u)
    __obj.asInstanceOf[Anon_G]
  }
}

