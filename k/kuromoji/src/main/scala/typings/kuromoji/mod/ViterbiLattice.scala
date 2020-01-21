package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiLattice extends js.Object {
  def append(node: ViterbiNode): Unit
  def appendEos(): Unit
}

object ViterbiLattice {
  @scala.inline
  def apply(append: ViterbiNode => Unit, appendEos: () => Unit): ViterbiLattice = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendEos = js.Any.fromFunction0(appendEos))
  
    __obj.asInstanceOf[ViterbiLattice]
  }
}

