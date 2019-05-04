package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * The type of this object.
    */
  val `type`: ObservableType
}

object IObservable {
  @scala.inline
  def apply(dispose: () => scala.Unit, isDisposed: scala.Boolean, `type`: ObservableType): IObservable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservable]
  }
}

