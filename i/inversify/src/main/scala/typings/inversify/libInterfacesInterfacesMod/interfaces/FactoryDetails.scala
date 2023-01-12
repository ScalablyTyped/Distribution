package typings.inversify.libInterfacesInterfacesMod.interfaces

import typings.inversify.libUtilsFactoryTypeMod.FactoryType
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FactoryDetails] (val x: Self) extends AnyVal {
    
    inline def setFactory(value: /* context */ Context => Any | js.Promise[Any]): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    inline def setFactoryType(value: FactoryType): Self = StObject.set(x, "factoryType", value.asInstanceOf[js.Any])
  }
}
