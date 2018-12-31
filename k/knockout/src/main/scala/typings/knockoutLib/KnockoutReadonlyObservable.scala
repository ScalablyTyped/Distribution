package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * While all observable are writable at runtime, this type is analogous to the native ReadonlyArray type:
  * casting an observable to this type expresses the intention that this observable shouldn't be mutated.
  */
@js.native
trait KnockoutReadonlyObservable[T]
  extends KnockoutSubscribable[T]
     with KnockoutObservableFunctions[T] {
  var valueHasMutated: js.UndefOr[Anon_Void] = js.native
  var valueWillMutate: js.UndefOr[Anon_Void] = js.native
  def apply(): T = js.native
  /**
    * Returns the current value of the computed observable without creating a dependency
    */
  def peek(): T = js.native
}

