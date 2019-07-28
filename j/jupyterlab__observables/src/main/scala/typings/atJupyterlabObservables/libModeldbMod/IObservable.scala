package typings.atJupyterlabObservables.libModeldbMod

import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable extends IDisposable {
  /**
    * The type of this object.
    */
  val `type`: ObservableType
}

object IObservable {
  @scala.inline
  def apply(dispose: () => Unit, isDisposed: Boolean, `type`: ObservableType): IObservable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservable]
  }
}

