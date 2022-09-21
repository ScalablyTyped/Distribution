package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSocialMetaTagInfo extends StObject {
  
  /**
    * A short description of the link. Optional.
    */
  var socialDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An image url string. Optional.
    */
  var socialImageLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title to be displayed. Optional.
    */
  var socialTitle: js.UndefOr[String | Null] = js.undefined
}
object SchemaSocialMetaTagInfo {
  
  inline def apply(): SchemaSocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSocialMetaTagInfo]
  }
  
  extension [Self <: SchemaSocialMetaTagInfo](x: Self) {
    
    inline def setSocialDescription(value: String): Self = StObject.set(x, "socialDescription", value.asInstanceOf[js.Any])
    
    inline def setSocialDescriptionNull: Self = StObject.set(x, "socialDescription", null)
    
    inline def setSocialDescriptionUndefined: Self = StObject.set(x, "socialDescription", js.undefined)
    
    inline def setSocialImageLink(value: String): Self = StObject.set(x, "socialImageLink", value.asInstanceOf[js.Any])
    
    inline def setSocialImageLinkNull: Self = StObject.set(x, "socialImageLink", null)
    
    inline def setSocialImageLinkUndefined: Self = StObject.set(x, "socialImageLink", js.undefined)
    
    inline def setSocialTitle(value: String): Self = StObject.set(x, "socialTitle", value.asInstanceOf[js.Any])
    
    inline def setSocialTitleNull: Self = StObject.set(x, "socialTitle", null)
    
    inline def setSocialTitleUndefined: Self = StObject.set(x, "socialTitle", js.undefined)
  }
}
