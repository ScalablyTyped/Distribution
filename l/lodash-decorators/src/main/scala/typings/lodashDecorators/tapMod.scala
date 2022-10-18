package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.factoryCommonMod.BiTypedMethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapMod extends Shortcut {
  
  @JSImport("lodash-decorators/tap", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators/tap", "Tap")
  @js.native
  val Tap_ : BiTypedMethodDecorator = js.native
  
  @JSImport("lodash-decorators/tap", "tap")
  @js.native
  val tap: BiTypedMethodDecorator = js.native
  
  type _To = BiTypedMethodDecorator
  
  /* This means you don't have to write `default`, but can instead just say `tapMod.foo` */
  override def _to: BiTypedMethodDecorator = default
}
