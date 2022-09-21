package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWmxSite extends StObject {
  
  /**
    * The user's permission level for the site.
    */
  var permissionLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the site.
    */
  var siteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaWmxSite {
  
  inline def apply(): SchemaWmxSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWmxSite]
  }
  
  extension [Self <: SchemaWmxSite](x: Self) {
    
    inline def setPermissionLevel(value: String): Self = StObject.set(x, "permissionLevel", value.asInstanceOf[js.Any])
    
    inline def setPermissionLevelNull: Self = StObject.set(x, "permissionLevel", null)
    
    inline def setPermissionLevelUndefined: Self = StObject.set(x, "permissionLevel", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlNull: Self = StObject.set(x, "siteUrl", null)
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
