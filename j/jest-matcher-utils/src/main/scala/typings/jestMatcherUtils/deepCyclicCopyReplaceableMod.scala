package typings.jestMatcherUtils

import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-matcher-utils/build/deepCyclicCopyReplaceable", JSImport.Namespace)
@js.native
object deepCyclicCopyReplaceableMod extends js.Object {
  
  def default[T](value: T): T = js.native
  def default[T](value: T, cycles: WeakMap[_, _]): T = js.native
}
