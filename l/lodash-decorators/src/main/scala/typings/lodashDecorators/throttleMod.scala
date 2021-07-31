package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedDecorator2
import typings.lodashDecorators.sharedMod.ThrottleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleMod extends Shortcut {
  
  @JSImport("lodash-decorators/throttle", JSImport.Default)
  @js.native
  val default: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators/throttle", "ThrottleGetter")
  @js.native
  val ThrottleGetter_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators/throttle", "ThrottleSetter")
  @js.native
  val ThrottleSetter_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators/throttle", "Throttle")
  @js.native
  val Throttle_ : BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators/throttle", "throttle")
  @js.native
  val throttle: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators/throttle", "throttleGetter")
  @js.native
  val throttleGetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  @JSImport("lodash-decorators/throttle", "throttleSetter")
  @js.native
  val throttleSetter: BiTypedDecorator2[Double, ThrottleOptions] = js.native
  
  type _To = BiTypedDecorator2[Double, ThrottleOptions]
  
  /* This means you don't have to write `default`, but can instead just say `throttleMod.foo` */
  override def _to: BiTypedDecorator2[Double, ThrottleOptions] = default
}
