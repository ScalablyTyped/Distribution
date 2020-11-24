package typings.jupyterlabFilebrowser.uploadstatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for an item that is being uploaded to
  * the file system.
  */
@js.native
trait IFileUploadItem extends js.Object {
  
  /**
    * Whether the upload is complete.
    */
  var complete: Boolean = js.native
  
  /**
    * The path on the filesystem that is being uploaded to.
    */
  var path: String = js.native
  
  /**
    * The upload progress fraction.
    */
  var progress: Double = js.native
}
object IFileUploadItem {
  
  @scala.inline
  def apply(complete: Boolean, path: String, progress: Double): IFileUploadItem = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUploadItem]
  }
  
  @scala.inline
  implicit class IFileUploadItemOps[Self <: IFileUploadItem] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
}
