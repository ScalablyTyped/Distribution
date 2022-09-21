package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditSitesResponse extends StObject {
  
  /**
    * The list of sites that have been successfully created. This list will be absent if empty.
    */
  var sites: js.UndefOr[js.Array[SchemaSite]] = js.undefined
}
object SchemaBulkEditSitesResponse {
  
  inline def apply(): SchemaBulkEditSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditSitesResponse]
  }
  
  extension [Self <: SchemaBulkEditSitesResponse](x: Self) {
    
    inline def setSites(value: js.Array[SchemaSite]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: SchemaSite*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
