package typings.httpStatusCodes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-status-codes", JSImport.Namespace)
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
  def getStatusCode(reasonPhrase: String): Double = js.native
  def getStatusText(statusCode: Double): String = js.native
}

