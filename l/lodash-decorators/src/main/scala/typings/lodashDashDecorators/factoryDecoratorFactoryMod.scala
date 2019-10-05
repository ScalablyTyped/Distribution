package typings.lodashDashDecorators

import typings.lodashDashDecorators.factoryCommonMod.LodashDecorator
import typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfig
import typings.lodashDashDecorators.factoryDecoratorFactoryMod.GenericDecorator
import typings.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory/DecoratorFactory", JSImport.Namespace)
@js.native
object factoryDecoratorFactoryMod extends js.Object {
  @js.native
  class InternalDecoratorFactory () extends js.Object {
    /* private */ def _isApplicable(context: js.Any, config: js.Any): js.Any = js.native
    /* private */ def _resolveDescriptor(target: js.Any, name: js.Any): js.Any = js.native
    /* private */ def _resolveDescriptor(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
    def createDecorator(config: DecoratorConfig): GenericDecorator = js.native
    def createInstanceDecorator(config: DecoratorConfig): GenericDecorator = js.native
  }
  
  val DecoratorFactory: InternalDecoratorFactory = js.native
  type GenericDecorator = js.Function1[/* repeated */ js.Any, LodashDecorator]
}

