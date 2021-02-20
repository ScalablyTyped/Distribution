package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of sites with access level information.
  */
@js.native
trait SchemaSitesListResponse extends StObject {
  
  /**
    * Contains permission level information about a Search Console site. For
    * more information, see Permissions in Search Console.
    */
  var siteEntry: js.UndefOr[js.Array[SchemaWmxSite]] = js.native
}
object SchemaSitesListResponse {
  
  @scala.inline
  def apply(): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
  
  @scala.inline
  implicit class SchemaSitesListResponseMutableBuilder[Self <: SchemaSitesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiteEntry(value: js.Array[SchemaWmxSite]): Self = StObject.set(x, "siteEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteEntryUndefined: Self = StObject.set(x, "siteEntry", js.undefined)
    
    @scala.inline
    def setSiteEntryVarargs(value: SchemaWmxSite*): Self = StObject.set(x, "siteEntry", js.Array(value :_*))
  }
}
