package typings
package kuromojiLib.kuromojiMod

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
    backward: js.Function1[ViterbiLattice, js.Array[ViterbiNode]],
    connection_costs: ConnectionCosts,
    forward: js.Function1[ViterbiLattice, ViterbiLattice],
    search: js.Function1[ViterbiLattice, js.Array[ViterbiNode]]
  ): ViterbiSearcher = {
    val __obj = js.Dynamic.literal(backward = backward, connection_costs = connection_costs, forward = forward, search = search)
  
    __obj.asInstanceOf[ViterbiSearcher]
  }
}

