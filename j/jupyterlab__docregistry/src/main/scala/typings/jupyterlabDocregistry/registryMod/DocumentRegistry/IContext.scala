package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document context object.
  */
@js.native
trait IContext[T /* <: IModel */] extends IDisposable {
  
  /**
    * Add a sibling widget to the document manager.
    *
    * @param widget - The widget to add to the document manager.
    *
    * @param options - The desired options for adding the sibling.
    *
    * @returns A disposable used to remove the sibling if desired.
    *
    * #### Notes
    * It is assumed that the widget has the same model and context
    * as the original widget.
    */
  def addSibling(widget: Widget): IDisposable = js.native
  def addSibling(widget: Widget, options: IOpenOptions): IDisposable = js.native
  
  /**
    * The document metadata, stored as a services contents model.
    *
    * #### Notes
    * This will be null until the context is 'ready'. Since we only store
    * metadata here, the `.contents` attribute will always be empty.
    */
  val contentsModel: typings.jupyterlabServices.contentsMod.Contents.IModel | Null = js.native
  
  /**
    * Create a checkpoint for the file.
    *
    * @returns A promise which resolves with the new checkpoint model when the
    *   checkpoint is created.
    */
  def createCheckpoint(): js.Promise[ICheckpointModel] = js.native
  
  /**
    * Delete a checkpoint for the file.
    *
    * @param checkpointID - The id of the checkpoint to delete.
    *
    * @returns A promise which resolves when the checkpoint is deleted.
    */
  def deleteCheckpoint(checkpointID: String): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the context is disposed.
    */
  var disposed: ISignal[this.type, Unit] = js.native
  
  /**
    * Save the document to a different path chosen by the user.
    */
  def download(): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the contentsModel changes.
    */
  var fileChanged: ISignal[this.type, typings.jupyterlabServices.contentsMod.Contents.IModel] = js.native
  
  /**
    * Whether the context is ready.
    */
  val isReady: Boolean = js.native
  
  /**
    * List available checkpoints for the file.
    *
    * @returns A promise which resolves with a list of checkpoint models for
    *    the file.
    */
  def listCheckpoints(): js.Promise[js.Array[ICheckpointModel]] = js.native
  
  /**
    * The current local path associated with the document.
    * If the document is in the default notebook file browser,
    * this is the same as the path.
    */
  val localPath: String = js.native
  
  /**
    * The data model for the document.
    */
  val model: T = js.native
  
  /**
    * The current path associated with the document.
    */
  val path: String = js.native
  
  /**
    * A signal emitted when the path changes.
    */
  var pathChanged: ISignal[this.type, String] = js.native
  
  /**
    * A promise that is fulfilled when the context is ready.
    */
  val ready: js.Promise[Unit] = js.native
  
  /**
    * Restore the file to a known checkpoint state.
    *
    * @param checkpointID - The optional id of the checkpoint to restore,
    *   defaults to the most recent checkpoint.
    *
    * @returns A promise which resolves when the checkpoint is restored.
    */
  def restoreCheckpoint(): js.Promise[Unit] = js.native
  def restoreCheckpoint(checkpointID: String): js.Promise[Unit] = js.native
  
  /**
    * Revert the document contents to disk contents.
    */
  def revert(): js.Promise[Unit] = js.native
  
  /**
    * Save the document contents to disk.
    */
  def save(): js.Promise[Unit] = js.native
  
  /**
    * Save the document to a different path chosen by the user.
    */
  def saveAs(): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted on the start and end of a saving operation.
    */
  var saveState: ISignal[this.type, SaveState] = js.native
  
  /**
    * The session context object associated with the context.
    */
  val sessionContext: ISessionContext = js.native
  
  /**
    * The url resolver for the context.
    */
  val urlResolver: IResolver = js.native
}
