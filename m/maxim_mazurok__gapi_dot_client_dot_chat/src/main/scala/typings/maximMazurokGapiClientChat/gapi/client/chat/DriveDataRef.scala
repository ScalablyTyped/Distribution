package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveDataRef extends js.Object {
  
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
  implicit class DriveDataRefOps[Self <: DriveDataRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDriveFileId(value: String): Self = this.set("driveFileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveFileId: Self = this.set("driveFileId", js.undefined)
  }
}
