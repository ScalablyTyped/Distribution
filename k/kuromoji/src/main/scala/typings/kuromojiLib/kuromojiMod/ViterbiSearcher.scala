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

