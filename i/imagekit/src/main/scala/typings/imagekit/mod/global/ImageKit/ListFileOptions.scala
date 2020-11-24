package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List and search files options
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
  */
@js.native
trait ListFileOptions extends js.Object {
  
  /**
    * Type of files to include in result set. Accepts three values:
    * all - include all types of files in result set
    * image - only search in image type files
    * non-image - only search in files which are not image, e.g., JS or CSS or video files.
    */
  var fileType: js.UndefOr[FileType] = js.native
  
  /**
    * Whether to include folders in search results or not. By default only files are searched.
    * Accepts true and false. If this is set to true then tags and fileType parameters are ignored.
    */
  var includeFolder: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of results to return in response:
    * Minimum value - 1
    * Maximum value - 1000
    * Default value - 1000
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The name of the file or folder.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Folder path if you want to limit the search within a specific folder. For example, /sales-banner/ will only search in folder sales-banner.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The number of results to skip before returning results.
    * Minimum value - 0
    * Default value - 0
    */
  var skip: js.UndefOr[Double] = js.native
  
  /**
    * Comma-separated list of tags. Files matching any of the tags are included in result response. If no tag is matched, the file is not included in result set.
    */
  var tags: js.UndefOr[String] = js.native
}
object ListFileOptions {
  
  @scala.inline
  def apply(): ListFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileOptions]
  }
  
  @scala.inline
  implicit class ListFileOptionsOps[Self <: ListFileOptions] (val x: Self) extends AnyVal {
    
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
    def setFileType(value: FileType): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setIncludeFolder(value: Boolean): Self = this.set("includeFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFolder: Self = this.set("includeFolder", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
