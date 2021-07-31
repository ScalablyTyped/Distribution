package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedDecorator1
import typings.lodashDecorators.commonMod.ResolvableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object negateMod extends Shortcut {
  
  @JSImport("lodash-decorators/negate", JSImport.Default)
  @js.native
  val default: BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSImport("lodash-decorators/negate", "Negate")
  @js.native
  val Negate_ : BiTypedDecorator1[ResolvableFunction] = js.native
  
  @JSImport("lodash-decorators/negate", "negate")
  @js.native
  val negate: BiTypedDecorator1[ResolvableFunction] = js.native
  
  type _To = BiTypedDecorator1[ResolvableFunction]
  
  /* This means you don't have to write `default`, but can instead just say `negateMod.foo` */
  override def _to: BiTypedDecorator1[ResolvableFunction] = default
}
