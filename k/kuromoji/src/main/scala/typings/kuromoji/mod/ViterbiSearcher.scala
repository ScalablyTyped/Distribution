package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViterbiSearcher extends StObject {
  
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
  implicit class ViterbiSearcherMutableBuilder[Self <: ViterbiSearcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackward(value: ViterbiLattice => js.Array[ViterbiNode]): Self = StObject.set(x, "backward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnection_costs(value: ConnectionCosts): Self = StObject.set(x, "connection_costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: ViterbiLattice => ViterbiLattice): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: ViterbiLattice => js.Array[ViterbiNode]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
  }
}
