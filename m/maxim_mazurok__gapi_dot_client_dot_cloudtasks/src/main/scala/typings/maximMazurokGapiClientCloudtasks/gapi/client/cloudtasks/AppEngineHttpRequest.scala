package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppEngineHttpRequest extends js.Object {
  
  /**
    * Task-level setting for App Engine routing. * If app_engine_routing_override is set on the queue, this value is used for all tasks in the queue, no matter what the setting is for the
    * task-level app_engine_routing.
    */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.native
  
  /** HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod. */
  var body: js.UndefOr[String] = js.native
  
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.AppEngineHttpRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The HTTP method to use for the request. The default is POST. The app's request handler for the task's target URL must be able to handle HTTP requests with this http_method,
    * otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request
    * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How
    * Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
    */
  var httpMethod: js.UndefOr[String] = js.native
  
  /**
    * The relative URI. The relative URI must begin with "/" and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then
    * the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
    */
  var relativeUri: js.UndefOr[String] = js.native
}
object AppEngineHttpRequest {
  
  @scala.inline
  def apply(): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
  
  @scala.inline
  implicit class AppEngineHttpRequestOps[Self <: AppEngineHttpRequest] (val x: Self) extends AnyVal {
    
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
    def setAppEngineRouting(value: AppEngineRouting): Self = this.set("appEngineRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineRouting: Self = this.set("appEngineRouting", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudtasks.maximMazurokGapiClientCloudtasksStrings.AppEngineHttpRequest with TopLevel[js.Any]
    ): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setRelativeUri(value: String): Self = this.set("relativeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeUri: Self = this.set("relativeUri", js.undefined)
  }
}
