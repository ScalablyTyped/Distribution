package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for ListSessions.
  */
trait SchemaListSessionsResponse extends StObject {
  
  /**
    * `next_page_token` can be sent in a subsequent ListSessions call to fetch
    * more of the matching sessions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of requested sessions.
    */
  var sessions: js.UndefOr[js.Array[SchemaSession]] = js.undefined
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
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSessions(value: js.Array[SchemaSession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: SchemaSession*): Self = StObject.set(x, "sessions", js.Array(value :_*))
  }
}
