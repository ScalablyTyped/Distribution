package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngineHttpRequest extends StObject {
  
  /**
    * Task-level setting for App Engine routing. * If app_engine_routing_override is set on the queue, this value is used for all tasks in the queue, no matter what the setting is for the
    * task-level app_engine_routing.
    */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  
  /** HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod. */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can
    * contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header
    * can be modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the
    * following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explicitly setting `Content-Type`
    * to a particular media type when the task is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Tasks. This value
    * is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the
    * task is dispatched, such as headers containing information about the task; see [request
    * headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible
    * when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the
    * Task. For more information, see the CreateTask documentation.
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * The HTTP method to use for the request. The default is POST. The app's request handler for the task's target URL must be able to handle HTTP requests with this http_method,
    * otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request
    * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How
    * Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
    */
  var httpMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The relative URI. The relative URI must begin with "/" and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then
    * the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
    */
  var relativeUri: js.UndefOr[String] = js.undefined
}
object AppEngineHttpRequest {
  
  inline def apply(): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
  
  extension [Self <: AppEngineHttpRequest](x: Self) {
    
    inline def setAppEngineRouting(value: AppEngineRouting): Self = StObject.set(x, "appEngineRouting", value.asInstanceOf[js.Any])
    
    inline def setAppEngineRoutingUndefined: Self = StObject.set(x, "appEngineRouting", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setRelativeUri(value: String): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
    
    inline def setRelativeUriUndefined: Self = StObject.set(x, "relativeUri", js.undefined)
  }
}
