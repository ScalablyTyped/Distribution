package typings.jupyterlabDocregistry.defaultMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typings.jupyterlabCodeeditor.mod.CodeEditor.Model
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel ()
  extends Model
     with IModel {
  def this(languagePreference: String) = this()
  def this(languagePreference: js.UndefOr[scala.Nothing], modelDB: IModelDB) = this()
  def this(languagePreference: String, modelDB: IModelDB) = this()
  
  var _contentChanged: js.Any = js.native
  
  var _defaultLang: js.Any = js.native
  
  var _dirty: js.Any = js.native
  
  var _readOnly: js.Any = js.native
  
  var _stateChanged: js.Any = js.native
  
  /**
    * A signal emitted when the document content changes.
    */
  @JSName("contentChanged")
  def contentChanged_MDocumentModel: ISignal[this.type, Unit] = js.native
  
  /**
    * The default kernel language of the document.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("defaultKernelLanguage")
  def defaultKernelLanguage_MDocumentModel: String = js.native
  
  /**
    * The default kernel name of the document.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("defaultKernelName")
  def defaultKernelName_MDocumentModel: String = js.native
  
  /**
    * The dirty state of the document.
    */
  @JSName("dirty")
  def dirty_MDocumentModel: Boolean = js.native
  
  /**
    * Whether the model is disposed.
    */
  /* InferMemberOverrides */
  @JSName("isDisposed")
  override def isDisposed_MModel_ : Boolean = js.native
  
  /**
    * A signal emitted when a mimetype changes.
    */
  /* InferMemberOverrides */
  @JSName("mimeTypeChanged")
  override def mimeTypeChanged_MModel_ : ISignal[this.type, IChangedArgs[String, String, String]] = js.native
  
  /**
    * A mime type of the model.
    */
  /* InferMemberOverrides */
  @JSName("mimeType")
  override def mimeType_MModel_ : String = js.native
  
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  /* InferMemberOverrides */
  override val modelDB: IModelDB = js.native
  
  /**
    * The read only state of the document.
    */
  @JSName("readOnly")
  def readOnly_MDocumentModel: Boolean = js.native
  
  /**
    * Get the selections for the model.
    */
  /* InferMemberOverrides */
  @JSName("selections")
  override def selections_MModel_ : IObservableMap[js.Array[ITextSelection]] = js.native
  
  /**
    * A signal emitted when the document state changes.
    */
  @JSName("stateChanged")
  def stateChanged_MDocumentModel: ISignal[this.type, IChangedArgs[_, _, String]] = js.native
  
  /**
    * Trigger a content changed signal.
    */
  /* protected */ def triggerContentChange(): Unit = js.native
  
  /**
    * Trigger a state change signal.
    */
  /* protected */ def triggerStateChange(args: IChangedArgs[_, _, String]): Unit = js.native
  
  /**
    * Get the value of the model.
    */
  /* InferMemberOverrides */
  @JSName("value")
  override def value_MModel_ : IObservableString = js.native
}
