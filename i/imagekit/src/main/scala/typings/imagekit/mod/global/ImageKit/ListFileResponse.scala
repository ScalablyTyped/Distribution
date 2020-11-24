package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * List and search response
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files#response-structure-and-status-code-application-json}
  */
@js.native
trait ListFileResponse extends js.Object {
  
  /**
    * The date and time when the file was first uploaded. The format is `YYYY-MM-DDTHH:mm:ss.sssZ`.
    */
  var createdAt: String = js.native
  
  /**
    * Value of custom coordinates associated with the image in format x,y,width,height. If customCoordinates are not defined then it is null.
    */
  var customCoordinates: String | Null = js.native
  
  /**
    * The unique fileId of the uploaded file.
    */
  var fileId: String = js.native
  
  /**
    * The relative path of the file. In the case of an image, you can use this
    * path to construct different transformations.
    */
  var filePath: String = js.native
  
  /**
    * The type of file, it could be either image or non-image.
    */
  var fileType: FileType = js.native
  
  /**
    * Is the file marked as private. It can be either true or false.
    */
  var isPrivateFile: Boolean = js.native
  
  /**
    * Name of the file or folder.
    */
  var name: String = js.native
  
  /**
    * Array of tags associated with the image. If no tags are set, it will be null.
    */
  var tags: js.Array[String] | Null = js.native
  
  /**
    * In case of an image, a small thumbnail URL.
    */
  var thumbnail: String = js.native
  
  /**
    * Type of item. It can be either file or folder.
    */
  var `type`: Item = js.native
  
  /**
    * A publicly accessible URL of the file.
    */
  var url: String = js.native
}
object ListFileResponse {
  
  @scala.inline
  def apply(
    createdAt: String,
    fileId: String,
    filePath: String,
    fileType: FileType,
    isPrivateFile: Boolean,
    name: String,
    thumbnail: String,
    `type`: Item,
    url: String
  ): ListFileResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], isPrivateFile = isPrivateFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileResponse]
  }
  
  @scala.inline
  implicit class ListFileResponseOps[Self <: ListFileResponse] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: FileType): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivateFile(value: Boolean): Self = this.set("isPrivateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Item): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCoordinates(value: String): Self = this.set("customCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCoordinatesNull: Self = this.set("customCoordinates", null)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
  }
}
