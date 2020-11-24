package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the various content types in the sitemap.
  */
@js.native
trait SchemaWmxSitemapContent extends js.Object {
  
  /**
    * The number of URLs from the sitemap that were indexed (of the content
    * type).
    */
  var indexed: js.UndefOr[String] = js.native
  
  /**
    * The number of URLs in the sitemap (of the content type).
    */
  var submitted: js.UndefOr[String] = js.native
  
  /**
    * The specific type of content in this sitemap. For example: web.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaWmxSitemapContent {
  
  @scala.inline
  def apply(): SchemaWmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWmxSitemapContent]
  }
  
  @scala.inline
  implicit class SchemaWmxSitemapContentOps[Self <: SchemaWmxSitemapContent] (val x: Self) extends AnyVal {
    
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
    def setIndexed(value: String): Self = this.set("indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    
    @scala.inline
    def setSubmitted(value: String): Self = this.set("submitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitted: Self = this.set("submitted", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
