package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A hypertext link.
  */
@js.native
trait SchemaLink extends js.Object {
  
  /**
    * If set, indicates this is a link to the specific page in this
    * presentation with this ID. A page with this ID may not exist.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  
  /**
    * If set, indicates this is a link to a slide in this presentation,
    * addressed by its position.
    */
  var relativeLink: js.UndefOr[String] = js.native
  
  /**
    * If set, indicates this is a link to the slide at this zero-based index in
    * the presentation. There may not be a slide at this index.
    */
  var slideIndex: js.UndefOr[Double] = js.native
  
  /**
    * If set, indicates this is a link to the external web page at this URL.
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
    def setPageObjectId(value: String): Self = this.set("pageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageObjectId: Self = this.set("pageObjectId", js.undefined)
    
    @scala.inline
    def setRelativeLink(value: String): Self = this.set("relativeLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeLink: Self = this.set("relativeLink", js.undefined)
    
    @scala.inline
    def setSlideIndex(value: Double): Self = this.set("slideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideIndex: Self = this.set("slideIndex", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
