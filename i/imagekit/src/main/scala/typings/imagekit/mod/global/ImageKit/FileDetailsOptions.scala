package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options when updating file details such as tags and customCoordinates attribute using update file detail API.
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details}
  */
@js.native
trait FileDetailsOptions extends js.Object {
  
  /**
    * Define an important area in the image.
    * Example - 50,50,500,500
    */
  var customCoordinates: js.UndefOr[String] = js.native
  
  /**
    * Array of tags associated with the file.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object FileDetailsOptions {
  
  @scala.inline
  def apply(): FileDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileDetailsOptions]
  }
  
  @scala.inline
  implicit class FileDetailsOptionsOps[Self <: FileDetailsOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomCoordinates(value: String): Self = this.set("customCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCoordinates: Self = this.set("customCoordinates", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
