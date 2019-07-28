package typings.atJupyterlabObservables.libModeldbMod

import typings.atJupyterlabObservables.atJupyterlabObservablesStrings.Value
import typings.atJupyterlabObservables.libModeldbMod.ObservableValueNs.IChangedArgs
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
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
  def this(initialValue: JSONValue) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _value: js.Any = js.native
  /**
    * The changed signal.
    */
  /* CompleteClass */
  override val changed: ISignal[IObservableValue, IChangedArgs] = js.native
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ObservableValue: ISignal[this.type, IChangedArgs] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
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
  override val type_IObservableValue: Value = js.native
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
  override def dispose(): Unit = js.native
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  /* CompleteClass */
  override def get(): js.UndefOr[JSONValue] = js.native
  /**
    * Set the value.
    */
  /* CompleteClass */
  override def set(value: JSONValue): Unit = js.native
}

