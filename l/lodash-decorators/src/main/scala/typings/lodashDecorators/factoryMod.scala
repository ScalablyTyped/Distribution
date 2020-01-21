package typings.lodashDecorators

import typings.lodashDecorators.applicatorsMod.Applicator
import typings.lodashDecorators.commonMod.InstanceChainData
import typings.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typings.lodashDecorators.utilsMod.CompositeKeyWeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @js.native
  class DecoratorConfig protected ()
    extends typings.lodashDecorators.decoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @js.native
  class InternalDecoratorFactory ()
    extends typings.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory
  
  val DecoratorFactory: typings.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
}

