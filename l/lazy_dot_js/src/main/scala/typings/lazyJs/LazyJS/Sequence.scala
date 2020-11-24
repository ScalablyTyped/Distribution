package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequence[T] extends SequenceBase[T] {
  
  def each(eachFn: ValueCallback[T]): Sequence[T] = js.native
}
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@JSGlobal("LazyJS.Sequence")
@js.native
object Sequence extends js.Object
