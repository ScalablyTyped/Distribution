package typings.jupyterlabObservables.modeldbMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typings.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoSignaling.mod.ISignal
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
    * The changed signal.
    */
  @JSName("changed")
  def changed_MObservableValue(): ISignal[this.type, IChangedArgs] = js.native
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
  override def get(): js.UndefOr[PartialJSONValue] = js.native
  /**
    * Whether the value has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableValue(): Boolean = js.native
  /**
    * Set the value.
    */
  /* CompleteClass */
  override def set(value: PartialJSONValue): Unit = js.native
  /**
    * The observable type.
    */
  @JSName("type")
  def type_MObservableValue(): Value = js.native
}

@JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue")
@js.native
object ObservableValue extends js.Object {
  /**
    * The changed args object emitted by the `IObservableValue`.
    */
  @js.native
  class IChangedArgs () extends js.Object {
    /**
      * The new value.
      */
    var newValue: js.UndefOr[JSONValue] = js.native
    /**
      * The old value.
      */
    var oldValue: js.UndefOr[JSONValue] = js.native
  }
  
}

