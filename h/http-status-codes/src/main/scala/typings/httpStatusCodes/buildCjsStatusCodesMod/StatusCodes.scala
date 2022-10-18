package typings.httpStatusCodes.buildCjsStatusCodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusCodes extends StObject
@JSImport("http-status-codes/build/cjs/status-codes", "StatusCodes")
@js.native
object StatusCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusCodes & Double] = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.3
    *
    * The request has been received but not yet acted upon. It is non-committal, meaning that there is no way in HTTP to later send an asynchronous response indicating the outcome of processing the request. It is intended for cases where another process or server handles the request, or for batch processing.
    */
  @js.native
  sealed trait ACCEPTED
    extends StObject
       with StatusCodes
  /* 202 */ val ACCEPTED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.ACCEPTED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.3
    *
    * This error response means that the server, while working as a gateway to get a response needed to handle the request, got an invalid response.
    */
  @js.native
  sealed trait BAD_GATEWAY
    extends StObject
       with StatusCodes
  /* 502 */ val BAD_GATEWAY: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.BAD_GATEWAY & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.1
    *
    * This response means that server could not understand the request due to invalid syntax.
    */
  @js.native
  sealed trait BAD_REQUEST
    extends StObject
       with StatusCodes
  /* 400 */ val BAD_REQUEST: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.BAD_REQUEST & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.8
    *
    * This response is sent when a request conflicts with the current state of the server.
    */
  @js.native
  sealed trait CONFLICT
    extends StObject
       with StatusCodes
  /* 409 */ val CONFLICT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.CONFLICT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.2.1
    *
    * This interim response indicates that everything so far is OK and that the client should continue with the request or ignore it if it is already finished.
    */
  @js.native
  sealed trait CONTINUE
    extends StObject
       with StatusCodes
  /* 100 */ val CONTINUE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.CONTINUE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.2
    *
    * The request has succeeded and a new resource has been created as a result of it. This is typically the response sent after a PUT request.
    */
  @js.native
  sealed trait CREATED
    extends StObject
       with StatusCodes
  /* 201 */ val CREATED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.CREATED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.14
    *
    * This response code means the expectation indicated by the Expect request header field can't be met by the server.
    */
  @js.native
  sealed trait EXPECTATION_FAILED
    extends StObject
       with StatusCodes
  /* 417 */ val EXPECTATION_FAILED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.EXPECTATION_FAILED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.5
    *
    * The request failed due to failure of a previous request.
    */
  @js.native
  sealed trait FAILED_DEPENDENCY
    extends StObject
       with StatusCodes
  /* 424 */ val FAILED_DEPENDENCY: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.FAILED_DEPENDENCY & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.3
    *
    * The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.
    */
  @js.native
  sealed trait FORBIDDEN
    extends StObject
       with StatusCodes
  /* 403 */ val FORBIDDEN: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.FORBIDDEN & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.5
    *
    * This error response is given when the server is acting as a gateway and cannot get a response in time.
    */
  @js.native
  sealed trait GATEWAY_TIMEOUT
    extends StObject
       with StatusCodes
  /* 504 */ val GATEWAY_TIMEOUT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.GATEWAY_TIMEOUT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.9
    *
    * This response would be sent when the requested content has been permenantly deleted from server, with no forwarding address. Clients are expected to remove their caches and links to the resource. The HTTP specification intends this status code to be used for "limited-time, promotional services". APIs should not feel compelled to indicate resources that have been deleted with this status code.
    */
  @js.native
  sealed trait GONE
    extends StObject
       with StatusCodes
  /* 410 */ val GONE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.GONE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.6
    *
    * The HTTP version used in the request is not supported by the server.
    */
  @js.native
  sealed trait HTTP_VERSION_NOT_SUPPORTED
    extends StObject
       with StatusCodes
  /* 505 */ val HTTP_VERSION_NOT_SUPPORTED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.HTTP_VERSION_NOT_SUPPORTED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2324#section-2.3.2
    *
    * Any attempt to brew coffee with a teapot should result in the error code "418 I'm a teapot". The resulting entity body MAY be short and stout.
    */
  @js.native
  sealed trait IM_A_TEAPOT
    extends StObject
       with StatusCodes
  /* 418 */ val IM_A_TEAPOT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.IM_A_TEAPOT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.6
    *
    * The 507 (Insufficient Storage) status code means the method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request. This condition is considered to be temporary. If the request which received this status code was the result of a user action, the request MUST NOT be repeated until it is requested by a separate user action.
    */
  @js.native
  sealed trait INSUFFICIENT_SPACE_ON_RESOURCE
    extends StObject
       with StatusCodes
  /* 419 */ val INSUFFICIENT_SPACE_ON_RESOURCE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.INSUFFICIENT_SPACE_ON_RESOURCE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.6
    *
    * The server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.
    */
  @js.native
  sealed trait INSUFFICIENT_STORAGE
    extends StObject
       with StatusCodes
  /* 507 */ val INSUFFICIENT_STORAGE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.INSUFFICIENT_STORAGE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.1
    *
    * The server encountered an unexpected condition that prevented it from fulfilling the request.
    */
  @js.native
  sealed trait INTERNAL_SERVER_ERROR
    extends StObject
       with StatusCodes
  /* 500 */ val INTERNAL_SERVER_ERROR: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.INTERNAL_SERVER_ERROR & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.10
    *
    * The server rejected the request because the Content-Length header field is not defined and the server requires it.
    */
  @js.native
  sealed trait LENGTH_REQUIRED
    extends StObject
       with StatusCodes
  /* 411 */ val LENGTH_REQUIRED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.LENGTH_REQUIRED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.4
    *
    * The resource that is being accessed is locked.
    */
  @js.native
  sealed trait LOCKED
    extends StObject
       with StatusCodes
  /* 423 */ val LOCKED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.LOCKED & Double = js.native
  
  /**
    * @deprecated
    * Official Documentation @ https://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt
    *
    * A deprecated response used by the Spring Framework when a method has failed.
    */
  @js.native
  sealed trait METHOD_FAILURE
    extends StObject
       with StatusCodes
  /* 420 */ val METHOD_FAILURE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.METHOD_FAILURE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.5
    *
    * The request method is known by the server but has been disabled and cannot be used. For example, an API may forbid DELETE-ing a resource. The two mandatory methods, GET and HEAD, must never be disabled and should not return this error code.
    */
  @js.native
  sealed trait METHOD_NOT_ALLOWED
    extends StObject
       with StatusCodes
  /* 405 */ val METHOD_NOT_ALLOWED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.METHOD_NOT_ALLOWED & Double = js.native
  
  /**
    * Official Documentation @ https://datatracker.ietf.org/doc/html/rfc7540#section-9.1.2
    *
    * Defined in the specification of HTTP/2 to indicate that a server is not able to produce a response for the combination of scheme and authority that are included in the request URI.
    */
  @js.native
  sealed trait MISDIRECTED_REQUEST
    extends StObject
       with StatusCodes
  /* 421 */ val MISDIRECTED_REQUEST: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.MISDIRECTED_REQUEST & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.2
    *
    * This response code means that URI of requested resource has been changed. Probably, new URI would be given in the response.
    */
  @js.native
  sealed trait MOVED_PERMANENTLY
    extends StObject
       with StatusCodes
  /* 301 */ val MOVED_PERMANENTLY: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.MOVED_PERMANENTLY & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.3
    *
    * This response code means that URI of requested resource has been changed temporarily. New changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests.
    */
  @js.native
  sealed trait MOVED_TEMPORARILY
    extends StObject
       with StatusCodes
  /* 302 */ val MOVED_TEMPORARILY: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.MOVED_TEMPORARILY & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.1
    *
    * The request has more than one possible responses. User-agent or user should choose one of them. There is no standardized way to choose one of the responses.
    */
  @js.native
  sealed trait MULTIPLE_CHOICES
    extends StObject
       with StatusCodes
  /* 300 */ val MULTIPLE_CHOICES: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.MULTIPLE_CHOICES & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.2
    *
    * A Multi-Status response conveys information about multiple resources in situations where multiple status codes might be appropriate.
    */
  @js.native
  sealed trait MULTI_STATUS
    extends StObject
       with StatusCodes
  /* 207 */ val MULTI_STATUS: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.MULTI_STATUS & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-6
    *
    * The 511 status code indicates that the client needs to authenticate to gain network access.
    */
  @js.native
  sealed trait NETWORK_AUTHENTICATION_REQUIRED
    extends StObject
       with StatusCodes
  /* 511 */ val NETWORK_AUTHENTICATION_REQUIRED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NETWORK_AUTHENTICATION_REQUIRED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.4
    *
    * This response code means returned meta-information set is not exact set as available from the origin server, but collected from a local or a third party copy. Except this condition, 200 OK response should be preferred instead of this response.
    */
  @js.native
  sealed trait NON_AUTHORITATIVE_INFORMATION
    extends StObject
       with StatusCodes
  /* 203 */ val NON_AUTHORITATIVE_INFORMATION: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NON_AUTHORITATIVE_INFORMATION & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.6
    *
    * This response is sent when the web server, after performing server-driven content negotiation, doesn't find any content following the criteria given by the user agent.
    */
  @js.native
  sealed trait NOT_ACCEPTABLE
    extends StObject
       with StatusCodes
  /* 406 */ val NOT_ACCEPTABLE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NOT_ACCEPTABLE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.4
    *
    * The server can not find requested resource. In the browser, this means the URL is not recognized. In an API, this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this response instead of 403 to hide the existence of a resource from an unauthorized client. This response code is probably the most famous one due to its frequent occurence on the web.
    */
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with StatusCodes
  /* 404 */ val NOT_FOUND: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NOT_FOUND & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.2
    *
    * The request method is not supported by the server and cannot be handled. The only methods that servers are required to support (and therefore that must not return this code) are GET and HEAD.
    */
  @js.native
  sealed trait NOT_IMPLEMENTED
    extends StObject
       with StatusCodes
  /* 501 */ val NOT_IMPLEMENTED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NOT_IMPLEMENTED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7232#section-4.1
    *
    * This is used for caching purposes. It is telling to client that response has not been modified. So, client can continue to use same cached version of response.
    */
  @js.native
  sealed trait NOT_MODIFIED
    extends StObject
       with StatusCodes
  /* 304 */ val NOT_MODIFIED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NOT_MODIFIED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.5
    *
    * There is no content to send for this request, but the headers may be useful. The user-agent may update its cached headers for this resource with the new ones.
    */
  @js.native
  sealed trait NO_CONTENT
    extends StObject
       with StatusCodes
  /* 204 */ val NO_CONTENT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.NO_CONTENT & Double = js.native
  
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
  sealed trait OK
    extends StObject
       with StatusCodes
  /* 200 */ val OK: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.OK & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7233#section-4.1
    *
    * This response code is used because of range header sent by the client to separate download into multiple streams.
    */
  @js.native
  sealed trait PARTIAL_CONTENT
    extends StObject
       with StatusCodes
  /* 206 */ val PARTIAL_CONTENT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PARTIAL_CONTENT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.2
    *
    * This response code is reserved for future use. Initial aim for creating this code was using it for digital payment systems however this is not used currently.
    */
  @js.native
  sealed trait PAYMENT_REQUIRED
    extends StObject
       with StatusCodes
  /* 402 */ val PAYMENT_REQUIRED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PAYMENT_REQUIRED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7538#section-3
    *
    * This means that the resource is now permanently located at another URI, specified by the Location: HTTP Response header. This has the same semantics as the 301 Moved Permanently HTTP response code, with the exception that the user agent must not change the HTTP method used: if a POST was used in the first request, a POST must be used in the second request.
    */
  @js.native
  sealed trait PERMANENT_REDIRECT
    extends StObject
       with StatusCodes
  /* 308 */ val PERMANENT_REDIRECT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PERMANENT_REDIRECT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7232#section-4.2
    *
    * The client has indicated preconditions in its headers which the server does not meet.
    */
  @js.native
  sealed trait PRECONDITION_FAILED
    extends StObject
       with StatusCodes
  /* 412 */ val PRECONDITION_FAILED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PRECONDITION_FAILED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-3
    *
    * The origin server requires the request to be conditional. Intended to prevent the 'lost update' problem, where a client GETs a resource's state, modifies it, and PUTs it back to the server, when meanwhile a third party has modified the state on the server, leading to a conflict.
    */
  @js.native
  sealed trait PRECONDITION_REQUIRED
    extends StObject
       with StatusCodes
  /* 428 */ val PRECONDITION_REQUIRED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PRECONDITION_REQUIRED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.1
    *
    * This code indicates that the server has received and is processing the request, but no response is available yet.
    */
  @js.native
  sealed trait PROCESSING
    extends StObject
       with StatusCodes
  /* 102 */ val PROCESSING: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PROCESSING & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7235#section-3.2
    *
    * This is similar to 401 but authentication is needed to be done by a proxy.
    */
  @js.native
  sealed trait PROXY_AUTHENTICATION_REQUIRED
    extends StObject
       with StatusCodes
  /* 407 */ val PROXY_AUTHENTICATION_REQUIRED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.PROXY_AUTHENTICATION_REQUIRED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7233#section-4.4
    *
    * The range specified by the Range header field in the request can't be fulfilled; it's possible that the range is outside the size of the target URI's data.
    */
  @js.native
  sealed trait REQUESTED_RANGE_NOT_SATISFIABLE
    extends StObject
       with StatusCodes
  /* 416 */ val REQUESTED_RANGE_NOT_SATISFIABLE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.REQUESTED_RANGE_NOT_SATISFIABLE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-5
    *
    * The server is unwilling to process the request because its header fields are too large. The request MAY be resubmitted after reducing the size of the request header fields.
    */
  @js.native
  sealed trait REQUEST_HEADER_FIELDS_TOO_LARGE
    extends StObject
       with StatusCodes
  /* 431 */ val REQUEST_HEADER_FIELDS_TOO_LARGE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.REQUEST_HEADER_FIELDS_TOO_LARGE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.7
    *
    * This response is sent on an idle connection by some servers, even without any previous request by the client. It means that the server would like to shut down this unused connection. This response is used much more since some browsers, like Chrome, Firefox 27+, or IE9, use HTTP pre-connection mechanisms to speed up surfing. Also note that some servers merely shut down the connection without sending this message.
    */
  @js.native
  sealed trait REQUEST_TIMEOUT
    extends StObject
       with StatusCodes
  /* 408 */ val REQUEST_TIMEOUT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.REQUEST_TIMEOUT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.11
    *
    * Request entity is larger than limits defined by server; the server might close the connection or return an Retry-After header field.
    */
  @js.native
  sealed trait REQUEST_TOO_LONG
    extends StObject
       with StatusCodes
  /* 413 */ val REQUEST_TOO_LONG: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.REQUEST_TOO_LONG & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.12
    *
    * The URI requested by the client is longer than the server is willing to interpret.
    */
  @js.native
  sealed trait REQUEST_URI_TOO_LONG
    extends StObject
       with StatusCodes
  /* 414 */ val REQUEST_URI_TOO_LONG: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.REQUEST_URI_TOO_LONG & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.3.6
    *
    * This response code is sent after accomplishing request to tell user agent reset document view which sent this request.
    */
  @js.native
  sealed trait RESET_CONTENT
    extends StObject
       with StatusCodes
  /* 205 */ val RESET_CONTENT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.RESET_CONTENT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.4
    *
    * Server sent this response to directing client to get requested resource to another URI with an GET request.
    */
  @js.native
  sealed trait SEE_OTHER
    extends StObject
       with StatusCodes
  /* 303 */ val SEE_OTHER: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.SEE_OTHER & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.6.4
    *
    * The server is not ready to handle the request. Common causes are a server that is down for maintenance or that is overloaded. Note that together with this response, a user-friendly page explaining the problem should be sent. This responses should be used for temporary conditions and the Retry-After: HTTP header should, if possible, contain the estimated time before the recovery of the service. The webmaster must also take care about the caching-related headers that are sent along with this response, as these temporary condition responses should usually not be cached.
    */
  @js.native
  sealed trait SERVICE_UNAVAILABLE
    extends StObject
       with StatusCodes
  /* 503 */ val SERVICE_UNAVAILABLE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.SERVICE_UNAVAILABLE & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.2.2
    *
    * This code is sent in response to an Upgrade request header by the client, and indicates the protocol the server is switching too.
    */
  @js.native
  sealed trait SWITCHING_PROTOCOLS
    extends StObject
       with StatusCodes
  /* 101 */ val SWITCHING_PROTOCOLS: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.SWITCHING_PROTOCOLS & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.7
    *
    * Server sent this response to directing client to get requested resource to another URI with same method that used prior request. This has the same semantic than the 302 Found HTTP response code, with the exception that the user agent must not change the HTTP method used: if a POST was used in the first request, a POST must be used in the second request.
    */
  @js.native
  sealed trait TEMPORARY_REDIRECT
    extends StObject
       with StatusCodes
  /* 307 */ val TEMPORARY_REDIRECT: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.TEMPORARY_REDIRECT & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc6585#section-4
    *
    * The user has sent too many requests in a given amount of time ("rate limiting").
    */
  @js.native
  sealed trait TOO_MANY_REQUESTS
    extends StObject
       with StatusCodes
  /* 429 */ val TOO_MANY_REQUESTS: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.TOO_MANY_REQUESTS & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7235#section-3.1
    *
    * Although the HTTP standard specifies "unauthorized", semantically this response means "unauthenticated". That is, the client must authenticate itself to get the requested response.
    */
  @js.native
  sealed trait UNAUTHORIZED
    extends StObject
       with StatusCodes
  /* 401 */ val UNAUTHORIZED: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.UNAUTHORIZED & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7725
    *
    * The user-agent requested a resource that cannot legally be provided, such as a web page censored by a government.
    */
  @js.native
  sealed trait UNAVAILABLE_FOR_LEGAL_REASONS
    extends StObject
       with StatusCodes
  /* 451 */ val UNAVAILABLE_FOR_LEGAL_REASONS: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.UNAVAILABLE_FOR_LEGAL_REASONS & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc2518#section-10.3
    *
    * The request was well-formed but was unable to be followed due to semantic errors.
    */
  @js.native
  sealed trait UNPROCESSABLE_ENTITY
    extends StObject
       with StatusCodes
  /* 422 */ val UNPROCESSABLE_ENTITY: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.UNPROCESSABLE_ENTITY & Double = js.native
  
  /**
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.5.13
    *
    * The media format of the requested data is not supported by the server, so the server is rejecting the request.
    */
  @js.native
  sealed trait UNSUPPORTED_MEDIA_TYPE
    extends StObject
       with StatusCodes
  /* 415 */ val UNSUPPORTED_MEDIA_TYPE: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.UNSUPPORTED_MEDIA_TYPE & Double = js.native
  
  /**
    * @deprecated
    * Official Documentation @ https://tools.ietf.org/html/rfc7231#section-6.4.6
    *
    * Was defined in a previous version of the HTTP specification to indicate that a requested response must be accessed by a proxy. It has been deprecated due to security concerns regarding in-band configuration of a proxy.
    */
  @js.native
  sealed trait USE_PROXY
    extends StObject
       with StatusCodes
  /* 305 */ val USE_PROXY: typings.httpStatusCodes.buildCjsStatusCodesMod.StatusCodes.USE_PROXY & Double = js.native
}
