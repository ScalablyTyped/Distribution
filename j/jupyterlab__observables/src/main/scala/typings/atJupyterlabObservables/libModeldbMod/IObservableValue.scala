package typings.atJupyterlabObservables.libModeldbMod

import typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Value
import typings.atJupyterlabObservables.libModeldbMod.ObservableValue.IChangedArgs
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableValue extends IObservable {
  /**
    * The changed signal.
    */
  val changed: ISignal[IObservableValue, IChangedArgs]
  /**
    * The type of this object.
    */
  @JSName("type")
  val type_IObservableValue: Value
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  def get(): js.UndefOr[JSONValue]
  /**
    * Set the value.
    */
  def set(value: JSONValue): Unit
}

object IObservableValue {
  @scala.inline
  def apply(
    changed: ISignal[IObservableValue, IChangedArgs],
    dispose: () => Unit,
    get: () => js.UndefOr[JSONValue],
    isDisposed: Boolean,
    set: JSONValue => Unit,
    `type`: Value
  ): IObservableValue = {
    val __obj = js.Dynamic.literal(changed = changed, dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction0(get), isDisposed = isDisposed, set = js.Any.fromFunction1(set))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableValue]
  }
}

