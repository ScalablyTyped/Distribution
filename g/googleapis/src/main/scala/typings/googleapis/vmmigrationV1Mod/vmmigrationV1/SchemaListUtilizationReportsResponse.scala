package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUtilizationReportsResponse extends StObject {
  
  /**
    * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The list of reports.
    */
  var utilizationReports: js.UndefOr[js.Array[SchemaUtilizationReport]] = js.undefined
}
object SchemaListUtilizationReportsResponse {
  
  inline def apply(): SchemaListUtilizationReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUtilizationReportsResponse]
  }
  
  extension [Self <: SchemaListUtilizationReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
    
    inline def setUtilizationReports(value: js.Array[SchemaUtilizationReport]): Self = StObject.set(x, "utilizationReports", value.asInstanceOf[js.Any])
    
    inline def setUtilizationReportsUndefined: Self = StObject.set(x, "utilizationReports", js.undefined)
    
    inline def setUtilizationReportsVarargs(value: SchemaUtilizationReport*): Self = StObject.set(x, "utilizationReports", js.Array(value*))
  }
}
