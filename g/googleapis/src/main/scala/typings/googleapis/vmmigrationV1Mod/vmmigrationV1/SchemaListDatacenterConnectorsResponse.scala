package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDatacenterConnectorsResponse extends StObject {
  
  /**
    * Output only. The list of sources response.
    */
  var datacenterConnectors: js.UndefOr[js.Array[SchemaDatacenterConnector]] = js.undefined
  
  /**
    * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListDatacenterConnectorsResponse {
  
  inline def apply(): SchemaListDatacenterConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatacenterConnectorsResponse]
  }
  
  extension [Self <: SchemaListDatacenterConnectorsResponse](x: Self) {
    
    inline def setDatacenterConnectors(value: js.Array[SchemaDatacenterConnector]): Self = StObject.set(x, "datacenterConnectors", value.asInstanceOf[js.Any])
    
    inline def setDatacenterConnectorsUndefined: Self = StObject.set(x, "datacenterConnectors", js.undefined)
    
    inline def setDatacenterConnectorsVarargs(value: SchemaDatacenterConnector*): Self = StObject.set(x, "datacenterConnectors", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
