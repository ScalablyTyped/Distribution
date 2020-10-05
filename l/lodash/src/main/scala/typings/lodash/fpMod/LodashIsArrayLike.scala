package typings.lodash.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashIsArrayLike extends LodashConvertible {
  def apply(): /* is never */ Boolean = js.native
  def apply(value: js.Any): /* is lodash.anon.Length */ Boolean = js.native
  def apply(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  def apply[T](value: T with String with Double): Boolean = js.native
}

