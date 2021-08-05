package typings.lodashDecorators

import typings.lodashDecorators.applicatorsMod.Applicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorConfigMod {
  
  @JSImport("lodash-decorators/factory/DecoratorConfig", "DecoratorConfig")
  @js.native
  class DecoratorConfig protected () extends StObject {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
    
    val applicator: Applicator = js.native
    
    val bound: Boolean = js.native
    
    val execute: js.Function = js.native
    
    val getter: Boolean = js.native
    
    val method: Boolean = js.native
    
    val optionalParams: Boolean = js.native
    
    val options: DecoratorConfigOptions = js.native
    
    val property: Boolean = js.native
    
    val setter: Boolean = js.native
  }
  
  trait DecoratorConfigOptions extends StObject {
    
    var bound: js.UndefOr[Boolean] = js.undefined
    
    var getter: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[Boolean] = js.undefined
    
    var optionalParams: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[Boolean] = js.undefined
    
    var setter: js.UndefOr[Boolean] = js.undefined
  }
  object DecoratorConfigOptions {
    
    inline def apply(): DecoratorConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratorConfigOptions]
    }
    
    extension [Self <: DecoratorConfigOptions](x: Self) {
      
      inline def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
      
      inline def setGetter(value: Boolean): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      inline def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOptionalParams(value: Boolean): Self = StObject.set(x, "optionalParams", value.asInstanceOf[js.Any])
      
      inline def setOptionalParamsUndefined: Self = StObject.set(x, "optionalParams", js.undefined)
      
      inline def setProperty(value: Boolean): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setSetter(value: Boolean): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
      
      inline def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
    }
  }
}
