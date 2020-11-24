package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents media content, such as a photo, that can be attached to a
  * timeline item.
  */
@js.native
trait SchemaAttachment extends js.Object {
  
  /**
    * The MIME type of the attachment.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The URL for the content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * The ID of the attachment.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Indicates that the contentUrl is not available because the attachment
    * content is still being processed. If the caller wishes to retrieve the
    * content, it should try again later.
    */
  var isProcessingContent: js.UndefOr[Boolean] = js.native
}
object SchemaAttachment {
  
  @scala.inline
  def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  @scala.inline
  implicit class SchemaAttachmentOps[Self <: SchemaAttachment] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsProcessingContent(value: Boolean): Self = this.set("isProcessingContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsProcessingContent: Self = this.set("isProcessingContent", js.undefined)
  }
}
