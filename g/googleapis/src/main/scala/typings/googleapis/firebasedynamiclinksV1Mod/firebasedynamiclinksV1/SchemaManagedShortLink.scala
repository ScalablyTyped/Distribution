package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedShortLink extends StObject {
  
  /**
    * Creation timestamp of the short link.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Attributes that have been flagged about this short url.
    */
  var flaggedAttribute: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Full Dyamic Link info
    */
  var info: js.UndefOr[SchemaDynamicLinkInfo] = js.undefined
  
  /**
    * Short durable link url, for example, "https://sample.app.goo.gl/xyz123". Required.
    */
  var link: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link name defined by the creator. Required.
    */
  var linkName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Visibility status of link.
    */
  var visibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedShortLink {
  
  inline def apply(): SchemaManagedShortLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedShortLink]
  }
  
  extension [Self <: SchemaManagedShortLink](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setFlaggedAttribute(value: js.Array[String]): Self = StObject.set(x, "flaggedAttribute", value.asInstanceOf[js.Any])
    
    inline def setFlaggedAttributeNull: Self = StObject.set(x, "flaggedAttribute", null)
    
    inline def setFlaggedAttributeUndefined: Self = StObject.set(x, "flaggedAttribute", js.undefined)
    
    inline def setFlaggedAttributeVarargs(value: String*): Self = StObject.set(x, "flaggedAttribute", js.Array(value*))
    
    inline def setInfo(value: SchemaDynamicLinkInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkName(value: String): Self = StObject.set(x, "linkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameNull: Self = StObject.set(x, "linkName", null)
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "linkName", js.undefined)
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
