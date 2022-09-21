package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedMethodDecorator1
import typings.lodashDecorators.sharedMod.MemoizeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizeMod extends Shortcut {
  
  @JSImport("lodash-decorators/memoize", JSImport.Default)
  @js.native
  val default: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[Any, Any])] = js.native
  
  @JSImport("lodash-decorators/memoize", "Memoize")
  @js.native
  val Memoize_ : BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[Any, Any])] = js.native
  
  @JSImport("lodash-decorators/memoize", "memoize")
  @js.native
  val memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[Any, Any])] = js.native
  
  type _To = BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[Any, Any])]
  
  /* This means you don't have to write `default`, but can instead just say `memoizeMod.foo` */
  override def _to: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[Any, Any])] = default
}
