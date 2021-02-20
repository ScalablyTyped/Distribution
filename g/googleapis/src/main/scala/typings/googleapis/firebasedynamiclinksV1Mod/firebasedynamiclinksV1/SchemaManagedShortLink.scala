package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Managed Short Link.
  */
@js.native
trait SchemaManagedShortLink extends StObject {
  
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
  implicit class SchemaManagedShortLinkMutableBuilder[Self <: SchemaManagedShortLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setFlaggedAttribute(value: js.Array[String]): Self = StObject.set(x, "flaggedAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlaggedAttributeUndefined: Self = StObject.set(x, "flaggedAttribute", js.undefined)
    
    @scala.inline
    def setFlaggedAttributeVarargs(value: String*): Self = StObject.set(x, "flaggedAttribute", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: SchemaDynamicLinkInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkName(value: String): Self = StObject.set(x, "linkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNameUndefined: Self = StObject.set(x, "linkName", js.undefined)
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
