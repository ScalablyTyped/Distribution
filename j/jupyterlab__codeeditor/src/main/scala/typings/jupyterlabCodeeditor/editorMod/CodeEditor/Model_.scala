package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of the editor model.
  */
@JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.Model")
@js.native
/**
  * Construct a new Model.
  */
class Model_ () extends IModel {
  def this(options: typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions) = this()
  
  var _isDisposed: js.Any = js.native
  
  var _mimeTypeChanged: js.Any = js.native
  
  var _onMimeTypeChanged: js.Any = js.native
  
  /**
    * Whether the model is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MModel_ : Boolean = js.native
  
  /**
    * A signal emitted when a mimetype changes.
    */
  @JSName("mimeTypeChanged")
  def mimeTypeChanged_MModel_ : ISignal[this.type, IChangedArgs[String, String, String]] = js.native
  
  /**
    * A mime type of the model.
    */
  @JSName("mimeType")
  def mimeType_MModel_ : String = js.native
  
  /**
    * Get the selections for the model.
    */
  @JSName("selections")
  def selections_MModel_ : IObservableMap[js.Array[ITextSelection]] = js.native
  
  /**
    * Get the value of the model.
    */
  @JSName("value")
  def value_MModel_ : IObservableString = js.native
}
