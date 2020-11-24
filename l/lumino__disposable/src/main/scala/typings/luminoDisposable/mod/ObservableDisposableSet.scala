package typings.luminoDisposable.mod

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/disposable", "ObservableDisposableSet")
@js.native
class ObservableDisposableSet ()
  extends DisposableSet
     with IObservableDisposable {
  
  var _disposed: js.Any = js.native
}
@JSImport("@lumino/disposable", "ObservableDisposableSet")
@js.native
object ObservableDisposableSet extends js.Object {
  
  /**
    * Create an observable disposable set from an iterable of items.
    *
    * @param items - The iterable or array-like object of interest.
    *
    * @returns A new disposable initialized with the given items.
    */
  def from(items: IterableOrArrayLike[IDisposable]): ObservableDisposableSet = js.native
}
