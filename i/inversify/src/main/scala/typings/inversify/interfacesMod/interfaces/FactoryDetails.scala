package typings.inversify.interfacesMod.interfaces

import typings.inversify.factoryTypeMod.FactoryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FactoryDetails extends StObject {
  
  var factory: FactoryTypeFunction[Any] | Null
  
  var factoryType: FactoryType
}
object FactoryDetails {
  
  inline def apply(factoryType: FactoryType): FactoryDetails = {
    val __obj = js.Dynamic.literal(factoryType = factoryType.asInstanceOf[js.Any], factory = null)
    __obj.asInstanceOf[FactoryDetails]
  }
  
  extension [Self <: FactoryDetails](x: Self) {
    
    inline def setFactory(value: /* context */ Context => Any | js.Promise[Any]): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    inline def setFactoryType(value: FactoryType): Self = StObject.set(x, "factoryType", value.asInstanceOf[js.Any])
  }
}
