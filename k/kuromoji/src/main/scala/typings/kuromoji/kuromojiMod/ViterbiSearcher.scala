package typings.kuromoji.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiSearcher extends js.Object {
  var connection_costs: ConnectionCosts
  def backward(lattice: ViterbiLattice): js.Array[ViterbiNode]
  def forward(lattice: ViterbiLattice): ViterbiLattice
  def search(lattice: ViterbiLattice): js.Array[ViterbiNode]
}

object ViterbiSearcher {
  @scala.inline
  def apply(
    backward: ViterbiLattice => js.Array[ViterbiNode],
    connection_costs: ConnectionCosts,
    forward: ViterbiLattice => ViterbiLattice,
    search: ViterbiLattice => js.Array[ViterbiNode]
  ): ViterbiSearcher = {
    val __obj = js.Dynamic.literal(backward = js.Any.fromFunction1(backward), connection_costs = connection_costs.asInstanceOf[js.Any], forward = js.Any.fromFunction1(forward), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ViterbiSearcher]
  }
}

