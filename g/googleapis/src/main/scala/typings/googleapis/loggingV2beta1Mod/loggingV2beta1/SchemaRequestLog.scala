package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Complete log information about a single HTTP request to an App Engine
  * application.
  */
@js.native
trait SchemaRequestLog extends js.Object {
  
  /**
    * App Engine release version.
    */
  var appEngineRelease: js.UndefOr[String] = js.native
  
  /**
    * Application that handled this request.
    */
  var appId: js.UndefOr[String] = js.native
  
  /**
    * An indication of the relative cost of serving this request.
    */
  var cost: js.UndefOr[Double] = js.native
  
  /**
    * Time when the request finished.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Whether this request is finished or active.
    */
  var finished: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this is the first RequestLog entry for this request. If an active
    * request has several RequestLog entries written to Stackdriver Logging,
    * then this field will be set for one of them.
    */
  var first: js.UndefOr[Boolean] = js.native
  
  /**
    * Internet host and port number of the resource being requested.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * HTTP version of request. Example: &quot;HTTP/1.1&quot;.
    */
  var httpVersion: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the instance that handled the request.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * If the instance processing this request belongs to a manually scaled
    * module, then this is the 0-based index of the instance. Otherwise, this
    * value is -1.
    */
  var instanceIndex: js.UndefOr[Double] = js.native
  
  /**
    * Origin IP address.
    */
  var ip: js.UndefOr[String] = js.native
  
  /**
    * Latency of the request.
    */
  var latency: js.UndefOr[String] = js.native
  
  /**
    * A list of log lines emitted by the application while serving this
    * request.
    */
  var line: js.UndefOr[js.Array[SchemaLogLine]] = js.native
  
  /**
    * Number of CPU megacycles used to process request.
    */
  var megaCycles: js.UndefOr[String] = js.native
  
  /**
    * Request method. Example: &quot;GET&quot;, &quot;HEAD&quot;,
    * &quot;PUT&quot;, &quot;POST&quot;, &quot;DELETE&quot;.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * Module of the application that handled this request.
    */
  var moduleId: js.UndefOr[String] = js.native
  
  /**
    * The logged-in user who made the request.Most likely, this is the part of
    * the user&#39;s email before the @ sign. The field value is the same for
    * different requests from the same user, but different users can have
    * similar names. This information is also available to the application via
    * the App Engine Users API.This field will be populated starting with App
    * Engine 1.9.21.
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * Time this request spent in the pending request queue.
    */
  var pendingTime: js.UndefOr[String] = js.native
  
  /**
    * Referrer URL of request.
    */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * Globally unique identifier for a request, which is based on the request
    * start time. Request IDs for requests which started later will compare
    * greater as strings than those for requests which started earlier.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * Contains the path and query portion of the URL that was requested. For
    * example, if the URL was &quot;http://example.com/app?name=val&quot;, the
    * resource would be &quot;/app?name=val&quot;. The fragment identifier,
    * which is identified by the # character, is not included.
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Size in bytes sent back to client by request.
    */
  var responseSize: js.UndefOr[String] = js.native
  
  /**
    * Source code for the application that handled this request. There can be
    * more than one source reference per deployed application if source code is
    * distributed among multiple repositories.
    */
  var sourceReference: js.UndefOr[js.Array[SchemaSourceReference]] = js.native
  
  /**
    * Time when the request started.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * HTTP response status code. Example: 200, 404.
    */
  var status: js.UndefOr[Double] = js.native
  
  /**
    * Task name of the request, in the case of an offline request.
    */
  var taskName: js.UndefOr[String] = js.native
  
  /**
    * Queue name of the request, in the case of an offline request.
    */
  var taskQueueName: js.UndefOr[String] = js.native
  
  /**
    * Stackdriver Trace identifier for this request.
    */
  var traceId: js.UndefOr[String] = js.native
  
  /**
    * If true, the value in the &#39;trace_id&#39; field was sampled for
    * storage in a trace backend.
    */
  var traceSampled: js.UndefOr[Boolean] = js.native
  
  /**
    * File or class that handled the request.
    */
  var urlMapEntry: js.UndefOr[String] = js.native
  
  /**
    * User agent that made the request.
    */
  var userAgent: js.UndefOr[String] = js.native
  
  /**
    * Version of the application that handled this request.
    */
  var versionId: js.UndefOr[String] = js.native
  
  /**
    * Whether this was a loading request for the instance.
    */
  var wasLoadingRequest: js.UndefOr[Boolean] = js.native
}
object SchemaRequestLog {
  
  @scala.inline
  def apply(): SchemaRequestLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestLog]
  }
  
  @scala.inline
  implicit class SchemaRequestLogOps[Self <: SchemaRequestLog] (val x: Self) extends AnyVal {
    
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
    def setAppEngineRelease(value: String): Self = this.set("appEngineRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineRelease: Self = this.set("appEngineRelease", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFinished(value: Boolean): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinished: Self = this.set("finished", js.undefined)
    
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttpVersion(value: String): Self = this.set("httpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpVersion: Self = this.set("httpVersion", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setInstanceIndex(value: Double): Self = this.set("instanceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIndex: Self = this.set("instanceIndex", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setLatency(value: String): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setLineVarargs(value: SchemaLogLine*): Self = this.set("line", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: js.Array[SchemaLogLine]): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMegaCycles(value: String): Self = this.set("megaCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMegaCycles: Self = this.set("megaCycles", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    
    @scala.inline
    def setPendingTime(value: String): Self = this.set("pendingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingTime: Self = this.set("pendingTime", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResponseSize(value: String): Self = this.set("responseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseSize: Self = this.set("responseSize", js.undefined)
    
    @scala.inline
    def setSourceReferenceVarargs(value: SchemaSourceReference*): Self = this.set("sourceReference", js.Array(value :_*))
    
    @scala.inline
    def setSourceReference(value: js.Array[SchemaSourceReference]): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTaskName(value: String): Self = this.set("taskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskName: Self = this.set("taskName", js.undefined)
    
    @scala.inline
    def setTaskQueueName(value: String): Self = this.set("taskQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskQueueName: Self = this.set("taskQueueName", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
    
    @scala.inline
    def setTraceSampled(value: Boolean): Self = this.set("traceSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceSampled: Self = this.set("traceSampled", js.undefined)
    
    @scala.inline
    def setUrlMapEntry(value: String): Self = this.set("urlMapEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMapEntry: Self = this.set("urlMapEntry", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
    
    @scala.inline
    def setWasLoadingRequest(value: Boolean): Self = this.set("wasLoadingRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWasLoadingRequest: Self = this.set("wasLoadingRequest", js.undefined)
  }
}
