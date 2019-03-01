package typings
package jsgraphLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dirgaph extends js.Object {
  var dirgaph: jsgraphLib.jsgraphMod.jsgraphNs.DirectedGraph
}

object Anon_Dirgaph {
  @scala.inline
  def apply(dirgaph: jsgraphLib.jsgraphMod.jsgraphNs.DirectedGraph): Anon_Dirgaph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dirgaph")(dirgaph)
    __obj.asInstanceOf[Anon_Dirgaph]
  }
}

