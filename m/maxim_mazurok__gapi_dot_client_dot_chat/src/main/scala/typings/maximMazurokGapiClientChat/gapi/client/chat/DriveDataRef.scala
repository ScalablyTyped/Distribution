package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveDataRef extends StObject {
  
  /** The id for the drive file, for use with the Drive API. */
  var driveFileId: js.UndefOr[String] = js.undefined
}
object DriveDataRef {
  
  inline def apply(): DriveDataRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveDataRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveDataRef] (val x: Self) extends AnyVal {
    
    inline def setDriveFileId(value: String): Self = StObject.set(x, "driveFileId", value.asInstanceOf[js.Any])
    
    inline def setDriveFileIdUndefined: Self = StObject.set(x, "driveFileId", js.undefined)
  }
}
