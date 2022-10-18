package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.factoryCommonMod.BiTypedMethodDecorator1
import typings.lodashDecorators.sharedMod.MemoizeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizeAllMod extends Shortcut {
  
  @JSImport("lodash-decorators/memoizeAll", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[Any, Any])] = js.native
  
  @JSImport("lodash-decorators/memoizeAll", "MemoizeAll")
  @js.native
  val MemoizeAll_ : BiTypedMethodDecorator1[js.Function | (MemoizeConfig[Any, Any])] = js.native
  
  @JSImport("lodash-decorators/memoizeAll", "memoizeAll")
  @js.native
  val memoizeAll: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[Any, Any])] = js.native
  
  type _To = BiTypedMethodDecorator1[js.Function | (MemoizeConfig[Any, Any])]
  
  /* This means you don't have to write `default`, but can instead just say `memoizeAllMod.foo` */
  override def _to: BiTypedMethodDecorator1[js.Function | (MemoizeConfig[Any, Any])] = default
}
