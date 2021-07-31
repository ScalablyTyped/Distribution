package typings.lodashDecorators

import typings.lodashDecorators.applicatorsMod.Applicator
import typings.lodashDecorators.commonMod.InstanceChainData
import typings.lodashDecorators.decoratorConfigMod.DecoratorConfigOptions
import typings.lodashDecorators.utilsMod.CompositeKeyWeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("lodash-decorators/factory", "DecoratorConfig")
  @js.native
  class DecoratorConfig protected ()
    extends typings.lodashDecorators.decoratorConfigMod.DecoratorConfig {
    def this(execute: js.Function, applicator: Applicator) = this()
    def this(execute: js.Function, applicator: Applicator, options: DecoratorConfigOptions) = this()
  }
  
  @JSImport("lodash-decorators/factory", "DecoratorFactory")
  @js.native
  val DecoratorFactory: typings.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory = js.native
  
  @JSImport("lodash-decorators/factory", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @JSImport("lodash-decorators/factory", "InternalDecoratorFactory")
  @js.native
  class InternalDecoratorFactory ()
    extends typings.lodashDecorators.decoratorFactoryMod.InternalDecoratorFactory
}
