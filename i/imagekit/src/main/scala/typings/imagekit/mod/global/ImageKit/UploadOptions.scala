package typings.imagekit.mod.global.ImageKit

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used when uploading a file
  *
  * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload#request-structure-multipart-form-data}
  */
@js.native
trait UploadOptions extends js.Object {
  
  /**
    * Define an important area in the image. This is only relevant for image type files.
    * To be passed as a string with the x and y coordinates of the top-left corner, and width and height of the area of interest in format x,y,width,height. For example - 10,10,100,100
    * Can be used with fo-customtransformation.
    * If this field is not specified and the file is overwritten, then customCoordinates will be removed.
    */
  var customCoordinates: js.UndefOr[String] = js.native
  
  /**
    * This field accepts three kinds of values:
    * - binary - You can send the content of the file as binary. This is used when a file is being uploaded from the browser.
    * - base64 - Base64 encoded string of file content.
    * - url - URL of the file from where to download the content before uploading.
    *      Downloading file from URL might take longer, so it is recommended that you pass the binary or base64 content of the file.
    *      Pass the full URL, for example - https://www.example.com/rest-of-the-image-path.jpg.
    */
  var file: String | Buffer = js.native
  
  /**
    * The name with which the file has to be uploaded.
    * The file name can contain:
    * - Alphanumeric Characters: a-z , A-Z , 0-9
    * - Special Characters: . _ and -
    * Any other character including space will be replaced by _
    */
  var fileName: String = js.native
  
  /**
    * The folder path (e.g. /images/folder/) in which the image has to be uploaded. If the folder(s) didn't exist before, a new folder(s) is created.
    * The folder name can contain:
    * - Alphanumeric Characters: a-z , A-Z , 0-9
    * - Special Characters: / _ and -
    * - Using multiple / creates a nested folder.
    * Default value - /
    */
  var folder: js.UndefOr[String] = js.native
  
  /**
    * Whether to mark the file as private or not. This is only relevant for image type files.
    * - Accepts true or false.
    * - If set true, the file is marked as private which restricts access to the original image URL and unnamed image transformations without signed URLs.
    *      Without the signed URL, only named transformations work on private images
    * Default value - false
    */
  var isPrivateFile: js.UndefOr[Boolean] = js.native
  
  /**
    * Comma-separated values of the fields that you want ImageKit.io to return in response.
    *
    * For example, set the value of this field to tags,customCoordinates,isPrivateFile,metadata to get value of tags, customCoordinates, isPrivateFile , and metadata in the response.
    */
  var responseFields: js.UndefOr[String] = js.native
  
  /**
    * Set the tags while uploading the file.
    * - Comma-separated value of tags in format tag1,tag2,tag3. For example - t-shirt,round-neck,men
    * - The maximum length of all characters should not exceed 500.
    * - % is not allowed.
    * - If this field is not specified and the file is overwritten then the tags will be removed.
    */
  var tags: js.UndefOr[String] = js.native
  
  /**
    * Whether to use a unique filename for this file or not.
    * - Accepts true or false.
    * - If set true, ImageKit.io will add a unique suffix to the filename parameter to get a unique filename.
    * - If set false, then the image is uploaded with the provided filename parameter and any existing file with the same name is replaced.
    * Default value - true
    */
  var useUniqueFileName: js.UndefOr[Boolean] = js.native
}
object UploadOptions {
  
  @scala.inline
  def apply(file: String | Buffer, fileName: String): UploadOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
  
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String | Buffer): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCoordinates(value: String): Self = this.set("customCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCoordinates: Self = this.set("customCoordinates", js.undefined)
    
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setIsPrivateFile(value: Boolean): Self = this.set("isPrivateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrivateFile: Self = this.set("isPrivateFile", js.undefined)
    
    @scala.inline
    def setResponseFields(value: String): Self = this.set("responseFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseFields: Self = this.set("responseFields", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUseUniqueFileName(value: Boolean): Self = this.set("useUniqueFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUniqueFileName: Self = this.set("useUniqueFileName", js.undefined)
  }
}
