package typings.jestMatcherUtils

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCyclicCopyReplaceableMod {
  
  @JSImport("jest-matcher-utils/build/deepCyclicCopyReplaceable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](value: T, cycles: WeakMap[js.Any, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
}
