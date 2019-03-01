package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiLattice extends js.Object {
  def append(node: ViterbiNode): scala.Unit
  def appendEos(): scala.Unit
}

object ViterbiLattice {
  @scala.inline
  def apply(append: js.Function1[ViterbiNode, scala.Unit], appendEos: js.Function0[scala.Unit]): ViterbiLattice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(append)
    __obj.updateDynamic("appendEos")(appendEos)
    __obj.asInstanceOf[ViterbiLattice]
  }
}

