package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse extends StObject {
  
  /**
    * The pagination token to retrieve the next page of results. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of structures.
    */
  var structures: js.UndefOr[js.Array[SchemaGoogleHomeEnterpriseSdmV1Structure]] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStructures(value: js.Array[SchemaGoogleHomeEnterpriseSdmV1Structure]): Self = StObject.set(x, "structures", value.asInstanceOf[js.Any])
    
    inline def setStructuresUndefined: Self = StObject.set(x, "structures", js.undefined)
    
    inline def setStructuresVarargs(value: SchemaGoogleHomeEnterpriseSdmV1Structure*): Self = StObject.set(x, "structures", js.Array(value*))
  }
}
