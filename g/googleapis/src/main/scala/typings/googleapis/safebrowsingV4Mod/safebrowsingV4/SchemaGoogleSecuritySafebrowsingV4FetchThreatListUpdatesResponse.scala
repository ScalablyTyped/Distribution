package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse extends StObject {
  
  /**
    * The list updates requested by the clients. The number of responses here may be less than the number of requests sent by clients. This is the case, for example, if the server has no updates for a particular list.
    */
  var listUpdateResponses: js.UndefOr[
    js.Array[
      SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse
    ]
  ] = js.undefined
  
  /**
    * The minimum duration the client must wait before issuing any update request. If this field is not set clients may update as soon as they want.
    */
  var minimumWaitDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse](x: Self) {
    
    inline def setListUpdateResponses(
      value: js.Array[
          SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse
        ]
    ): Self = StObject.set(x, "listUpdateResponses", value.asInstanceOf[js.Any])
    
    inline def setListUpdateResponsesUndefined: Self = StObject.set(x, "listUpdateResponses", js.undefined)
    
    inline def setListUpdateResponsesVarargs(value: SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse*): Self = StObject.set(x, "listUpdateResponses", js.Array(value*))
    
    inline def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinimumWaitDurationNull: Self = StObject.set(x, "minimumWaitDuration", null)
    
    inline def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
  }
}
