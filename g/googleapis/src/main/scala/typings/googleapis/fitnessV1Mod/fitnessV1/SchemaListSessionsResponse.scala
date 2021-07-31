package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSessionsResponse extends StObject {
  
  /**
    * If includeDeleted is set to true in the request, this list will contain
    * sessions deleted with original end times that are within the startTime
    * and endTime frame.
    */
  var deletedSession: js.UndefOr[js.Array[SchemaSession]] = js.undefined
  
  /**
    * Flag to indicate server has more data to transfer
    */
  var hasMoreData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Sessions with an end time that is between startTime and endTime of the
    * request.
    */
  var session: js.UndefOr[js.Array[SchemaSession]] = js.undefined
}
object SchemaListSessionsResponse {
  
  @scala.inline
  def apply(): SchemaListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSessionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSessionsResponseMutableBuilder[Self <: SchemaListSessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedSession(value: js.Array[SchemaSession]): Self = StObject.set(x, "deletedSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedSessionUndefined: Self = StObject.set(x, "deletedSession", js.undefined)
    
    @scala.inline
    def setDeletedSessionVarargs(value: SchemaSession*): Self = StObject.set(x, "deletedSession", js.Array(value :_*))
    
    @scala.inline
    def setHasMoreData(value: Boolean): Self = StObject.set(x, "hasMoreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreDataUndefined: Self = StObject.set(x, "hasMoreData", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSession(value: js.Array[SchemaSession]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSessionVarargs(value: SchemaSession*): Self = StObject.set(x, "session", js.Array(value :_*))
  }
}
