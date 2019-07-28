package typings.lodashDashDecorators.factoryDecoratorFactoryMod

import typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory/DecoratorFactory", "InternalDecoratorFactory")
@js.native
class InternalDecoratorFactory () extends js.Object {
  /* private */ def _isApplicable(context: js.Any, config: js.Any): js.Any = js.native
  /* private */ def _resolveDescriptor(target: js.Any, name: js.Any): js.Any = js.native
  /* private */ def _resolveDescriptor(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
  def createDecorator(config: DecoratorConfig): GenericDecorator = js.native
  def createInstanceDecorator(config: DecoratorConfig): GenericDecorator = js.native
}

