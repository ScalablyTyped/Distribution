package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViterbiSearcher extends js.Object {
  
  def backward(lattice: ViterbiLattice): js.Array[ViterbiNode] = js.native
  
  var connection_costs: ConnectionCosts = js.native
  
  def forward(lattice: ViterbiLattice): ViterbiLattice = js.native
  
  def search(lattice: ViterbiLattice): js.Array[ViterbiNode] = js.native
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
  
  @scala.inline
  implicit class ViterbiSearcherOps[Self <: ViterbiSearcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackward(value: ViterbiLattice => js.Array[ViterbiNode]): Self = this.set("backward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnection_costs(value: ConnectionCosts): Self = this.set("connection_costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: ViterbiLattice => ViterbiLattice): Self = this.set("forward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: ViterbiLattice => js.Array[ViterbiNode]): Self = this.set("search", js.Any.fromFunction1(value))
  }
}
