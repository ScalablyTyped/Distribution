package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFederationsResponse extends StObject {
  
  /**
    * The services in the specified location.
    */
  var federations: js.UndefOr[js.Array[SchemaFederation]] = js.undefined
  
  /**
    * A token that can be sent as page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListFederationsResponse {
  
  inline def apply(): SchemaListFederationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFederationsResponse]
  }
  
  extension [Self <: SchemaListFederationsResponse](x: Self) {
    
    inline def setFederations(value: js.Array[SchemaFederation]): Self = StObject.set(x, "federations", value.asInstanceOf[js.Any])
    
    inline def setFederationsUndefined: Self = StObject.set(x, "federations", js.undefined)
    
    inline def setFederationsVarargs(value: SchemaFederation*): Self = StObject.set(x, "federations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
