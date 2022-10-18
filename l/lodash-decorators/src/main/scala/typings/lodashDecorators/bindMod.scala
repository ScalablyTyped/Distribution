package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.factoryCommonMod.BiTypedMethodDecorator1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod extends Shortcut {
  
  @JSImport("lodash-decorators/bind", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator1[Any] = js.native
  
  @JSImport("lodash-decorators/bind", "Bind")
  @js.native
  val Bind_ : BiTypedMethodDecorator1[Any] = js.native
  
  @JSImport("lodash-decorators/bind", "bind")
  @js.native
  val bind: BiTypedMethodDecorator1[Any] = js.native
  
  type _To = BiTypedMethodDecorator1[Any]
  
  /* This means you don't have to write `default`, but can instead just say `bindMod.foo` */
  override def _to: BiTypedMethodDecorator1[Any] = default
}
