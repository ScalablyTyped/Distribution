package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to fetch a file.
  */
@js.native
trait IFetchOptions extends js.Object {
  
  /**
    * Whether to include the file content.
    *
    * The default is `true`.
    */
  var content: js.UndefOr[Boolean] = js.native
  
  /**
    * The override file format for the request.
    */
  var format: js.UndefOr[FileFormat] = js.native
  
  /**
    * The override file type for the request.
    */
  var `type`: js.UndefOr[ContentType] = js.native
}
object IFetchOptions {
  
  @scala.inline
  def apply(): IFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFetchOptions]
  }
  
  @scala.inline
  implicit class IFetchOptionsOps[Self <: IFetchOptions] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Boolean): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFormat(value: FileFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
