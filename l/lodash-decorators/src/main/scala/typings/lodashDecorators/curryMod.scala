package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedMethodDecorator1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curryMod extends Shortcut {
  
  @JSImport("lodash-decorators/curry", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators/curry", "Curry")
  @js.native
  val Curry_ : BiTypedMethodDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators/curry", "curry")
  @js.native
  val curry: BiTypedMethodDecorator1[Double] = js.native
  
  type _To = BiTypedMethodDecorator1[Double]
  
  /* This means you don't have to write `default`, but can instead just say `curryMod.foo` */
  override def _to: BiTypedMethodDecorator1[Double] = default
}
