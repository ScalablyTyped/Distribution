package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Managed Short Link.
  */
@js.native
trait SchemaManagedShortLink extends js.Object {
  
  /**
    * Creation timestamp of the short link.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * Attributes that have been flagged about this short url.
    */
  var flaggedAttribute: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Full Dyamic Link info
    */
  var info: js.UndefOr[SchemaDynamicLinkInfo] = js.native
  
  /**
    * Short durable link url, for example,
    * &quot;https://sample.app.goo.gl/xyz123&quot;.  Required.
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * Link name defined by the creator.  Required.
    */
  var linkName: js.UndefOr[String] = js.native
  
  /**
    * Visibility status of link.
    */
  var visibility: js.UndefOr[String] = js.native
}
object SchemaManagedShortLink {
  
  @scala.inline
  def apply(): SchemaManagedShortLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedShortLink]
  }
  
  @scala.inline
  implicit class SchemaManagedShortLinkOps[Self <: SchemaManagedShortLink] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setFlaggedAttributeVarargs(value: String*): Self = this.set("flaggedAttribute", js.Array(value :_*))
    
    @scala.inline
    def setFlaggedAttribute(value: js.Array[String]): Self = this.set("flaggedAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlaggedAttribute: Self = this.set("flaggedAttribute", js.undefined)
    
    @scala.inline
    def setInfo(value: SchemaDynamicLinkInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLinkName(value: String): Self = this.set("linkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkName: Self = this.set("linkName", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
