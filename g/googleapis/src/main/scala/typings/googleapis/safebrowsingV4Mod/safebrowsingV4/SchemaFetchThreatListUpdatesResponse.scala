package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchThreatListUpdatesResponse extends StObject {
  
  /**
    * The list updates requested by the clients.
    */
  var listUpdateResponses: js.UndefOr[js.Array[SchemaListUpdateResponse]] = js.undefined
  
  /**
    * The minimum duration the client must wait before issuing any update
    * request. If this field is not set clients may update as soon as they
    * want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.undefined
}
object SchemaFetchThreatListUpdatesResponse {
  
  @scala.inline
  def apply(): SchemaFetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchThreatListUpdatesResponse]
  }
  
  @scala.inline
  implicit class SchemaFetchThreatListUpdatesResponseMutableBuilder[Self <: SchemaFetchThreatListUpdatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListUpdateResponses(value: js.Array[SchemaListUpdateResponse]): Self = StObject.set(x, "listUpdateResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUpdateResponsesUndefined: Self = StObject.set(x, "listUpdateResponses", js.undefined)
    
    @scala.inline
    def setListUpdateResponsesVarargs(value: SchemaListUpdateResponse*): Self = StObject.set(x, "listUpdateResponses", js.Array(value :_*))
    
    @scala.inline
    def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
  }
}
