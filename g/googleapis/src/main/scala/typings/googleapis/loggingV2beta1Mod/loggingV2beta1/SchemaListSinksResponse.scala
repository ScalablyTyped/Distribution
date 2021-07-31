package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned from ListSinks.
  */
trait SchemaListSinksResponse extends StObject {
  
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of sinks.
    */
  var sinks: js.UndefOr[js.Array[SchemaLogSink]] = js.undefined
}
object SchemaListSinksResponse {
  
  @scala.inline
  def apply(): SchemaListSinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSinksResponse]
  }
  
  @scala.inline
  implicit class SchemaListSinksResponseMutableBuilder[Self <: SchemaListSinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSinks(value: js.Array[SchemaLogSink]): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinksUndefined: Self = StObject.set(x, "sinks", js.undefined)
    
    @scala.inline
    def setSinksVarargs(value: SchemaLogSink*): Self = StObject.set(x, "sinks", js.Array(value :_*))
  }
}
