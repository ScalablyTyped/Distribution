package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of the editor model.
  */
@JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.Model")
@js.native
/**
  * Construct a new Model.
  */
class Model_ () extends IModel {
  def this(options: typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Model.IOptions) = this()
  var _isDisposed: js.Any = js.native
  var _mimeTypeChanged: js.Any = js.native
  var _onMimeTypeChanged: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A mime type of the model.
    *
    * #### Notes
    * It is never `null`, the default mime type is `text/plain`.
    */
  /* CompleteClass */
  override var mimeType: String = js.native
  /**
    * A signal emitted when a property changes.
    */
  /* CompleteClass */
  override var mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String]] = js.native
  /**
    * A signal emitted when a mimetype changes.
    */
  @JSName("mimeTypeChanged")
  val mimeTypeChanged_Model_ : ISignal[this.type, IChangedArgs[String, String]] = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  /* CompleteClass */
  override val modelDB: IModelDB = js.native
  /**
    * The currently selected code.
    */
  /* CompleteClass */
  override val selections: IObservableMap[js.Array[ITextSelection]] = js.native
  /**
    * The text stored in the model.
    */
  /* CompleteClass */
  override val value: IObservableString = js.native
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
}

