package typings.jupyterlabServices.contentsMod.Contents

import typings.jupyterlabObservables.modeldbMod.ModelDB.IFactory
import typings.jupyterlabServices.anon.PartialIModel
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a network drive that can be mounted
  * in the contents manager.
  */
@js.native
trait IDrive extends IDisposable {
  
  /**
    * Copy a file into a given directory.
    *
    * @param localPath - The original file path.
    *
    * @param toLocalDir - The destination directory path.
    *
    * @returns A promise which resolves with the new content model when the
    *  file is copied.
    */
  def copy(localPath: String, toLocalDir: String): js.Promise[IModel] = js.native
  
  /**
    * Create a checkpoint for a file.
    *
    * @param localPath - The path of the file.
    *
    * @returns A promise which resolves with the new checkpoint model when the
    *   checkpoint is created.
    */
  def createCheckpoint(localPath: String): js.Promise[ICheckpointModel] = js.native
  
  /**
    * Delete a file.
    *
    * @param localPath - The path to the file.
    *
    * @returns A promise which resolves when the file is deleted.
    */
  def delete(localPath: String): js.Promise[Unit] = js.native
  
  /**
    * Delete a checkpoint for a file.
    *
    * @param localPath - The path of the file.
    *
    * @param checkpointID - The id of the checkpoint to delete.
    *
    * @returns A promise which resolves when the checkpoint is deleted.
    */
  def deleteCheckpoint(localPath: String, checkpointID: String): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when a file operation takes place.
    */
  var fileChanged: ISignal[IDrive, IChangedArgs] = js.native
  
  /**
    * Get a file or directory.
    *
    * @param localPath: The path to the file.
    *
    * @param options: The options used to fetch the file.
    *
    * @returns A promise which resolves with the file content.
    */
  def get(localPath: String): js.Promise[IModel] = js.native
  def get(localPath: String, options: IFetchOptions): js.Promise[IModel] = js.native
  
  /**
    * Get an encoded download url given a file path.
    *
    * @param A promise which resolves with the absolute POSIX
    *   file path on the server.
    *
    * #### Notes
    * The returned URL may include a query parameter.
    */
  def getDownloadUrl(localPath: String): js.Promise[String] = js.native
  
  /**
    * List available checkpoints for a file.
    *
    * @param localPath - The path of the file.
    *
    * @returns A promise which resolves with a list of checkpoint models for
    *    the file.
    */
  def listCheckpoints(localPath: String): js.Promise[js.Array[ICheckpointModel]] = js.native
  
  /**
    * An optional ModelDB.IFactory instance for the
    * drive.
    */
  val modelDBFactory: js.UndefOr[IFactory] = js.native
  
  /**
    * The name of the drive, which is used at the leading
    * component of file paths.
    */
  val name: String = js.native
  
  /**
    * Create a new untitled file or directory in the specified directory path.
    *
    * @param options: The options used to create the file.
    *
    * @returns A promise which resolves with the created file content when the
    *    file is created.
    */
  def newUntitled(): js.Promise[IModel] = js.native
  def newUntitled(options: ICreateOptions): js.Promise[IModel] = js.native
  
  /**
    * Rename a file or directory.
    *
    * @param oldLocalPath - The original file path.
    *
    * @param newLocalPath - The new file path.
    *
    * @returns A promise which resolves with the new file content model when the
    *   file is renamed.
    */
  def rename(oldLocalPath: String, newLocalPath: String): js.Promise[IModel] = js.native
  
  /**
    * Restore a file to a known checkpoint state.
    *
    * @param localPath - The path of the file.
    *
    * @param checkpointID - The id of the checkpoint to restore.
    *
    * @returns A promise which resolves when the checkpoint is restored.
    */
  def restoreCheckpoint(localPath: String, checkpointID: String): js.Promise[Unit] = js.native
  
  /**
    * Save a file.
    *
    * @param localPath - The desired file path.
    *
    * @param options - Optional overrides to the model.
    *
    * @returns A promise which resolves with the file content model when the
    *   file is saved.
    */
  def save(localPath: String): js.Promise[IModel] = js.native
  def save(localPath: String, options: PartialIModel): js.Promise[IModel] = js.native
  
  /**
    * The server settings of the manager.
    */
  val serverSettings: ISettings = js.native
}
