package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCss extends StObject {
  
  /**
    * Output only. Immutable. The CSS domain ID.
    */
  var cssDomainId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The ID of the CSS group this CSS domain is affiliated with. Only populated for CSS group users.
    */
  var cssGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The CSS domain's display name, used when space is constrained.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The CSS domain's full name.
    */
  var fullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The CSS domain's homepage.
    */
  var homepageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of label IDs that are assigned to this CSS domain by its CSS group. Only populated for CSS group users.
    */
  var labelIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCss {
  
  inline def apply(): SchemaCss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCss]
  }
  
  extension [Self <: SchemaCss](x: Self) {
    
    inline def setCssDomainId(value: String): Self = StObject.set(x, "cssDomainId", value.asInstanceOf[js.Any])
    
    inline def setCssDomainIdNull: Self = StObject.set(x, "cssDomainId", null)
    
    inline def setCssDomainIdUndefined: Self = StObject.set(x, "cssDomainId", js.undefined)
    
    inline def setCssGroupId(value: String): Self = StObject.set(x, "cssGroupId", value.asInstanceOf[js.Any])
    
    inline def setCssGroupIdNull: Self = StObject.set(x, "cssGroupId", null)
    
    inline def setCssGroupIdUndefined: Self = StObject.set(x, "cssGroupId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameNull: Self = StObject.set(x, "fullName", null)
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setHomepageUri(value: String): Self = StObject.set(x, "homepageUri", value.asInstanceOf[js.Any])
    
    inline def setHomepageUriNull: Self = StObject.set(x, "homepageUri", null)
    
    inline def setHomepageUriUndefined: Self = StObject.set(x, "homepageUri", js.undefined)
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsNull: Self = StObject.set(x, "labelIds", null)
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
  }
}
