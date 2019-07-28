package typings.knockout

import typings.knockout.knockoutStrings.arrayChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * While all observable arrays are writable at runtime, this type is analogous to the native ReadonlyArray type:
  * casting an observable array to this type expresses the intention that it shouldn't be mutated.
  */
@js.native
trait KnockoutReadonlyObservableArray[T]
  extends KnockoutReadonlyObservable[js.Array[T]]
     with KnockoutReadonlyObservableArrayFunctions[T] {
  // NOTE: Keep in sync with KnockoutObservableArray<T>, see note on KnockoutObservableArray<T>
  @JSName("subscribe")
  def subscribe_arrayChange(
    callback: js.Function1[/* newValue */ js.Array[KnockoutArrayChange[T]], Unit],
    target: js.Any,
    event: arrayChange
  ): KnockoutSubscription = js.native
}

