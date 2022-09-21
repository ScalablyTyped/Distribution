package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSessionsResponse extends StObject {
  
  /**
    * If includeDeleted is set to true in the request, and startTime and endTime are omitted, this will include sessions which were deleted since the last sync.
    */
  var deletedSession: js.UndefOr[js.Array[SchemaSession]] = js.undefined
  
  /**
    * Flag to indicate server has more data to transfer. DO NOT USE THIS FIELD. It is never populated in responses from the server.
    */
  var hasMoreData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The sync token which is used to sync further changes. This will only be provided if both startTime and endTime are omitted from the request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sessions with an end time that is between startTime and endTime of the request.
    */
  var session: js.UndefOr[js.Array[SchemaSession]] = js.undefined
}
object SchemaListSessionsResponse {
  
  inline def apply(): SchemaListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSessionsResponse]
  }
  
  extension [Self <: SchemaListSessionsResponse](x: Self) {
    
    inline def setDeletedSession(value: js.Array[SchemaSession]): Self = StObject.set(x, "deletedSession", value.asInstanceOf[js.Any])
    
    inline def setDeletedSessionUndefined: Self = StObject.set(x, "deletedSession", js.undefined)
    
    inline def setDeletedSessionVarargs(value: SchemaSession*): Self = StObject.set(x, "deletedSession", js.Array(value*))
    
    inline def setHasMoreData(value: Boolean): Self = StObject.set(x, "hasMoreData", value.asInstanceOf[js.Any])
    
    inline def setHasMoreDataNull: Self = StObject.set(x, "hasMoreData", null)
    
    inline def setHasMoreDataUndefined: Self = StObject.set(x, "hasMoreData", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSession(value: js.Array[SchemaSession]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionVarargs(value: SchemaSession*): Self = StObject.set(x, "session", js.Array(value*))
  }
}
