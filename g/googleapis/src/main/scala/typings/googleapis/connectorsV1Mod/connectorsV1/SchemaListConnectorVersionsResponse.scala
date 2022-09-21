package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConnectorVersionsResponse extends StObject {
  
  /**
    * A list of connector versions.
    */
  var connectorVersions: js.UndefOr[js.Array[SchemaConnectorVersion]] = js.undefined
  
  /**
    * Next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListConnectorVersionsResponse {
  
  inline def apply(): SchemaListConnectorVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectorVersionsResponse]
  }
  
  extension [Self <: SchemaListConnectorVersionsResponse](x: Self) {
    
    inline def setConnectorVersions(value: js.Array[SchemaConnectorVersion]): Self = StObject.set(x, "connectorVersions", value.asInstanceOf[js.Any])
    
    inline def setConnectorVersionsUndefined: Self = StObject.set(x, "connectorVersions", js.undefined)
    
    inline def setConnectorVersionsVarargs(value: SchemaConnectorVersion*): Self = StObject.set(x, "connectorVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
