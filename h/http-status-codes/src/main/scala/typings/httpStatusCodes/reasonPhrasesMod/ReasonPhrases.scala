package typings.httpStatusCodes.reasonPhrasesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReasonPhrases extends js.Object
@JSImport("http-status-codes/build/cjs/reason-phrases", "ReasonPhrases")
@js.native
object ReasonPhrases extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReasonPhrases with String] = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.3
    *
    * The request has been received but not yet acted upon. It is non-committal, meaning that there is no way in HTTP to later send an asynchronous response indicating the outcome of processing the request. It is intended for cases where another process or server handles the request, or for batch processing.
    */
  @js.native
  sealed trait ACCEPTED extends ReasonPhrases
  /* "Accepted" */ @js.native
  object ACCEPTED extends TopLevel[ACCEPTED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.3
    *
    * This error response means that the server, while working as a gateway to get a response needed to handle the request, got an invalid response.
    */
  @js.native
  sealed trait BAD_GATEWAY extends ReasonPhrases
  /* "Bad Gateway" */ @js.native
  object BAD_GATEWAY extends TopLevel[BAD_GATEWAY with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.1
    *
    * This response means that server could not understand the request due to invalid syntax.
    */
  @js.native
  sealed trait BAD_REQUEST extends ReasonPhrases
  /* "Bad Request" */ @js.native
  object BAD_REQUEST extends TopLevel[BAD_REQUEST with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.8
    *
    * This response is sent when a request conflicts with the current state of the server.
    */
  @js.native
  sealed trait CONFLICT extends ReasonPhrases
  /* "Conflict" */ @js.native
  object CONFLICT extends TopLevel[CONFLICT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.2.1
    *
    * This interim response indicates that everything so far is OK and that the client should continue with the request or ignore it if it is already finished.
    */
  @js.native
  sealed trait CONTINUE extends ReasonPhrases
  /* "Continue" */ @js.native
  object CONTINUE extends TopLevel[CONTINUE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.2
    *
    * The request has succeeded and a new resource has been created as a result of it. This is typically the response sent after a PUT request.
    */
  @js.native
  sealed trait CREATED extends ReasonPhrases
  /* "Created" */ @js.native
  object CREATED extends TopLevel[CREATED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.14
    *
    * This response code means the expectation indicated by the Expect request header field can't be met by the server.
    */
  @js.native
  sealed trait EXPECTATION_FAILED extends ReasonPhrases
  /* "Expectation Failed" */ @js.native
  object EXPECTATION_FAILED extends TopLevel[EXPECTATION_FAILED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.5
    *
    * The request failed due to failure of a previous request.
    */
  @js.native
  sealed trait FAILED_DEPENDENCY extends ReasonPhrases
  /* "Failed Dependency" */ @js.native
  object FAILED_DEPENDENCY extends TopLevel[FAILED_DEPENDENCY with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.3
    *
    * The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.
    */
  @js.native
  sealed trait FORBIDDEN extends ReasonPhrases
  /* "Forbidden" */ @js.native
  object FORBIDDEN extends TopLevel[FORBIDDEN with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.5
    *
    * This error response is given when the server is acting as a gateway and cannot get a response in time.
    */
  @js.native
  sealed trait GATEWAY_TIMEOUT extends ReasonPhrases
  /* "Gateway Timeout" */ @js.native
  object GATEWAY_TIMEOUT extends TopLevel[GATEWAY_TIMEOUT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.9
    *
    * This response would be sent when the requested content has been permenantly deleted from server, with no forwarding address. Clients are expected to remove their caches and links to the resource. The HTTP specification intends this status code to be used for "limited-time, promotional services". APIs should not feel compelled to indicate resources that have been deleted with this status code.
    */
  @js.native
  sealed trait GONE extends ReasonPhrases
  /* "Gone" */ @js.native
  object GONE extends TopLevel[GONE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.6
    *
    * The HTTP version used in the request is not supported by the server.
    */
  @js.native
  sealed trait HTTP_VERSION_NOT_SUPPORTED extends ReasonPhrases
  /* "HTTP Version Not Supported" */ @js.native
  object HTTP_VERSION_NOT_SUPPORTED extends TopLevel[HTTP_VERSION_NOT_SUPPORTED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2324#section-2.3.2
    *
    * Any attempt to brew coffee with a teapot should result in the error code "418 I'm a teapot". The resulting entity body MAY be short and stout.
    */
  @js.native
  sealed trait IM_A_TEAPOT extends ReasonPhrases
  /* "I'm a teapot" */ @js.native
  object IM_A_TEAPOT extends TopLevel[IM_A_TEAPOT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.6
    *
    * The 507 (Insufficient Storage) status code means the method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request. This condition is considered to be temporary. If the request which received this status code was the result of a user action, the request MUST NOT be repeated until it is requested by a separate user action.
    */
  @js.native
  sealed trait INSUFFICIENT_SPACE_ON_RESOURCE extends ReasonPhrases
  /* "Insufficient Space on Resource" */ @js.native
  object INSUFFICIENT_SPACE_ON_RESOURCE extends TopLevel[INSUFFICIENT_SPACE_ON_RESOURCE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.6
    *
    * The server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.
    */
  @js.native
  sealed trait INSUFFICIENT_STORAGE extends ReasonPhrases
  /* "Insufficient Storage" */ @js.native
  object INSUFFICIENT_STORAGE extends TopLevel[INSUFFICIENT_STORAGE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.1
    *
    * The server encountered an unexpected condition that prevented it from fulfilling the request.
    */
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends ReasonPhrases
  /* "Internal Server Error" */ @js.native
  object INTERNAL_SERVER_ERROR extends TopLevel[INTERNAL_SERVER_ERROR with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.10
    *
    * The server rejected the request because the Content-Length header field is not defined and the server requires it.
    */
  @js.native
  sealed trait LENGTH_REQUIRED extends ReasonPhrases
  /* "Length Required" */ @js.native
  object LENGTH_REQUIRED extends TopLevel[LENGTH_REQUIRED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.4
    *
    * The resource that is being accessed is locked.
    */
  @js.native
  sealed trait LOCKED extends ReasonPhrases
  /* "Locked" */ @js.native
  object LOCKED extends TopLevel[LOCKED with String]
  
  /**
    * @deprecated
    * Official Documentation @ https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt
    *
    * A deprecated response used by the Spring Framework when a method has failed.
    */
  @js.native
  sealed trait METHOD_FAILURE extends ReasonPhrases
  /* "Method Failure" */ @js.native
  object METHOD_FAILURE extends TopLevel[METHOD_FAILURE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.5
    *
    * The request method is known by the server but has been disabled and cannot be used. For example, an API may forbid DELETE-ing a resource. The two mandatory methods, GET and HEAD, must never be disabled and should not return this error code.
    */
  @js.native
  sealed trait METHOD_NOT_ALLOWED extends ReasonPhrases
  /* "Method Not Allowed" */ @js.native
  object METHOD_NOT_ALLOWED extends TopLevel[METHOD_NOT_ALLOWED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.2
    *
    * This response code means that URI of requested resource has been changed. Probably, new URI would be given in the response.
    */
  @js.native
  sealed trait MOVED_PERMANENTLY extends ReasonPhrases
  /* "Moved Permanently" */ @js.native
  object MOVED_PERMANENTLY extends TopLevel[MOVED_PERMANENTLY with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.3
    *
    * This response code means that URI of requested resource has been changed temporarily. New changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests.
    */
  @js.native
  sealed trait MOVED_TEMPORARILY extends ReasonPhrases
  /* "Moved Temporarily" */ @js.native
  object MOVED_TEMPORARILY extends TopLevel[MOVED_TEMPORARILY with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.1
    *
    * The request has more than one possible responses. User-agent or user should choose one of them. There is no standardized way to choose one of the responses.
    */
  @js.native
  sealed trait MULTIPLE_CHOICES extends ReasonPhrases
  /* "Multiple Choices" */ @js.native
  object MULTIPLE_CHOICES extends TopLevel[MULTIPLE_CHOICES with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.2
    *
    * A Multi-Status response conveys information about multiple resources in situations where multiple status codes might be appropriate.
    */
  @js.native
  sealed trait MULTI_STATUS extends ReasonPhrases
  /* "Multi-Status" */ @js.native
  object MULTI_STATUS extends TopLevel[MULTI_STATUS with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-6
    *
    * The 511 status code indicates that the client needs to authenticate to gain network access.
    */
  @js.native
  sealed trait NETWORK_AUTHENTICATION_REQUIRED extends ReasonPhrases
  /* "Network Authentication Required" */ @js.native
  object NETWORK_AUTHENTICATION_REQUIRED extends TopLevel[NETWORK_AUTHENTICATION_REQUIRED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.4
    *
    * This response code means returned meta-information set is not exact set as available from the origin server, but collected from a local or a third party copy. Except this condition, 200 OK response should be preferred instead of this response.
    */
  @js.native
  sealed trait NON_AUTHORITATIVE_INFORMATION extends ReasonPhrases
  /* "Non Authoritative Information" */ @js.native
  object NON_AUTHORITATIVE_INFORMATION extends TopLevel[NON_AUTHORITATIVE_INFORMATION with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.6
    *
    * This response is sent when the web server, after performing server-driven content negotiation, doesn't find any content following the criteria given by the user agent.
    */
  @js.native
  sealed trait NOT_ACCEPTABLE extends ReasonPhrases
  /* "Not Acceptable" */ @js.native
  object NOT_ACCEPTABLE extends TopLevel[NOT_ACCEPTABLE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.4
    *
    * The server can not find requested resource. In the browser, this means the URL is not recognized. In an API, this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this response instead of 403 to hide the existence of a resource from an unauthorized client. This response code is probably the most famous one due to its frequent occurence on the web.
    */
  @js.native
  sealed trait NOT_FOUND extends ReasonPhrases
  /* "Not Found" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.2
    *
    * The request method is not supported by the server and cannot be handled. The only methods that servers are required to support (and therefore that must not return this code) are GET and HEAD.
    */
  @js.native
  sealed trait NOT_IMPLEMENTED extends ReasonPhrases
  /* "Not Implemented" */ @js.native
  object NOT_IMPLEMENTED extends TopLevel[NOT_IMPLEMENTED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7232#section-4.1
    *
    * This is used for caching purposes. It is telling to client that response has not been modified. So, client can continue to use same cached version of response.
    */
  @js.native
  sealed trait NOT_MODIFIED extends ReasonPhrases
  /* "Not Modified" */ @js.native
  object NOT_MODIFIED extends TopLevel[NOT_MODIFIED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.5
    *
    * There is no content to send for this request, but the headers may be useful. The user-agent may update its cached headers for this resource with the new ones.
    */
  @js.native
  sealed trait NO_CONTENT extends ReasonPhrases
  /* "No Content" */ @js.native
  object NO_CONTENT extends TopLevel[NO_CONTENT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.1
    *
    * The request has succeeded. The meaning of a success varies depending on the HTTP method:
    * GET: The resource has been fetched and is transmitted in the message body.
    * HEAD: The entity headers are in the message body.
    * POST: The resource describing the result of the action is transmitted in the message body.
    * TRACE: The message body contains the request message as received by the server
    */
  @js.native
  sealed trait OK extends ReasonPhrases
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7233#section-4.1
    *
    * This response code is used because of range header sent by the client to separate download into multiple streams.
    */
  @js.native
  sealed trait PARTIAL_CONTENT extends ReasonPhrases
  /* "Partial Content" */ @js.native
  object PARTIAL_CONTENT extends TopLevel[PARTIAL_CONTENT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.2
    *
    * This response code is reserved for future use. Initial aim for creating this code was using it for digital payment systems however this is not used currently.
    */
  @js.native
  sealed trait PAYMENT_REQUIRED extends ReasonPhrases
  /* "Payment Required" */ @js.native
  object PAYMENT_REQUIRED extends TopLevel[PAYMENT_REQUIRED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7538#section-3
    *
    * This means that the resource is now permanently located at another URI, specified by the Location: HTTP Response header. This has the same semantics as the 301 Moved Permanently HTTP response code, with the exception that the user agent must not change the HTTP method used: if a POST was used in the first request, a POST must be used in the second request.
    */
  @js.native
  sealed trait PERMANENT_REDIRECT extends ReasonPhrases
  /* "Permanent Redirect" */ @js.native
  object PERMANENT_REDIRECT extends TopLevel[PERMANENT_REDIRECT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7232#section-4.2
    *
    * The client has indicated preconditions in its headers which the server does not meet.
    */
  @js.native
  sealed trait PRECONDITION_FAILED extends ReasonPhrases
  /* "Precondition Failed" */ @js.native
  object PRECONDITION_FAILED extends TopLevel[PRECONDITION_FAILED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-3
    *
    * The origin server requires the request to be conditional. Intended to prevent the 'lost update' problem, where a client GETs a resource's state, modifies it, and PUTs it back to the server, when meanwhile a third party has modified the state on the server, leading to a conflict.
    */
  @js.native
  sealed trait PRECONDITION_REQUIRED extends ReasonPhrases
  /* "Precondition Required" */ @js.native
  object PRECONDITION_REQUIRED extends TopLevel[PRECONDITION_REQUIRED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.1
    *
    * This code indicates that the server has received and is processing the request, but no response is available yet.
    */
  @js.native
  sealed trait PROCESSING extends ReasonPhrases
  /* "Processing" */ @js.native
  object PROCESSING extends TopLevel[PROCESSING with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7235#section-3.2
    *
    * This is similar to 401 but authentication is needed to be done by a proxy.
    */
  @js.native
  sealed trait PROXY_AUTHENTICATION_REQUIRED extends ReasonPhrases
  /* "Proxy Authentication Required" */ @js.native
  object PROXY_AUTHENTICATION_REQUIRED extends TopLevel[PROXY_AUTHENTICATION_REQUIRED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7233#section-4.4
    *
    * The range specified by the Range header field in the request can't be fulfilled; it's possible that the range is outside the size of the target URI's data.
    */
  @js.native
  sealed trait REQUESTED_RANGE_NOT_SATISFIABLE extends ReasonPhrases
  /* "Requested Range Not Satisfiable" */ @js.native
  object REQUESTED_RANGE_NOT_SATISFIABLE extends TopLevel[REQUESTED_RANGE_NOT_SATISFIABLE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-5
    *
    * The server is unwilling to process the request because its header fields are too large. The request MAY be resubmitted after reducing the size of the request header fields.
    */
  @js.native
  sealed trait REQUEST_HEADER_FIELDS_TOO_LARGE extends ReasonPhrases
  /* "Request Header Fields Too Large" */ @js.native
  object REQUEST_HEADER_FIELDS_TOO_LARGE extends TopLevel[REQUEST_HEADER_FIELDS_TOO_LARGE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.7
    *
    * This response is sent on an idle connection by some servers, even without any previous request by the client. It means that the server would like to shut down this unused connection. This response is used much more since some browsers, like Chrome, Firefox 27+, or IE9, use HTTP pre-connection mechanisms to speed up surfing. Also note that some servers merely shut down the connection without sending this message.
    */
  @js.native
  sealed trait REQUEST_TIMEOUT extends ReasonPhrases
  /* "Request Timeout" */ @js.native
  object REQUEST_TIMEOUT extends TopLevel[REQUEST_TIMEOUT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.11
    *
    * Request entity is larger than limits defined by server; the server might close the connection or return an Retry-After header field.
    */
  @js.native
  sealed trait REQUEST_TOO_LONG extends ReasonPhrases
  /* "Request Entity Too Large" */ @js.native
  object REQUEST_TOO_LONG extends TopLevel[REQUEST_TOO_LONG with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.12
    *
    * The URI requested by the client is longer than the server is willing to interpret.
    */
  @js.native
  sealed trait REQUEST_URI_TOO_LONG extends ReasonPhrases
  /* "Request-URI Too Long" */ @js.native
  object REQUEST_URI_TOO_LONG extends TopLevel[REQUEST_URI_TOO_LONG with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.6
    *
    * This response code is sent after accomplishing request to tell user agent reset document view which sent this request.
    */
  @js.native
  sealed trait RESET_CONTENT extends ReasonPhrases
  /* "Reset Content" */ @js.native
  object RESET_CONTENT extends TopLevel[RESET_CONTENT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.4
    *
    * Server sent this response to directing client to get requested resource to another URI with an GET request.
    */
  @js.native
  sealed trait SEE_OTHER extends ReasonPhrases
  /* "See Other" */ @js.native
  object SEE_OTHER extends TopLevel[SEE_OTHER with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.4
    *
    * The server is not ready to handle the request. Common causes are a server that is down for maintenance or that is overloaded. Note that together with this response, a user-friendly page explaining the problem should be sent. This responses should be used for temporary conditions and the Retry-After: HTTP header should, if possible, contain the estimated time before the recovery of the service. The webmaster must also take care about the caching-related headers that are sent along with this response, as these temporary condition responses should usually not be cached.
    */
  @js.native
  sealed trait SERVICE_UNAVAILABLE extends ReasonPhrases
  /* "Service Unavailable" */ @js.native
  object SERVICE_UNAVAILABLE extends TopLevel[SERVICE_UNAVAILABLE with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.2.2
    *
    * This code is sent in response to an Upgrade request header by the client, and indicates the protocol the server is switching too.
    */
  @js.native
  sealed trait SWITCHING_PROTOCOLS extends ReasonPhrases
  /* "Switching Protocols" */ @js.native
  object SWITCHING_PROTOCOLS extends TopLevel[SWITCHING_PROTOCOLS with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.7
    *
    * Server sent this response to directing client to get requested resource to another URI with same method that used prior request. This has the same semantic than the 302 Found HTTP response code, with the exception that the user agent must not change the HTTP method used: if a POST was used in the first request, a POST must be used in the second request.
    */
  @js.native
  sealed trait TEMPORARY_REDIRECT extends ReasonPhrases
  /* "Temporary Redirect" */ @js.native
  object TEMPORARY_REDIRECT extends TopLevel[TEMPORARY_REDIRECT with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-4
    *
    * The user has sent too many requests in a given amount of time ("rate limiting").
    */
  @js.native
  sealed trait TOO_MANY_REQUESTS extends ReasonPhrases
  /* "Too Many Requests" */ @js.native
  object TOO_MANY_REQUESTS extends TopLevel[TOO_MANY_REQUESTS with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7235#section-3.1
    *
    * Although the HTTP standard specifies "unauthorized", semantically this response means "unauthenticated". That is, the client must authenticate itself to get the requested response.
    */
  @js.native
  sealed trait UNAUTHORIZED extends ReasonPhrases
  /* "Unauthorized" */ @js.native
  object UNAUTHORIZED extends TopLevel[UNAUTHORIZED with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7725
    *
    * The user-agent requested a resource that cannot legally be provided, such as a web page censored by a government.
    */
  @js.native
  sealed trait UNAVAILABLE_FOR_LEGAL_REASONS extends ReasonPhrases
  /* "Unavailable For Legal Reasons" */ @js.native
  object UNAVAILABLE_FOR_LEGAL_REASONS extends TopLevel[UNAVAILABLE_FOR_LEGAL_REASONS with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.3
    *
    * The request was well-formed but was unable to be followed due to semantic errors.
    */
  @js.native
  sealed trait UNPROCESSABLE_ENTITY extends ReasonPhrases
  /* "Unprocessable Entity" */ @js.native
  object UNPROCESSABLE_ENTITY extends TopLevel[UNPROCESSABLE_ENTITY with String]
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.13
    *
    * The media format of the requested data is not supported by the server, so the server is rejecting the request.
    */
  @js.native
  sealed trait UNSUPPORTED_MEDIA_TYPE extends ReasonPhrases
  /* "Unsupported Media Type" */ @js.native
  object UNSUPPORTED_MEDIA_TYPE extends TopLevel[UNSUPPORTED_MEDIA_TYPE with String]
  
  /**
    * @deprecated
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.6
    *
    * Was defined in a previous version of the HTTP specification to indicate that a requested response must be accessed by a proxy. It has been deprecated due to security concerns regarding in-band configuration of a proxy.
    */
  @js.native
  sealed trait USE_PROXY extends ReasonPhrases
  /* "Use Proxy" */ @js.native
  object USE_PROXY extends TopLevel[USE_PROXY with String]
}
