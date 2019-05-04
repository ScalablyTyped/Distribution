package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableValue extends IObservable {
  /**
    * The changed signal.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    IObservableValue, 
    atJupyterlabObservablesLib.libModeldbMod.ObservableValueNs.IChangedArgs
  ]
  /**
    * The type of this object.
    */
  @JSName("type")
  val type_IObservableValue: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Value
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  def get(): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  /**
    * Set the value.
    */
  def set(value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): scala.Unit
}

object IObservableValue {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IObservableValue, 
      atJupyterlabObservablesLib.libModeldbMod.ObservableValueNs.IChangedArgs
    ],
    dispose: () => scala.Unit,
    get: () => js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    isDisposed: scala.Boolean,
    set: atPhosphorCoreutilsLib.libJsonMod.JSONValue => scala.Unit,
    `type`: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Value
  ): IObservableValue = {
    val __obj = js.Dynamic.literal(changed = changed, dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction0(get), isDisposed = isDisposed, set = js.Any.fromFunction1(set))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObservableValue]
  }
}

