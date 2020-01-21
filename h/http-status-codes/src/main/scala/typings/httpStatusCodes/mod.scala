package typings.httpStatusCodes

import typings.httpStatusCodes.httpStatusCodesNumbers.`100`
import typings.httpStatusCodes.httpStatusCodesNumbers.`101`
import typings.httpStatusCodes.httpStatusCodesNumbers.`102`
import typings.httpStatusCodes.httpStatusCodesNumbers.`200`
import typings.httpStatusCodes.httpStatusCodesNumbers.`201`
import typings.httpStatusCodes.httpStatusCodesNumbers.`202`
import typings.httpStatusCodes.httpStatusCodesNumbers.`203`
import typings.httpStatusCodes.httpStatusCodesNumbers.`204`
import typings.httpStatusCodes.httpStatusCodesNumbers.`205`
import typings.httpStatusCodes.httpStatusCodesNumbers.`206`
import typings.httpStatusCodes.httpStatusCodesNumbers.`207`
import typings.httpStatusCodes.httpStatusCodesNumbers.`300`
import typings.httpStatusCodes.httpStatusCodesNumbers.`301`
import typings.httpStatusCodes.httpStatusCodesNumbers.`302`
import typings.httpStatusCodes.httpStatusCodesNumbers.`303`
import typings.httpStatusCodes.httpStatusCodesNumbers.`304`
import typings.httpStatusCodes.httpStatusCodesNumbers.`305`
import typings.httpStatusCodes.httpStatusCodesNumbers.`307`
import typings.httpStatusCodes.httpStatusCodesNumbers.`308`
import typings.httpStatusCodes.httpStatusCodesNumbers.`400`
import typings.httpStatusCodes.httpStatusCodesNumbers.`401`
import typings.httpStatusCodes.httpStatusCodesNumbers.`402`
import typings.httpStatusCodes.httpStatusCodesNumbers.`403`
import typings.httpStatusCodes.httpStatusCodesNumbers.`404`
import typings.httpStatusCodes.httpStatusCodesNumbers.`405`
import typings.httpStatusCodes.httpStatusCodesNumbers.`406`
import typings.httpStatusCodes.httpStatusCodesNumbers.`407`
import typings.httpStatusCodes.httpStatusCodesNumbers.`408`
import typings.httpStatusCodes.httpStatusCodesNumbers.`409`
import typings.httpStatusCodes.httpStatusCodesNumbers.`410`
import typings.httpStatusCodes.httpStatusCodesNumbers.`411`
import typings.httpStatusCodes.httpStatusCodesNumbers.`412`
import typings.httpStatusCodes.httpStatusCodesNumbers.`413`
import typings.httpStatusCodes.httpStatusCodesNumbers.`414`
import typings.httpStatusCodes.httpStatusCodesNumbers.`415`
import typings.httpStatusCodes.httpStatusCodesNumbers.`416`
import typings.httpStatusCodes.httpStatusCodesNumbers.`417`
import typings.httpStatusCodes.httpStatusCodesNumbers.`418`
import typings.httpStatusCodes.httpStatusCodesNumbers.`419`
import typings.httpStatusCodes.httpStatusCodesNumbers.`420`
import typings.httpStatusCodes.httpStatusCodesNumbers.`422`
import typings.httpStatusCodes.httpStatusCodesNumbers.`423`
import typings.httpStatusCodes.httpStatusCodesNumbers.`424`
import typings.httpStatusCodes.httpStatusCodesNumbers.`428`
import typings.httpStatusCodes.httpStatusCodesNumbers.`429`
import typings.httpStatusCodes.httpStatusCodesNumbers.`431`
import typings.httpStatusCodes.httpStatusCodesNumbers.`500`
import typings.httpStatusCodes.httpStatusCodesNumbers.`501`
import typings.httpStatusCodes.httpStatusCodesNumbers.`502`
import typings.httpStatusCodes.httpStatusCodesNumbers.`503`
import typings.httpStatusCodes.httpStatusCodesNumbers.`504`
import typings.httpStatusCodes.httpStatusCodesNumbers.`505`
import typings.httpStatusCodes.httpStatusCodesNumbers.`507`
import typings.httpStatusCodes.httpStatusCodesNumbers.`511`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-status-codes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ACCEPTED: `202` = js.native
  val BAD_GATEWAY: `502` = js.native
  val BAD_REQUEST: `400` = js.native
  val CONFLICT: `409` = js.native
  val CONTINUE: `100` = js.native
  val CREATED: `201` = js.native
  val EXPECTATION_FAILED: `417` = js.native
  val FAILED_DEPENDENCY: `424` = js.native
  val FORBIDDEN: `403` = js.native
  val GATEWAY_TIMEOUT: `504` = js.native
  val GONE: `410` = js.native
  val HTTP_VERSION_NOT_SUPPORTED: `505` = js.native
  val IM_A_TEAPOT: `418` = js.native
  val INSUFFICIENT_SPACE_ON_RESOURCE: `419` = js.native
  val INSUFFICIENT_STORAGE: `507` = js.native
  val INTERNAL_SERVER_ERROR: `500` = js.native
  val LENGTH_REQUIRED: `411` = js.native
  val LOCKED: `423` = js.native
  val METHOD_FAILURE: `420` = js.native
  val METHOD_NOT_ALLOWED: `405` = js.native
  val MOVED_PERMANENTLY: `301` = js.native
  val MOVED_TEMPORARILY: `302` = js.native
  val MULTIPLE_CHOICES: `300` = js.native
  val MULTI_STATUS: `207` = js.native
  val NETWORK_AUTHENTICATION_REQUIRED: `511` = js.native
  val NON_AUTHORITATIVE_INFORMATION: `203` = js.native
  val NOT_ACCEPTABLE: `406` = js.native
  val NOT_FOUND: `404` = js.native
  val NOT_IMPLEMENTED: `501` = js.native
  val NOT_MODIFIED: `304` = js.native
  val NO_CONTENT: `204` = js.native
  val OK: `200` = js.native
  val PARTIAL_CONTENT: `206` = js.native
  val PAYMENT_REQUIRED: `402` = js.native
  val PERMANENT_REDIRECT: `308` = js.native
  val PRECONDITION_FAILED: `412` = js.native
  val PRECONDITION_REQUIRED: `428` = js.native
  val PROCESSING: `102` = js.native
  val PROXY_AUTHENTICATION_REQUIRED: `407` = js.native
  val REQUESTED_RANGE_NOT_SATISFIABLE: `416` = js.native
  val REQUEST_HEADER_FIELDS_TOO_LARGE: `431` = js.native
  val REQUEST_TIMEOUT: `408` = js.native
  val REQUEST_TOO_LONG: `413` = js.native
  val REQUEST_URI_TOO_LONG: `414` = js.native
  val RESET_CONTENT: `205` = js.native
  val SEE_OTHER: `303` = js.native
  val SERVICE_UNAVAILABLE: `503` = js.native
  val SWITCHING_PROTOCOLS: `101` = js.native
  val TEMPORARY_REDIRECT: `307` = js.native
  val TOO_MANY_REQUESTS: `429` = js.native
  val UNAUTHORIZED: `401` = js.native
  val UNPROCESSABLE_ENTITY: `422` = js.native
  val UNSUPPORTED_MEDIA_TYPE: `415` = js.native
  val USE_PROXY: `305` = js.native
  def getStatusCode(reasonPhrase: String): Double = js.native
  def getStatusText(statusCode: Double): String = js.native
}

