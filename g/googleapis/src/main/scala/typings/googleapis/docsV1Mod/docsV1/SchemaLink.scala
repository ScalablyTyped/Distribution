package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to another portion of a document or an external URL resource.
  */
@js.native
trait SchemaLink extends js.Object {
  
  /**
    * The ID of a bookmark in this document.
    */
  var bookmarkId: js.UndefOr[String] = js.native
  
  /**
    * The ID of a heading in this document.
    */
  var headingId: js.UndefOr[String] = js.native
  
  /**
    * An external URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaLink {
  
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  @scala.inline
  implicit class SchemaLinkOps[Self <: SchemaLink] (val x: Self) extends AnyVal {
    
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
    def setBookmarkId(value: String): Self = this.set("bookmarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookmarkId: Self = this.set("bookmarkId", js.undefined)
    
    @scala.inline
    def setHeadingId(value: String): Self = this.set("headingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingId: Self = this.set("headingId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
