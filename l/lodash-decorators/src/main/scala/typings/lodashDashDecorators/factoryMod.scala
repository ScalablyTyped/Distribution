package typings.lodashDashDecorators

import typings.lodashDashDecorators.applicatorsMod.Applicator
import typings.lodashDashDecorators.factoryCommonMod.InstanceChainData
import typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import typings.lodashDashDecorators.utilsMod.CompositeKeyWeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @js.native
  class DecoratorConfig protected ()
    extends typings.lodashDashDecorators.factoryDecoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typings.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory
  
  val DecoratorFactory: typings.lodashDashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory = js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
}

