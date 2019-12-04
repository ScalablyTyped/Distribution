package typings.atJupyterlabServices.libContentsMod.Contents

import typings.atJupyterlabObservables.libModeldbMod.ModelDB.IFactory
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a contents manager.
  */
@js.native
trait IManager extends IDisposable {
  /**
    * A signal emitted when a file operation takes place.
    */
  val fileChanged: ISignal[IManager, IChangedArgs] = js.native
  /**
    * The server settings associated with the manager.
    */
  val serverSettings: ISettings = js.native
  /**
    * Add an `IDrive` to the manager.
    */
  def addDrive(drive: IDrive): Unit = js.native
  /**
    * Copy a file into a given directory.
    *
    * @param path - The original file path.
    *
    * @param toDir - The destination directory path.
    *
    * @returns A promise which resolves with the new content model when the
    *  file is copied.
    */
  def copy(path: String, toDir: String): js.Promise[IModel] = js.native
  /**
    * Create a checkpoint for a file.
    *
    * @param path - The path of the file.
    *
    * @returns A promise which resolves with the new checkpoint model when the
    *   checkpoint is created.
    */
  def createCheckpoint(path: String): js.Promise[ICheckpointModel] = js.native
  /**
    * Delete a file.
    *
    * @param path - The path to the file.
    *
    * @returns A promise which resolves when the file is deleted.
    */
  def delete(path: String): js.Promise[Unit] = js.native
  /**
    * Delete a checkpoint for a file.
    *
    * @param path - The path of the file.
    *
    * @param checkpointID - The id of the checkpoint to delete.
    *
    * @returns A promise which resolves when the checkpoint is deleted.
    */
  def deleteCheckpoint(path: String, checkpointID: String): js.Promise[Unit] = js.native
  /**
    * Given a path of the form `drive:local/portion/of/it.txt`
    * get the name of the drive. If the path is missing
    * a drive portion, returns an empty string.
    *
    * @param path: the path.
    *
    * @returns The drive name for the path, or the empty string.
    */
  def driveName(path: String): String = js.native
  /**
    * Get a file or directory.
    *
    * @param path: The path to the file.
    *
    * @param options: The options used to fetch the file.
    *
    * @returns A promise which resolves with the file content.
    */
  def get(path: String): js.Promise[IModel] = js.native
  def get(path: String, options: IFetchOptions): js.Promise[IModel] = js.native
  /**
    * Get an encoded download url given a file path.
    *
    * @param A promise which resolves with the absolute POSIX
    *   file path on the server.
    *
    * #### Notes
    * The returned URL may include a query parameter.
    */
  def getDownloadUrl(path: String): js.Promise[String] = js.native
  /**
    * Given a path, get a ModelDB.IFactory from the
    * relevant backend. Returns `null` if the backend
    * does not provide one.
    */
  def getModelDBFactory(path: String): IFactory | Null = js.native
  /**
    * List available checkpoints for a file.
    *
    * @param path - The path of the file.
    *
    * @returns A promise which resolves with a list of checkpoint models for
    *    the file.
    */
  def listCheckpoints(path: String): js.Promise[js.Array[ICheckpointModel]] = js.native
  /**
    * Given a path of the form `drive:local/portion/of/it.txt`
    * get the local part of it.
    *
    * @param path: the path.
    *
    * @returns The local part of the path.
    */
  def localPath(path: String): String = js.native
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
    * Normalize a global path. Reduces '..' and '.' parts, and removes
    * leading slashes from the local part of the path, while retaining
    * the drive name if it exists.
    *
    * @param path: the path.
    *
    * @returns The normalized path.
    */
  def normalize(path: String): String = js.native
  /**
    * Rename a file or directory.
    *
    * @param path - The original file path.
    *
    * @param newPath - The new file path.
    *
    * @returns A promise which resolves with the new file content model when the
    *   file is renamed.
    */
  def rename(path: String, newPath: String): js.Promise[IModel] = js.native
  /**
    * Restore a file to a known checkpoint state.
    *
    * @param path - The path of the file.
    *
    * @param checkpointID - The id of the checkpoint to restore.
    *
    * @returns A promise which resolves when the checkpoint is restored.
    */
  def restoreCheckpoint(path: String, checkpointID: String): js.Promise[Unit] = js.native
  /**
    * Save a file.
    *
    * @param path - The desired file path.
    *
    * @param options - Optional overrides to the model.
    *
    * @returns A promise which resolves with the file content model when the
    *   file is saved.
    */
  def save(path: String): js.Promise[IModel] = js.native
  def save(path: String, options: Partial[IModel]): js.Promise[IModel] = js.native
}

