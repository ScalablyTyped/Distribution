package typings.jpm

import typings.jpm.FFAddonSDK.SDKURL
import typings.jpm.anon.Anonymous
import typings.jpm.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Make simple network requests
  */
object requestMod {
  
  @js.native
  trait Request extends BaseRequest {
    
    var response: Response = js.native
  }
  object Request {
    
    @JSImport("sdk/request", "Request")
    @js.native
    def apply(options: Anonymous): Request = js.native
    @JSImport("sdk/request", "Request")
    @js.native
    def apply[ResponseType](options: Content[ResponseType]): STRequest[ResponseType] = js.native
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseRequest extends StObject {
    
    var content: String = js.native
    
    var contentType: String = js.native
    
    def delete(): Unit = js.native
    
    def get(): Unit = js.native
    
    def head(): Unit = js.native
    
    var headers: js.Object = js.native
    
    def post(): Unit = js.native
    
    def put(): Unit = js.native
    
    var url: String | SDKURL = js.native
  }
  object BaseRequest {
    
    @scala.inline
    def apply(
      content: String,
      contentType: String,
      delete: () => Unit,
      get: () => Unit,
      head: () => Unit,
      headers: js.Object,
      post: () => Unit,
      put: () => Unit,
      url: String | SDKURL
    ): BaseRequest = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers.asInstanceOf[js.Any], post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRequest]
    }
    
    @scala.inline
    implicit class BaseRequestMutableBuilder[Self <: BaseRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: () => Unit): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHead(value: () => Unit): Self = StObject.set(x, "head", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost(value: () => Unit): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPut(value: () => Unit): Self = StObject.set(x, "put", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrl(value: String | SDKURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseResponse extends StObject {
    
    var anonymous: Boolean = js.native
    
    var headers: js.Object = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
    
    var text: String = js.native
    
    var url: String = js.native
  }
  object BaseResponse {
    
    @scala.inline
    def apply(
      anonymous: Boolean,
      headers: js.Object,
      status: Double,
      statusText: String,
      text: String,
      url: String
    ): BaseResponse = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResponse]
    }
    
    @scala.inline
    implicit class BaseResponseMutableBuilder[Self <: BaseResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends BaseResponse {
    
    var json: js.Object = js.native
  }
  object Response {
    
    @scala.inline
    def apply(
      anonymous: Boolean,
      headers: js.Object,
      json: js.Object,
      status: Double,
      statusText: String,
      text: String,
      url: String
    ): Response = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: js.Object): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STRequest[ResponseType] extends BaseRequest {
    
    var response: STResponse[ResponseType] = js.native
  }
  object STRequest {
    
    @scala.inline
    def apply[ResponseType](
      content: String,
      contentType: String,
      delete: () => Unit,
      get: () => Unit,
      head: () => Unit,
      headers: js.Object,
      post: () => Unit,
      put: () => Unit,
      response: STResponse[ResponseType],
      url: String | SDKURL
    ): STRequest[ResponseType] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers.asInstanceOf[js.Any], post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), response = response.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[STRequest[ResponseType]]
    }
    
    @scala.inline
    implicit class STRequestMutableBuilder[Self <: STRequest[_], ResponseType] (val x: Self with STRequest[ResponseType]) extends AnyVal {
      
      @scala.inline
      def setResponse(value: STResponse[ResponseType]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STResponse[T] extends StObject {
    
    var json: T = js.native
  }
  object STResponse {
    
    @scala.inline
    def apply[T](json: T): STResponse[T] = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[STResponse[T]]
    }
    
    @scala.inline
    implicit class STResponseMutableBuilder[Self <: STResponse[_], T] (val x: Self with STResponse[T]) extends AnyVal {
      
      @scala.inline
      def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
}
