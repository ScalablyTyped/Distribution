package typings.jupyterlabObservables.modeldbMod

import typings.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typings.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSName("changed")
  def changed_MObservableValue: ISignal[this.type, IChangedArgs] = js.native
  
  /**
    * Whether the value has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableValue: Boolean = js.native
  
  /**
    * The observable type.
    */
  @JSName("type")
  def type_MObservableValue: Value = js.native
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
