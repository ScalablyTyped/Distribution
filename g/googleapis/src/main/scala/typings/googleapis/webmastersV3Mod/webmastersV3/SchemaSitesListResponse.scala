package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of sites with access level information.
  */
trait SchemaSitesListResponse extends StObject {
  
  /**
    * Contains permission level information about a Search Console site. For
    * more information, see Permissions in Search Console.
    */
  var siteEntry: js.UndefOr[js.Array[SchemaWmxSite]] = js.undefined
}
object SchemaSitesListResponse {
  
  inline def apply(): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
  
  extension [Self <: SchemaSitesListResponse](x: Self) {
    
    inline def setSiteEntry(value: js.Array[SchemaWmxSite]): Self = StObject.set(x, "siteEntry", value.asInstanceOf[js.Any])
    
    inline def setSiteEntryUndefined: Self = StObject.set(x, "siteEntry", js.undefined)
    
    inline def setSiteEntryVarargs(value: SchemaWmxSite*): Self = StObject.set(x, "siteEntry", js.Array(value :_*))
  }
}
