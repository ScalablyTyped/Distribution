package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListTopics method.
  */
@js.native
trait SchemaListTopicsResponse extends StObject {
  
  /**
    * If not empty, indicates that there are more topics that match the
    * request, and this value should be passed to the next
    * &lt;code&gt;ListTopicsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The resulting topics.
    */
  var topic: js.UndefOr[js.Array[SchemaTopic]] = js.native
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
    def setTopic(value: js.Array[SchemaTopic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: SchemaTopic*): Self = StObject.set(x, "topic", js.Array(value :_*))
  }
}
