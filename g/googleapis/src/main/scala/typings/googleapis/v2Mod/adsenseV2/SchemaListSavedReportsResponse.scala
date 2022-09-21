package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSavedReportsResponse extends StObject {
  
  /**
    * Continuation token used to page through reports. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reports returned in this list response.
    */
  var savedReports: js.UndefOr[js.Array[SchemaSavedReport]] = js.undefined
}
object SchemaListSavedReportsResponse {
  
  inline def apply(): SchemaListSavedReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSavedReportsResponse]
  }
  
  extension [Self <: SchemaListSavedReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSavedReports(value: js.Array[SchemaSavedReport]): Self = StObject.set(x, "savedReports", value.asInstanceOf[js.Any])
    
    inline def setSavedReportsUndefined: Self = StObject.set(x, "savedReports", js.undefined)
    
    inline def setSavedReportsVarargs(value: SchemaSavedReport*): Self = StObject.set(x, "savedReports", js.Array(value*))
  }
}
