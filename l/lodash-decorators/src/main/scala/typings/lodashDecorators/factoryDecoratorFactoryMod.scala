package typings.lodashDecorators

import typings.lodashDecorators.factoryCommonMod.LodashDecorator
import typings.lodashDecorators.factoryDecoratorConfigMod.DecoratorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryDecoratorFactoryMod {
  
  @JSImport("lodash-decorators/factory/DecoratorFactory", "DecoratorFactory")
  @js.native
  val DecoratorFactory: InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators/factory/DecoratorFactory", "InternalDecoratorFactory")
  @js.native
  open class InternalDecoratorFactory () extends StObject {
    
    /* private */ def _isApplicable(context: Any, config: Any): Any = js.native
    
    /* private */ def _resolveDescriptor(target: Any, name: Any, descriptor: Any): Any = js.native
    
    def createDecorator(config: DecoratorConfig): GenericDecorator = js.native
    
    def createInstanceDecorator(config: DecoratorConfig): GenericDecorator = js.native
  }
  
  @js.native
  trait GenericDecorator extends StObject {
    
    def apply(args: Any*): LodashDecorator = js.native
  }
}
