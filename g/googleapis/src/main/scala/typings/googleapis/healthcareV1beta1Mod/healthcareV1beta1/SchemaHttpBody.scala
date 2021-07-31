package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message that represents an arbitrary HTTP body. It should only be used for
  * payload formats that can&#39;t be represented as JSON, such as raw binary
  * or an HTML page.   This message can be used both in streaming and
  * non-streaming API methods in the request as well as the response.  It can
  * be used as a top-level request field, which is convenient if one wants to
  * extract parameters from either the URL or HTTP template into the request
  * fields and also want access to the raw HTTP body.  Example:      message
  * GetResourceRequest {       // A unique request id.       string request_id
  * = 1;        // The raw HTTP body is bound to this field.
  * google.api.HttpBody http_body = 2;     }      service ResourceService { rpc
  * GetResource(GetResourceRequest) returns (google.api.HttpBody);       rpc
  * UpdateResource(google.api.HttpBody) returns (google.protobuf.Empty);     }
  * Example with streaming methods:      service CaldavService {       rpc
  * GetCalendar(stream google.api.HttpBody)         returns (stream
  * google.api.HttpBody);       rpc UpdateCalendar(stream google.api.HttpBody)
  * returns (stream google.api.HttpBody);     }  Use of this type only changes
  * how the request and response bodies are handled, all other features will
  * continue to work unchanged.
  */
trait SchemaHttpBody extends StObject {
  
  /**
    * The HTTP Content-Type header value specifying the content type of the
    * body.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request/response body as raw binary.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
}
object SchemaHttpBody {
  
  @scala.inline
  def apply(): SchemaHttpBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpBody]
  }
  
  @scala.inline
  implicit class SchemaHttpBodyMutableBuilder[Self <: SchemaHttpBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "extensions", js.Array(value :_*))
  }
}
