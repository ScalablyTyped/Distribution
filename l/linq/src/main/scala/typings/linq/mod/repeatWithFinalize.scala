package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("linq", "repeatWithFinalize")
@js.native
object repeatWithFinalize extends js.Object {
  
  def apply[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, Unit]): IEnumerable[T] = js.native
}
