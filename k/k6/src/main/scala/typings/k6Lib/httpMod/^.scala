package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val OCSP_REASON_AA_COMPROMISE: k6Lib.k6LibStrings.aa_compromise = js.native
  val OCSP_REASON_AFFILIATION_CHANGED: k6Lib.k6LibStrings.affiliation_changed = js.native
  val OCSP_REASON_CA_COMPROMISE: k6Lib.k6LibStrings.ca_compromise = js.native
  val OCSP_REASON_CERTIFICATE_HOLD: k6Lib.k6LibStrings.certificate_hold = js.native
  val OCSP_REASON_CESSATION_OF_OPERATION: k6Lib.k6LibStrings.cessation_of_operation = js.native
  val OCSP_REASON_KEY_COMPROMISE: k6Lib.k6LibStrings.key_compromise = js.native
  val OCSP_REASON_PRIVILEGE_WITHDRAWN: k6Lib.k6LibStrings.privilege_withdrawn = js.native
  val OCSP_REASON_REMOVE_FROM_CRL: k6Lib.k6LibStrings.remove_from_crl = js.native
  val OCSP_REASON_SUPERSEDED: k6Lib.k6LibStrings.superseded = js.native
  val OCSP_REASON_UNSPECIFIED: k6Lib.k6LibStrings.unspecified = js.native
  val OCSP_STATUS_GOOD: k6Lib.k6LibStrings.good = js.native
  val OCSP_STATUS_REVOKED: k6Lib.k6LibStrings.revoked = js.native
  val OCSP_STATUS_SERVER_FAILED: k6Lib.k6LibStrings.server_failed = js.native
  val OCSP_STATUS_UNKNOWN: k6Lib.k6LibStrings.unknown = js.native
  val SSL_3_0: k6Lib.k6LibStrings.ssl3DOT0 = js.native
  val TLS_1_0: k6Lib.k6LibStrings.tls1DOT0 = js.native
  val TLS_1_1: k6Lib.k6LibStrings.tls1DOT1 = js.native
  val TLS_1_2: k6Lib.k6LibStrings.tls1DOT2 = js.native
  def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = js.native
  def cookieJar(): CookieJar = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def file(data: java.lang.String): FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String): FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String, contentType: java.lang.String): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String, contentType: java.lang.String): FileData = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String, body: scala.Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
}

