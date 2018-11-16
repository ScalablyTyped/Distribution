package typings
package indefiniteDashObservableLib.distIndefiniteObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndefiniteObservable[T]
  extends indefiniteDashObservableLib.distTypesMod.Observable[T] {
  @JSName("_connect")
  var _connect_Original: indefiniteDashObservableLib.distTypesMod.Connect[T] = js.native
  def _connect(observer: indefiniteDashObservableLib.distTypesMod.Observer[T]): indefiniteDashObservableLib.distTypesMod.Disconnect = js.native
}

