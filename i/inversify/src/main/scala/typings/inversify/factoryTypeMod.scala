package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryTypeMod {
  
  @js.native
  sealed trait FactoryType extends StObject
  @JSImport("inversify/lib/utils/factory_type", "FactoryType")
  @js.native
  object FactoryType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FactoryType & String] = js.native
    
    @js.native
    sealed trait DynamicValue
      extends StObject
         with FactoryType
    /* "toDynamicValue" */ val DynamicValue: typings.inversify.factoryTypeMod.FactoryType.DynamicValue & String = js.native
    
    @js.native
    sealed trait Factory
      extends StObject
         with FactoryType
    /* "toFactory" */ val Factory: typings.inversify.factoryTypeMod.FactoryType.Factory & String = js.native
    
    @js.native
    sealed trait Provider
      extends StObject
         with FactoryType
    /* "toProvider" */ val Provider: typings.inversify.factoryTypeMod.FactoryType.Provider & String = js.native
  }
}
