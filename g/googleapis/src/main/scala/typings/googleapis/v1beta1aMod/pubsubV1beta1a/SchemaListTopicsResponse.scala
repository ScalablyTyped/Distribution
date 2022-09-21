package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTopicsResponse extends StObject {
  
  /**
    * If not empty, indicates that there are more topics that match the request, and this value should be passed to the next ListTopicsRequest to continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resulting topics.
    */
  var topic: js.UndefOr[js.Array[SchemaTopic]] = js.undefined
}
object SchemaListTopicsResponse {
  
  inline def apply(): SchemaListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicsResponse]
  }
  
  extension [Self <: SchemaListTopicsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTopic(value: js.Array[SchemaTopic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: SchemaTopic*): Self = StObject.set(x, "topic", js.Array(value*))
  }
}
