package typings.lodashDecorators

import typings.lodashDecorators.applicatorsMod.Applicator
import typings.lodashDecorators.factoryCommonMod.InstanceChainData
import typings.lodashDecorators.factoryDecoratorConfigMod.DecoratorConfigOptions
import typings.lodashDecorators.utilsMod.CompositeKeyWeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("lodash-decorators/factory", "DecoratorConfig")
  @js.native
  open class DecoratorConfig protected ()
    extends typings.lodashDecorators.factoryDecoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @JSImport("lodash-decorators/factory", "DecoratorFactory")
  @js.native
  val DecoratorFactory: typings.lodashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators/factory", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @JSImport("lodash-decorators/factory", "InternalDecoratorFactory")
  @js.native
  open class InternalDecoratorFactory ()
    extends typings.lodashDecorators.factoryDecoratorFactoryMod.InternalDecoratorFactory
}
