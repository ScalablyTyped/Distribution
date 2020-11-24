package typings.jupyterlabServices.contentsMod

import typings.jupyterlabServices.contentsMod.Contents.IChangedArgs
import typings.jupyterlabServices.contentsMod.Contents.IManager
import typings.jupyterlabServices.contentsMod.ContentsManager.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/contents", "ContentsManager")
@js.native
/**
  * Construct a new contents manager object.
  *
  * @param options - The options used to initialize the object.
  */
class ContentsManager_ () extends IManager {
  def this(options: IOptions) = this()
  
  var _additionalDrives: js.Any = js.native
  
  var _defaultDrive: js.Any = js.native
  
  /**
    * Given a path, get the `IDrive to which it refers,
    * where the path satisfies the pattern
    * `'driveName:path/to/file'`. If there is no `driveName`
    * prepended to the path, it returns the default drive.
    *
    * @param path: a path to a file.
    *
    * @returns A tuple containing an `IDrive` object for the path,
    * and a local path for that drive.
    */
  var _driveForPath: js.Any = js.native
  
  var _fileChanged: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Respond to fileChanged signals from the drives attached to
    * the manager. This prepends the drive name to the path if necessary,
    * and then forwards the signal.
    */
  var _onFileChanged: js.Any = js.native
  
  /**
    * Given a drive and a local path, construct a fully qualified
    * path. The inverse of `_driveForPath`.
    *
    * @param drive: an `IDrive`.
    *
    * @param localPath: the local path on the drive.
    *
    * @returns the fully qualified path.
    */
  var _toGlobalPath: js.Any = js.native
  
  /**
    * A signal emitted when a file operation takes place.
    */
  @JSName("fileChanged")
  def fileChanged_MContentsManager_ : ISignal[this.type, IChangedArgs] = js.native
  
  /**
    * Test whether the manager has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MContentsManager_ : Boolean = js.native
}
