package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveDataRef extends StObject {
  
  /** The id for the drive file, for use with the Drive API. */
  var driveFileId: js.UndefOr[String] = js.native
}
object DriveDataRef {
  
  @scala.inline
  def apply(): DriveDataRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveDataRef]
  }
  
  @scala.inline
  implicit class DriveDataRefMutableBuilder[Self <: DriveDataRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFileId(value: String): Self = StObject.set(x, "driveFileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFileIdUndefined: Self = StObject.set(x, "driveFileId", js.undefined)
  }
}
