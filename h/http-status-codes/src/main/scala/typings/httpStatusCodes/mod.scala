package typings.httpStatusCodes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-status-codes/build/cjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ACCEPTED: /* 202 */ Double = js.native
  
  val BAD_GATEWAY: /* 502 */ Double = js.native
  
  val BAD_REQUEST: /* 400 */ Double = js.native
  
  val CONFLICT: /* 409 */ Double = js.native
  
  val CONTINUE: /* 100 */ Double = js.native
  
  val CREATED: /* 201 */ Double = js.native
  
  val EXPECTATION_FAILED: /* 417 */ Double = js.native
  
  val FAILED_DEPENDENCY: /* 424 */ Double = js.native
  
  val FORBIDDEN: /* 403 */ Double = js.native
  
  val GATEWAY_TIMEOUT: /* 504 */ Double = js.native
  
  val GONE: /* 410 */ Double = js.native
  
  val HTTP_VERSION_NOT_SUPPORTED: /* 505 */ Double = js.native
  
  val IM_A_TEAPOT: /* 418 */ Double = js.native
  
  val INSUFFICIENT_SPACE_ON_RESOURCE: /* 419 */ Double = js.native
  
  val INSUFFICIENT_STORAGE: /* 507 */ Double = js.native
  
  val INTERNAL_SERVER_ERROR: /* 500 */ Double = js.native
  
  val LENGTH_REQUIRED: /* 411 */ Double = js.native
  
  val LOCKED: /* 423 */ Double = js.native
  
  val METHOD_FAILURE: /* 420 */ Double = js.native
  
  val METHOD_NOT_ALLOWED: /* 405 */ Double = js.native
  
  val MOVED_PERMANENTLY: /* 301 */ Double = js.native
  
  val MOVED_TEMPORARILY: /* 302 */ Double = js.native
  
  val MULTIPLE_CHOICES: /* 300 */ Double = js.native
  
  val MULTI_STATUS: /* 207 */ Double = js.native
  
  val NETWORK_AUTHENTICATION_REQUIRED: /* 511 */ Double = js.native
  
  val NON_AUTHORITATIVE_INFORMATION: /* 203 */ Double = js.native
  
  val NOT_ACCEPTABLE: /* 406 */ Double = js.native
  
  val NOT_FOUND: /* 404 */ Double = js.native
  
  val NOT_IMPLEMENTED: /* 501 */ Double = js.native
  
  val NOT_MODIFIED: /* 304 */ Double = js.native
  
  val NO_CONTENT: /* 204 */ Double = js.native
  
  val OK: /* 200 */ Double = js.native
  
  val PARTIAL_CONTENT: /* 206 */ Double = js.native
  
  val PAYMENT_REQUIRED: /* 402 */ Double = js.native
  
  val PERMANENT_REDIRECT: /* 308 */ Double = js.native
  
  val PRECONDITION_FAILED: /* 412 */ Double = js.native
  
  val PRECONDITION_REQUIRED: /* 428 */ Double = js.native
  
  val PROCESSING: /* 102 */ Double = js.native
  
  val PROXY_AUTHENTICATION_REQUIRED: /* 407 */ Double = js.native
  
  val REQUESTED_RANGE_NOT_SATISFIABLE: /* 416 */ Double = js.native
  
  val REQUEST_HEADER_FIELDS_TOO_LARGE: /* 431 */ Double = js.native
  
  val REQUEST_TIMEOUT: /* 408 */ Double = js.native
  
  val REQUEST_TOO_LONG: /* 413 */ Double = js.native
  
  val REQUEST_URI_TOO_LONG: /* 414 */ Double = js.native
  
  val RESET_CONTENT: /* 205 */ Double = js.native
  
  val SEE_OTHER: /* 303 */ Double = js.native
  
  val SERVICE_UNAVAILABLE: /* 503 */ Double = js.native
  
  val SWITCHING_PROTOCOLS: /* 101 */ Double = js.native
  
  val TEMPORARY_REDIRECT: /* 307 */ Double = js.native
  
  val TOO_MANY_REQUESTS: /* 429 */ Double = js.native
  
  val UNAUTHORIZED: /* 401 */ Double = js.native
  
  val UNPROCESSABLE_ENTITY: /* 422 */ Double = js.native
  
  val UNSUPPORTED_MEDIA_TYPE: /* 415 */ Double = js.native
  
  val USE_PROXY: /* 305 */ Double = js.native
  
  def getReasonPhrase(statusCode: String): String = js.native
  def getReasonPhrase(statusCode: Double): String = js.native
  
  def getStatusCode(reasonPhrase: String): Double = js.native
  
  val getStatusText: js.Function1[/* statusCode */ Double | String, String] = js.native
  
  @js.native
  object ReasonPhrases extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases with String] = js.native
    
    /* "Accepted" */ val ACCEPTED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.ACCEPTED with String = js.native
    
    /* "Bad Gateway" */ val BAD_GATEWAY: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.BAD_GATEWAY with String = js.native
    
    /* "Bad Request" */ val BAD_REQUEST: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.BAD_REQUEST with String = js.native
    
    /* "Conflict" */ val CONFLICT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.CONFLICT with String = js.native
    
    /* "Continue" */ val CONTINUE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.CONTINUE with String = js.native
    
    /* "Created" */ val CREATED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.CREATED with String = js.native
    
    /* "Expectation Failed" */ val EXPECTATION_FAILED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.EXPECTATION_FAILED with String = js.native
    
    /* "Failed Dependency" */ val FAILED_DEPENDENCY: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.FAILED_DEPENDENCY with String = js.native
    
    /* "Forbidden" */ val FORBIDDEN: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.FORBIDDEN with String = js.native
    
    /* "Gateway Timeout" */ val GATEWAY_TIMEOUT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.GATEWAY_TIMEOUT with String = js.native
    
    /* "Gone" */ val GONE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.GONE with String = js.native
    
    /* "HTTP Version Not Supported" */ val HTTP_VERSION_NOT_SUPPORTED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.HTTP_VERSION_NOT_SUPPORTED with String = js.native
    
    /* "I'm a teapot" */ val IM_A_TEAPOT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.IM_A_TEAPOT with String = js.native
    
    /* "Insufficient Space on Resource" */ val INSUFFICIENT_SPACE_ON_RESOURCE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.INSUFFICIENT_SPACE_ON_RESOURCE with String = js.native
    
    /* "Insufficient Storage" */ val INSUFFICIENT_STORAGE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.INSUFFICIENT_STORAGE with String = js.native
    
    /* "Internal Server Error" */ val INTERNAL_SERVER_ERROR: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.INTERNAL_SERVER_ERROR with String = js.native
    
    /* "Length Required" */ val LENGTH_REQUIRED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.LENGTH_REQUIRED with String = js.native
    
    /* "Locked" */ val LOCKED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.LOCKED with String = js.native
    
    /* "Method Failure" */ val METHOD_FAILURE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.METHOD_FAILURE with String = js.native
    
    /* "Method Not Allowed" */ val METHOD_NOT_ALLOWED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.METHOD_NOT_ALLOWED with String = js.native
    
    /* "Moved Permanently" */ val MOVED_PERMANENTLY: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.MOVED_PERMANENTLY with String = js.native
    
    /* "Moved Temporarily" */ val MOVED_TEMPORARILY: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.MOVED_TEMPORARILY with String = js.native
    
    /* "Multiple Choices" */ val MULTIPLE_CHOICES: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.MULTIPLE_CHOICES with String = js.native
    
    /* "Multi-Status" */ val MULTI_STATUS: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.MULTI_STATUS with String = js.native
    
    /* "Network Authentication Required" */ val NETWORK_AUTHENTICATION_REQUIRED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NETWORK_AUTHENTICATION_REQUIRED with String = js.native
    
    /* "Non Authoritative Information" */ val NON_AUTHORITATIVE_INFORMATION: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NON_AUTHORITATIVE_INFORMATION with String = js.native
    
    /* "Not Acceptable" */ val NOT_ACCEPTABLE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NOT_ACCEPTABLE with String = js.native
    
    /* "Not Found" */ val NOT_FOUND: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NOT_FOUND with String = js.native
    
    /* "Not Implemented" */ val NOT_IMPLEMENTED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NOT_IMPLEMENTED with String = js.native
    
    /* "Not Modified" */ val NOT_MODIFIED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NOT_MODIFIED with String = js.native
    
    /* "No Content" */ val NO_CONTENT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.NO_CONTENT with String = js.native
    
    /* "OK" */ val OK: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.OK with String = js.native
    
    /* "Partial Content" */ val PARTIAL_CONTENT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PARTIAL_CONTENT with String = js.native
    
    /* "Payment Required" */ val PAYMENT_REQUIRED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PAYMENT_REQUIRED with String = js.native
    
    /* "Permanent Redirect" */ val PERMANENT_REDIRECT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PERMANENT_REDIRECT with String = js.native
    
    /* "Precondition Failed" */ val PRECONDITION_FAILED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PRECONDITION_FAILED with String = js.native
    
    /* "Precondition Required" */ val PRECONDITION_REQUIRED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PRECONDITION_REQUIRED with String = js.native
    
    /* "Processing" */ val PROCESSING: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PROCESSING with String = js.native
    
    /* "Proxy Authentication Required" */ val PROXY_AUTHENTICATION_REQUIRED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.PROXY_AUTHENTICATION_REQUIRED with String = js.native
    
    /* "Requested Range Not Satisfiable" */ val REQUESTED_RANGE_NOT_SATISFIABLE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.REQUESTED_RANGE_NOT_SATISFIABLE with String = js.native
    
    /* "Request Header Fields Too Large" */ val REQUEST_HEADER_FIELDS_TOO_LARGE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.REQUEST_HEADER_FIELDS_TOO_LARGE with String = js.native
    
    /* "Request Timeout" */ val REQUEST_TIMEOUT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.REQUEST_TIMEOUT with String = js.native
    
    /* "Request Entity Too Large" */ val REQUEST_TOO_LONG: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.REQUEST_TOO_LONG with String = js.native
    
    /* "Request-URI Too Long" */ val REQUEST_URI_TOO_LONG: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.REQUEST_URI_TOO_LONG with String = js.native
    
    /* "Reset Content" */ val RESET_CONTENT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.RESET_CONTENT with String = js.native
    
    /* "See Other" */ val SEE_OTHER: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.SEE_OTHER with String = js.native
    
    /* "Service Unavailable" */ val SERVICE_UNAVAILABLE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.SERVICE_UNAVAILABLE with String = js.native
    
    /* "Switching Protocols" */ val SWITCHING_PROTOCOLS: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.SWITCHING_PROTOCOLS with String = js.native
    
    /* "Temporary Redirect" */ val TEMPORARY_REDIRECT: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.TEMPORARY_REDIRECT with String = js.native
    
    /* "Too Many Requests" */ val TOO_MANY_REQUESTS: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.TOO_MANY_REQUESTS with String = js.native
    
    /* "Unauthorized" */ val UNAUTHORIZED: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.UNAUTHORIZED with String = js.native
    
    /* "Unavailable For Legal Reasons" */ val UNAVAILABLE_FOR_LEGAL_REASONS: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.UNAVAILABLE_FOR_LEGAL_REASONS with String = js.native
    
    /* "Unprocessable Entity" */ val UNPROCESSABLE_ENTITY: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.UNPROCESSABLE_ENTITY with String = js.native
    
    /* "Unsupported Media Type" */ val UNSUPPORTED_MEDIA_TYPE: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.UNSUPPORTED_MEDIA_TYPE with String = js.native
    
    /* "Use Proxy" */ val USE_PROXY: typings.httpStatusCodes.reasonPhrasesMod.ReasonPhrases.USE_PROXY with String = js.native
  }
  
  @js.native
  object StatusCodes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.httpStatusCodes.statusCodesMod.StatusCodes with Double] = js.native
    
    /* 202 */ val ACCEPTED: typings.httpStatusCodes.statusCodesMod.StatusCodes.ACCEPTED with Double = js.native
    
    /* 502 */ val BAD_GATEWAY: typings.httpStatusCodes.statusCodesMod.StatusCodes.BAD_GATEWAY with Double = js.native
    
    /* 400 */ val BAD_REQUEST: typings.httpStatusCodes.statusCodesMod.StatusCodes.BAD_REQUEST with Double = js.native
    
    /* 409 */ val CONFLICT: typings.httpStatusCodes.statusCodesMod.StatusCodes.CONFLICT with Double = js.native
    
    /* 100 */ val CONTINUE: typings.httpStatusCodes.statusCodesMod.StatusCodes.CONTINUE with Double = js.native
    
    /* 201 */ val CREATED: typings.httpStatusCodes.statusCodesMod.StatusCodes.CREATED with Double = js.native
    
    /* 417 */ val EXPECTATION_FAILED: typings.httpStatusCodes.statusCodesMod.StatusCodes.EXPECTATION_FAILED with Double = js.native
    
    /* 424 */ val FAILED_DEPENDENCY: typings.httpStatusCodes.statusCodesMod.StatusCodes.FAILED_DEPENDENCY with Double = js.native
    
    /* 403 */ val FORBIDDEN: typings.httpStatusCodes.statusCodesMod.StatusCodes.FORBIDDEN with Double = js.native
    
    /* 504 */ val GATEWAY_TIMEOUT: typings.httpStatusCodes.statusCodesMod.StatusCodes.GATEWAY_TIMEOUT with Double = js.native
    
    /* 410 */ val GONE: typings.httpStatusCodes.statusCodesMod.StatusCodes.GONE with Double = js.native
    
    /* 505 */ val HTTP_VERSION_NOT_SUPPORTED: typings.httpStatusCodes.statusCodesMod.StatusCodes.HTTP_VERSION_NOT_SUPPORTED with Double = js.native
    
    /* 418 */ val IM_A_TEAPOT: typings.httpStatusCodes.statusCodesMod.StatusCodes.IM_A_TEAPOT with Double = js.native
    
    /* 419 */ val INSUFFICIENT_SPACE_ON_RESOURCE: typings.httpStatusCodes.statusCodesMod.StatusCodes.INSUFFICIENT_SPACE_ON_RESOURCE with Double = js.native
    
    /* 507 */ val INSUFFICIENT_STORAGE: typings.httpStatusCodes.statusCodesMod.StatusCodes.INSUFFICIENT_STORAGE with Double = js.native
    
    /* 500 */ val INTERNAL_SERVER_ERROR: typings.httpStatusCodes.statusCodesMod.StatusCodes.INTERNAL_SERVER_ERROR with Double = js.native
    
    /* 411 */ val LENGTH_REQUIRED: typings.httpStatusCodes.statusCodesMod.StatusCodes.LENGTH_REQUIRED with Double = js.native
    
    /* 423 */ val LOCKED: typings.httpStatusCodes.statusCodesMod.StatusCodes.LOCKED with Double = js.native
    
    /* 420 */ val METHOD_FAILURE: typings.httpStatusCodes.statusCodesMod.StatusCodes.METHOD_FAILURE with Double = js.native
    
    /* 405 */ val METHOD_NOT_ALLOWED: typings.httpStatusCodes.statusCodesMod.StatusCodes.METHOD_NOT_ALLOWED with Double = js.native
    
    /* 301 */ val MOVED_PERMANENTLY: typings.httpStatusCodes.statusCodesMod.StatusCodes.MOVED_PERMANENTLY with Double = js.native
    
    /* 302 */ val MOVED_TEMPORARILY: typings.httpStatusCodes.statusCodesMod.StatusCodes.MOVED_TEMPORARILY with Double = js.native
    
    /* 300 */ val MULTIPLE_CHOICES: typings.httpStatusCodes.statusCodesMod.StatusCodes.MULTIPLE_CHOICES with Double = js.native
    
    /* 207 */ val MULTI_STATUS: typings.httpStatusCodes.statusCodesMod.StatusCodes.MULTI_STATUS with Double = js.native
    
    /* 511 */ val NETWORK_AUTHENTICATION_REQUIRED: typings.httpStatusCodes.statusCodesMod.StatusCodes.NETWORK_AUTHENTICATION_REQUIRED with Double = js.native
    
    /* 203 */ val NON_AUTHORITATIVE_INFORMATION: typings.httpStatusCodes.statusCodesMod.StatusCodes.NON_AUTHORITATIVE_INFORMATION with Double = js.native
    
    /* 406 */ val NOT_ACCEPTABLE: typings.httpStatusCodes.statusCodesMod.StatusCodes.NOT_ACCEPTABLE with Double = js.native
    
    /* 404 */ val NOT_FOUND: typings.httpStatusCodes.statusCodesMod.StatusCodes.NOT_FOUND with Double = js.native
    
    /* 501 */ val NOT_IMPLEMENTED: typings.httpStatusCodes.statusCodesMod.StatusCodes.NOT_IMPLEMENTED with Double = js.native
    
    /* 304 */ val NOT_MODIFIED: typings.httpStatusCodes.statusCodesMod.StatusCodes.NOT_MODIFIED with Double = js.native
    
    /* 204 */ val NO_CONTENT: typings.httpStatusCodes.statusCodesMod.StatusCodes.NO_CONTENT with Double = js.native
    
    /* 200 */ val OK: typings.httpStatusCodes.statusCodesMod.StatusCodes.OK with Double = js.native
    
    /* 206 */ val PARTIAL_CONTENT: typings.httpStatusCodes.statusCodesMod.StatusCodes.PARTIAL_CONTENT with Double = js.native
    
    /* 402 */ val PAYMENT_REQUIRED: typings.httpStatusCodes.statusCodesMod.StatusCodes.PAYMENT_REQUIRED with Double = js.native
    
    /* 308 */ val PERMANENT_REDIRECT: typings.httpStatusCodes.statusCodesMod.StatusCodes.PERMANENT_REDIRECT with Double = js.native
    
    /* 412 */ val PRECONDITION_FAILED: typings.httpStatusCodes.statusCodesMod.StatusCodes.PRECONDITION_FAILED with Double = js.native
    
    /* 428 */ val PRECONDITION_REQUIRED: typings.httpStatusCodes.statusCodesMod.StatusCodes.PRECONDITION_REQUIRED with Double = js.native
    
    /* 102 */ val PROCESSING: typings.httpStatusCodes.statusCodesMod.StatusCodes.PROCESSING with Double = js.native
    
    /* 407 */ val PROXY_AUTHENTICATION_REQUIRED: typings.httpStatusCodes.statusCodesMod.StatusCodes.PROXY_AUTHENTICATION_REQUIRED with Double = js.native
    
    /* 416 */ val REQUESTED_RANGE_NOT_SATISFIABLE: typings.httpStatusCodes.statusCodesMod.StatusCodes.REQUESTED_RANGE_NOT_SATISFIABLE with Double = js.native
    
    /* 431 */ val REQUEST_HEADER_FIELDS_TOO_LARGE: typings.httpStatusCodes.statusCodesMod.StatusCodes.REQUEST_HEADER_FIELDS_TOO_LARGE with Double = js.native
    
    /* 408 */ val REQUEST_TIMEOUT: typings.httpStatusCodes.statusCodesMod.StatusCodes.REQUEST_TIMEOUT with Double = js.native
    
    /* 413 */ val REQUEST_TOO_LONG: typings.httpStatusCodes.statusCodesMod.StatusCodes.REQUEST_TOO_LONG with Double = js.native
    
    /* 414 */ val REQUEST_URI_TOO_LONG: typings.httpStatusCodes.statusCodesMod.StatusCodes.REQUEST_URI_TOO_LONG with Double = js.native
    
    /* 205 */ val RESET_CONTENT: typings.httpStatusCodes.statusCodesMod.StatusCodes.RESET_CONTENT with Double = js.native
    
    /* 303 */ val SEE_OTHER: typings.httpStatusCodes.statusCodesMod.StatusCodes.SEE_OTHER with Double = js.native
    
    /* 503 */ val SERVICE_UNAVAILABLE: typings.httpStatusCodes.statusCodesMod.StatusCodes.SERVICE_UNAVAILABLE with Double = js.native
    
    /* 101 */ val SWITCHING_PROTOCOLS: typings.httpStatusCodes.statusCodesMod.StatusCodes.SWITCHING_PROTOCOLS with Double = js.native
    
    /* 307 */ val TEMPORARY_REDIRECT: typings.httpStatusCodes.statusCodesMod.StatusCodes.TEMPORARY_REDIRECT with Double = js.native
    
    /* 429 */ val TOO_MANY_REQUESTS: typings.httpStatusCodes.statusCodesMod.StatusCodes.TOO_MANY_REQUESTS with Double = js.native
    
    /* 401 */ val UNAUTHORIZED: typings.httpStatusCodes.statusCodesMod.StatusCodes.UNAUTHORIZED with Double = js.native
    
    /* 451 */ val UNAVAILABLE_FOR_LEGAL_REASONS: typings.httpStatusCodes.statusCodesMod.StatusCodes.UNAVAILABLE_FOR_LEGAL_REASONS with Double = js.native
    
    /* 422 */ val UNPROCESSABLE_ENTITY: typings.httpStatusCodes.statusCodesMod.StatusCodes.UNPROCESSABLE_ENTITY with Double = js.native
    
    /* 415 */ val UNSUPPORTED_MEDIA_TYPE: typings.httpStatusCodes.statusCodesMod.StatusCodes.UNSUPPORTED_MEDIA_TYPE with Double = js.native
    
    /* 305 */ val USE_PROXY: typings.httpStatusCodes.statusCodesMod.StatusCodes.USE_PROXY with Double = js.native
  }
  
  @js.native
  object default extends js.Object {
    
    var ACCEPTED: Double = js.native
    
    var BAD_GATEWAY: Double = js.native
    
    var BAD_REQUEST: Double = js.native
    
    var CONFLICT: Double = js.native
    
    var CONTINUE: Double = js.native
    
    var CREATED: Double = js.native
    
    var EXPECTATION_FAILED: Double = js.native
    
    var FORBIDDEN: Double = js.native
    
    var GATEWAY_TIMEOUT: Double = js.native
    
    var GONE: Double = js.native
    
    var HTTP_VERSION_NOT_SUPPORTED: Double = js.native
    
    var IM_A_TEAPOT: Double = js.native
    
    var INSUFFICIENT_SPACE_ON_RESOURCE: Double = js.native
    
    var INSUFFICIENT_STORAGE: Double = js.native
    
    var INTERNAL_SERVER_ERROR: Double = js.native
    
    var LENGTH_REQUIRED: Double = js.native
    
    var LOCKED: Double = js.native
    
    var METHOD_FAILURE: Double = js.native
    
    var METHOD_NOT_ALLOWED: Double = js.native
    
    var MOVED_PERMANENTLY: Double = js.native
    
    var MOVED_TEMPORARILY: Double = js.native
    
    var MULTIPLE_CHOICES: Double = js.native
    
    var MULTI_STATUS: Double = js.native
    
    var NETWORK_AUTHENTICATION_REQUIRED: Double = js.native
    
    var NON_AUTHORITATIVE_INFORMATION: Double = js.native
    
    var NOT_ACCEPTABLE: Double = js.native
    
    var NOT_FOUND: Double = js.native
    
    var NOT_IMPLEMENTED: Double = js.native
    
    var NOT_MODIFIED: Double = js.native
    
    var NO_CONTENT: Double = js.native
    
    var OK: Double = js.native
    
    var PARTIAL_CONTENT: Double = js.native
    
    var PAYMENT_REQUIRED: Double = js.native
    
    var PERMANENT_REDIRECT: Double = js.native
    
    var PRECONDITION_FAILED: Double = js.native
    
    var PRECONDITION_REQUIRED: Double = js.native
    
    var PROCESSING: Double = js.native
    
    var PROXY_AUTHENTICATION_REQUIRED: Double = js.native
    
    var REQUESTED_RANGE_NOT_SATISFIABLE: Double = js.native
    
    var REQUEST_HEADER_FIELDS_TOO_LARGE: Double = js.native
    
    var REQUEST_TIMEOUT: Double = js.native
    
    var REQUEST_TOO_LONG: Double = js.native
    
    var REQUEST_URI_TOO_LONG: Double = js.native
    
    var RESET_CONTENT: Double = js.native
    
    var SEE_OTHER: Double = js.native
    
    var SERVICE_UNAVAILABLE: Double = js.native
    
    var SWITCHING_PROTOCOLS: Double = js.native
    
    var TEMPORARY_REDIRECT: Double = js.native
    
    var TOO_MANY_REQUESTS: Double = js.native
    
    var UNAUTHORIZED: Double = js.native
    
    var UNPROCESSABLE_ENTITY: Double = js.native
    
    var UNSUPPORTED_MEDIA_TYPE: Double = js.native
    
    var USE_PROXY: Double = js.native
    
    def getStatusCode(reasonPhrase: String): Double = js.native
    @JSName("getStatusCode")
    var getStatusCode_Original: js.Function1[/* reasonPhrase */ String, Double] = js.native
    
    def getStatusText(statusCode: String): String = js.native
    def getStatusText(statusCode: Double): String = js.native
    @JSName("getStatusText")
    var getStatusText_Original: js.Function1[/* statusCode */ Double | String, String] = js.native
  }
}
