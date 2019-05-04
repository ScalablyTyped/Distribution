package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue")
@js.native
/**
  * Constructor for the value.
  *
  * @param initialValue: the starting value for the `ObservableValue`.
  */
class ObservableValue () extends IObservableValue {
  def this(initialValue: atPhosphorCoreutilsLib.libJsonMod.JSONValue) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _value: js.Any = js.native
  /**
    * The changed signal.
    */
  /* CompleteClass */
  override val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    IObservableValue, 
    atJupyterlabObservablesLib.libModeldbMod.ObservableValueNs.IChangedArgs
  ] = js.native
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ObservableValue: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabObservablesLib.libModeldbMod.ObservableValueNs.IChangedArgs] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The type of this object.
    */
  /* CompleteClass */
  override val `type`: ObservableType = js.native
  /**
    * The type of this object.
    */
  /* CompleteClass */
  @JSName("type")
  override val type_IObservableValue: atJupyterlabObservablesLib.atJupyterlabObservablesLibStrings.Value = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  /* CompleteClass */
  override def get(): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
  /**
    * Set the value.
    */
  /* CompleteClass */
  override def set(value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): scala.Unit = js.native
}

