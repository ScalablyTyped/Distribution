package typings.lodash.fpMod

import typings.lodash.anon.LodashAnyHack
import typings.lodash.mod.FunctionBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashIsArrayLikeObject extends js.Object {
  
  def apply(): /* is never */ Boolean = js.native
  def apply(value: String): /* is never */ Boolean = js.native
  def apply(value: js.Any): Boolean = js.native
  def apply(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  def apply(value: Boolean): /* is never */ Boolean = js.native
  def apply(value: Double): /* is never */ Boolean = js.native
  def apply(value: FunctionBase): /* is never */ Boolean = js.native
  def apply[T /* <: LodashAnyHack */](value: T): Boolean = js.native
}
