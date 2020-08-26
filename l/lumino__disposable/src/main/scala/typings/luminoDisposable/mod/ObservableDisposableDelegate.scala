package typings.luminoDisposable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/disposable", "ObservableDisposableDelegate")
@js.native
class ObservableDisposableDelegate ()
  extends DisposableDelegate
     with IObservableDisposable {
  var _disposed: js.Any = js.native
}

