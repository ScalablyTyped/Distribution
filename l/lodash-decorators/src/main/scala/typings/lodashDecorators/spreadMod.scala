package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.factoryCommonMod.BiTypedMethodDecorator1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spreadMod extends Shortcut {
  
  @JSImport("lodash-decorators/spread", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators/spread", "Spread")
  @js.native
  val Spread_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators/spread", "spread")
  @js.native
  val spread: BiTypedMethodDecorator1[Double] = js.native
  
  type _To = BiTypedMethodDecorator1[Double]
  
  /* This means you don't have to write `default`, but can instead just say `spreadMod.foo` */
  override def _to: BiTypedMethodDecorator1[Double] = default
}
