package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngineHttpTarget extends StObject {
  
  /** App Engine Routing setting for the job. */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  
  /**
    * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible
    * HttpMethod.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: *
    * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Scheduler will append `"AppEngine-Google;
    * (+http://code.google.com/appengine)"` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the
    * job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC "Zulu" format.
    * If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can
    * be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `"application/json"`. *
    * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: *
    * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also
    * be sent to the job handler.
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.AppEngineHttpTarget & TopLevel[Any]
  ] = js.undefined
  
  /** The HTTP method to use for the request. PATCH and OPTIONS are not permitted. */
  var httpMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The relative URI. The relative URL must begin with "/" and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL
    * is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
    */
  var relativeUri: js.UndefOr[String] = js.undefined
}
object AppEngineHttpTarget {
  
  inline def apply(): AppEngineHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineHttpTarget]
  }
  
  extension [Self <: AppEngineHttpTarget](x: Self) {
    
    inline def setAppEngineRouting(value: AppEngineRouting): Self = StObject.set(x, "appEngineRouting", value.asInstanceOf[js.Any])
    
    inline def setAppEngineRoutingUndefined: Self = StObject.set(x, "appEngineRouting", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.AppEngineHttpTarget & TopLevel[Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setRelativeUri(value: String): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
    
    inline def setRelativeUriUndefined: Self = StObject.set(x, "relativeUri", js.undefined)
  }
}
