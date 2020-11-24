package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("linq", "unfold")
@js.native
object unfold extends js.Object {
  
  def apply[T](seed: T, func: js.Function1[/* value */ T, T]): IEnumerable[T] = js.native
}
