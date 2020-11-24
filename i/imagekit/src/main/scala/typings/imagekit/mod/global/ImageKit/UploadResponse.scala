package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from uploading a file
  *
  * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload#response-code-and-structure-json}
  */
@js.native
trait UploadResponse extends js.Object {
  
  /**
    * Value of custom coordinates associated with the image in format x,y,width,height.
    */
  var customCoordinates: String | Null = js.native
  
  /**
    * Unique fileId. Store this fileld in your database, as this will be used to perform update action on this file.
    */
  var fileId: String = js.native
  
  /**
    * The path of the file uploaded. It includes any folder that you specified while uploading.
    */
  var filePath: String = js.native
  
  /**
    * Type of file. It can either be image or non-image.
    */
  var fileType: FileType = js.native
  
  /**
    * Height of the uploaded image file. Only applicable when file type is image.
    */
  var height: Double = js.native
  
  /**
    * Is the file marked as private. It can be either true or false.
    */
  var isPrivateFile: Boolean = js.native
  
  /**
    * The metadata of the upload file. Use responseFields property in request to get the metadata returned in response of upload API.
    */
  var metadata: js.UndefOr[String] = js.native
  
  /**
    * The name of the uploaded file.
    */
  var name: String = js.native
  
  /**
    * Size of the uploaded file in bytes.
    */
  var size: Double = js.native
  
  /**
    * Array of tags associated with the image.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * In case of an image, a small thumbnail URL.
    */
  var thumbnailUrl: String = js.native
  
  /**
    * The URL of the file.
    */
  var url: String = js.native
  
  /**
    * Width of the uploaded image file. Only applicable when file type is image.
    */
  var width: Double = js.native
}
object UploadResponse {
  
  @scala.inline
  def apply(
    fileId: String,
    filePath: String,
    fileType: FileType,
    height: Double,
    isPrivateFile: Boolean,
    name: String,
    size: Double,
    thumbnailUrl: String,
    url: String,
    width: Double
  ): UploadResponse = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isPrivateFile = isPrivateFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnailUrl = thumbnailUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadResponse]
  }
  
  @scala.inline
  implicit class UploadResponseOps[Self <: UploadResponse] (val x: Self) extends AnyVal {
    
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: FileType): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivateFile(value: Boolean): Self = this.set("isPrivateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCoordinates(value: String): Self = this.set("customCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCoordinatesNull: Self = this.set("customCoordinates", null)
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
