package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListTopics` method.
  */
trait SchemaListTopicsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more topics that match the
    * request; this value should be passed in a new `ListTopicsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The resulting topics.
    */
  var topics: js.UndefOr[js.Array[SchemaTopic]] = js.undefined
}
object SchemaListTopicsResponse {
  
  @scala.inline
  def apply(): SchemaListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTopicsResponseMutableBuilder[Self <: SchemaListTopicsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTopics(value: js.Array[SchemaTopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: SchemaTopic*): Self = StObject.set(x, "topics", js.Array(value :_*))
  }
}
