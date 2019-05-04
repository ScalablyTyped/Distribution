package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any
- Dropped any */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel () extends js.Object {
  def this(languagePreference: java.lang.String) = this()
  def this(languagePreference: java.lang.String, modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB) = this()
  var _contentChanged: js.Any = js.native
  var _defaultLang: js.Any = js.native
  var _dirty: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * A signal emitted when the document content changes.
    */
  val contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The default kernel language of the document.
    *
    * #### Notes
    * This is a read-only property.
    */
  val defaultKernelLanguage: java.lang.String = js.native
  /**
    * The default kernel name of the document.
    *
    * #### Notes
    * This is a read-only property.
    */
  val defaultKernelName: java.lang.String = js.native
  /**
    * The dirty state of the document.
    */
  var dirty: scala.Boolean = js.native
  /**
    * The read only state of the document.
    */
  var readOnly: scala.Boolean = js.native
  /**
    * A signal emitted when the document state changes.
    */
  val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]] = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): scala.Unit = js.native
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromString(value: java.lang.String): scala.Unit = js.native
  /**
    * Initialize the model with its current state.
    */
  def initialize(): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atPhosphorCoreutilsLib.libJsonMod.JSONValue = js.native
  /**
    * Trigger a content changed signal.
    */
  /* protected */ def triggerContentChange(): scala.Unit = js.native
  /**
    * Trigger a state change signal.
    */
  /* protected */ def triggerStateChange(args: atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]): scala.Unit = js.native
}

