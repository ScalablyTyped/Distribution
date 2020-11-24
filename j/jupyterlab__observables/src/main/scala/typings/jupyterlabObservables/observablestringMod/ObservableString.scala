package typings.jupyterlabObservables.observablestringMod

import typings.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/observables/lib/observablestring", "ObservableString")
@js.native
/**
  * Construct a new observable string.
  */
class ObservableString () extends IObservableString {
  def this(initialText: String) = this()
  
  var _changed: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _text: js.Any = js.native
  
  /**
    * A signal emitted when the string has changed.
    */
  @JSName("changed")
  def changed_MObservableString: ISignal[this.type, IChangedArgs] = js.native
  
  /**
    * Test whether the string has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableString: Boolean = js.native
  
  /**
    * Get the value of the string.
    */
  @JSName("text")
  def text_MObservableString: String = js.native
  
  /**
    * The type of the Observable.
    */
  @JSName("type")
  def type_MObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
}
