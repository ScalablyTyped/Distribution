package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedDriveFile extends StObject {
  
  /** Drive file details. */
  var driveFile: js.UndefOr[DriveFile] = js.native
  
  /** Mechanism by which students access the Drive item. */
  var shareMode: js.UndefOr[String] = js.native
}
object SharedDriveFile {
  
  @scala.inline
  def apply(): SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveFile]
  }
  
  @scala.inline
  implicit class SharedDriveFileMutableBuilder[Self <: SharedDriveFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    @scala.inline
    def setShareMode(value: String): Self = StObject.set(x, "shareMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareModeUndefined: Self = StObject.set(x, "shareMode", js.undefined)
  }
}
