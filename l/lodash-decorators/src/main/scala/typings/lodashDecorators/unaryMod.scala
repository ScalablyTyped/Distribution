package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedMethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryMod extends Shortcut {
  
  @JSImport("lodash-decorators/unary", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators/unary", "Unary")
  @js.native
  val Unary_ : BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators/unary", "unary")
  @js.native
  val unary: BiTypedMethodDecorator = js.native
  
  type _To = BiTypedMethodDecorator
  
  /* This means you don't have to write `default`, but can instead just say `unaryMod.foo` */
  override def _to: BiTypedMethodDecorator = default
}
