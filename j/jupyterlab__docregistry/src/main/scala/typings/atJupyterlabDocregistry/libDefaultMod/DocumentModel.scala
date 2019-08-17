package typings.atJupyterlabDocregistry.libDefaultMod

import typings.atJupyterlabCodeeditor.libMod.CodeEditorNs.Model
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.ICodeModel because var conflicts: mimeType, mimeTypeChanged. Inlined  */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel () extends Model {
  def this(languagePreference: String) = this()
  def this(languagePreference: String, modelDB: IModelDB) = this()
  var _contentChanged: js.Any = js.native
  var _defaultLang: js.Any = js.native
  var _dirty: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * A signal emitted when the document content changes.
    */
  val contentChanged: ISignal[this.type, Unit] = js.native
  /**
    * The default kernel language of the document.
    *
    * #### Notes
    * This is a read-only property.
    */
  val defaultKernelLanguage: String = js.native
  /**
    * The default kernel name of the document.
    *
    * #### Notes
    * This is a read-only property.
    */
  val defaultKernelName: String = js.native
  /**
    * The dirty state of the document.
    */
  var dirty: Boolean = js.native
  /**
    * The read only state of the document.
    */
  var readOnly: Boolean = js.native
  /**
    * A signal emitted when the document state changes.
    */
  val stateChanged: ISignal[this.type, IChangedArgs[_]] = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: JSONValue): Unit = js.native
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromString(value: String): Unit = js.native
  /**
    * Initialize the model with its current state.
    */
  def initialize(): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONValue = js.native
  /**
    * Trigger a content changed signal.
    */
  /* protected */ def triggerContentChange(): Unit = js.native
  /**
    * Trigger a state change signal.
    */
  /* protected */ def triggerStateChange(args: IChangedArgs[_]): Unit = js.native
}

