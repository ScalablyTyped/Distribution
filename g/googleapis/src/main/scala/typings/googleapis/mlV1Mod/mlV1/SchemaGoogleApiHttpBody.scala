package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaGoogleApiHttpBody extends js.Object {
  
  /**
    * The HTTP Content-Type header value specifying the content type of the
    * body.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The HTTP request/response body as raw binary.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}
object SchemaGoogleApiHttpBody {
  
  @scala.inline
  def apply(): SchemaGoogleApiHttpBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiHttpBody]
  }
  
  @scala.inline
  implicit class SchemaGoogleApiHttpBodyOps[Self <: SchemaGoogleApiHttpBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: StringDictionary[js.Any]*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[StringDictionary[_]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
}
