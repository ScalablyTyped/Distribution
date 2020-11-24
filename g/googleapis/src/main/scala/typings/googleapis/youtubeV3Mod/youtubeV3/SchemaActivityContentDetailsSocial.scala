package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about a social network post.
  */
@js.native
trait SchemaActivityContentDetailsSocial extends js.Object {
  
  /**
    * The author of the social network post.
    */
  var author: js.UndefOr[String] = js.native
  
  /**
    * An image of the post&#39;s author.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * The URL of the social network post.
    */
  var referenceUrl: js.UndefOr[String] = js.native
  
  /**
    * The resourceId object encapsulates information that identifies the
    * resource associated with a social network post.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
  
  /**
    * The name of the social network.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaActivityContentDetailsSocial {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsSocial]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsSocialOps[Self <: SchemaActivityContentDetailsSocial] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setReferenceUrl(value: String): Self = this.set("referenceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceUrl: Self = this.set("referenceUrl", js.undefined)
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
