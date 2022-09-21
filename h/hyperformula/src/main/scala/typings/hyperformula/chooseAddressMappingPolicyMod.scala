package typings.hyperformula

import org.scalablytyped.runtime.Instantiable2
import typings.hyperformula.denseStrategyMod.DenseStrategy
import typings.hyperformula.iaddressmappingstrategyMod.AddressMappingStrategyConstructor
import typings.hyperformula.sparseStrategyMod.SparseStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chooseAddressMappingPolicyMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/AddressMapping/ChooseAddressMappingPolicy", "AlwaysDense")
  @js.native
  open class AlwaysDense ()
    extends StObject
       with ChooseAddressMapping {
    
    def call(): Instantiable2[/* width */ Double, /* height */ Double, DenseStrategy] = js.native
    /* CompleteClass */
    override def call(fill: Double): AddressMappingStrategyConstructor = js.native
  }
  
  @JSImport("hyperformula/typings/DependencyGraph/AddressMapping/ChooseAddressMappingPolicy", "AlwaysSparse")
  @js.native
  open class AlwaysSparse ()
    extends StObject
       with ChooseAddressMapping {
    
    def call(): Instantiable2[/* width */ Double, /* height */ Double, SparseStrategy] = js.native
    /* CompleteClass */
    override def call(fill: Double): AddressMappingStrategyConstructor = js.native
  }
  
  @JSImport("hyperformula/typings/DependencyGraph/AddressMapping/ChooseAddressMappingPolicy", "DenseSparseChooseBasedOnThreshold")
  @js.native
  open class DenseSparseChooseBasedOnThreshold protected ()
    extends StObject
       with ChooseAddressMapping {
    def this(threshold: Double) = this()
    
    /* CompleteClass */
    override def call(fill: Double): AddressMappingStrategyConstructor = js.native
    
    /* private */ val threshold: Any = js.native
  }
  
  trait ChooseAddressMapping extends StObject {
    
    def call(fill: Double): AddressMappingStrategyConstructor
  }
  object ChooseAddressMapping {
    
    inline def apply(call: Double => AddressMappingStrategyConstructor): ChooseAddressMapping = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
      __obj.asInstanceOf[ChooseAddressMapping]
    }
    
    extension [Self <: ChooseAddressMapping](x: Self) {
      
      inline def setCall(value: Double => AddressMappingStrategyConstructor): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
    }
  }
}
