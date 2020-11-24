package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when deleting multiple files from the media library.
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-files-bulk}
  */
@js.native
trait BulkDeleteFilesResponse extends js.Object {
  
  /**
    * List of file ids of successfully deleted files
    */
  var successfullyDeletedFileIds: js.Array[String] = js.native
}
object BulkDeleteFilesResponse {
  
  @scala.inline
  def apply(successfullyDeletedFileIds: js.Array[String]): BulkDeleteFilesResponse = {
    val __obj = js.Dynamic.literal(successfullyDeletedFileIds = successfullyDeletedFileIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkDeleteFilesResponse]
  }
  
  @scala.inline
  implicit class BulkDeleteFilesResponseOps[Self <: BulkDeleteFilesResponse] (val x: Self) extends AnyVal {
    
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
    def setSuccessfullyDeletedFileIdsVarargs(value: String*): Self = this.set("successfullyDeletedFileIds", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfullyDeletedFileIds(value: js.Array[String]): Self = this.set("successfullyDeletedFileIds", value.asInstanceOf[js.Any])
  }
}
