package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains permission level information about a Search Console site. For more
  * information, see  Permissions in Search Console.
  */
trait SchemaWmxSite extends StObject {
  
  /**
    * The user&#39;s permission level for the site.
    */
  var permissionLevel: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the site.
    */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object SchemaWmxSite {
  
  @scala.inline
  def apply(): SchemaWmxSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWmxSite]
  }
  
  @scala.inline
  implicit class SchemaWmxSiteMutableBuilder[Self <: SchemaWmxSite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionLevel(value: String): Self = StObject.set(x, "permissionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionLevelUndefined: Self = StObject.set(x, "permissionLevel", js.undefined)
    
    @scala.inline
    def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
