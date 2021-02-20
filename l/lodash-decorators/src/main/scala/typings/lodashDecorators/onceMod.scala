package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onceMod extends Shortcut {
  
  @JSImport("lodash-decorators/once", JSImport.Default)
  @js.native
  val default: BiTypedDecorator = js.native
  
  @JSImport("lodash-decorators/once", "Once")
  @js.native
  val Once_ : BiTypedDecorator = js.native
  
  @JSImport("lodash-decorators/once", "once")
  @js.native
  val once: BiTypedDecorator = js.native
  
  type _To = BiTypedDecorator
  
  /* This means you don't have to write `default`, but can instead just say `onceMod.foo` */
  override def _to: BiTypedDecorator = default
}
