package typings.k6.httpMod

import typings.k6.k6Mod.bytes
import typings.k6.k6Strings.aa_compromise
import typings.k6.k6Strings.affiliation_changed
import typings.k6.k6Strings.ca_compromise
import typings.k6.k6Strings.certificate_hold
import typings.k6.k6Strings.cessation_of_operation
import typings.k6.k6Strings.good
import typings.k6.k6Strings.key_compromise
import typings.k6.k6Strings.privilege_withdrawn
import typings.k6.k6Strings.remove_from_crl
import typings.k6.k6Strings.revoked
import typings.k6.k6Strings.server_failed
import typings.k6.k6Strings.ssl3DOT0
import typings.k6.k6Strings.superseded
import typings.k6.k6Strings.tls1DOT0
import typings.k6.k6Strings.tls1DOT1
import typings.k6.k6Strings.tls1DOT2
import typings.k6.k6Strings.tls1DOT3
import typings.k6.k6Strings.unknown
import typings.k6.k6Strings.unspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val OCSP_REASON_AA_COMPROMISE: aa_compromise = js.native
  val OCSP_REASON_AFFILIATION_CHANGED: affiliation_changed = js.native
  val OCSP_REASON_CA_COMPROMISE: ca_compromise = js.native
  val OCSP_REASON_CERTIFICATE_HOLD: certificate_hold = js.native
  val OCSP_REASON_CESSATION_OF_OPERATION: cessation_of_operation = js.native
  val OCSP_REASON_KEY_COMPROMISE: key_compromise = js.native
  val OCSP_REASON_PRIVILEGE_WITHDRAWN: privilege_withdrawn = js.native
  val OCSP_REASON_REMOVE_FROM_CRL: remove_from_crl = js.native
  val OCSP_REASON_SUPERSEDED: superseded = js.native
  val OCSP_REASON_UNSPECIFIED: unspecified = js.native
  val OCSP_STATUS_GOOD: good = js.native
  val OCSP_STATUS_REVOKED: revoked = js.native
  val OCSP_STATUS_SERVER_FAILED: server_failed = js.native
  val OCSP_STATUS_UNKNOWN: unknown = js.native
  val SSL_3_0: ssl3DOT0 = js.native
  val TLS_1_0: tls1DOT0 = js.native
  val TLS_1_1: tls1DOT1 = js.native
  val TLS_1_2: tls1DOT2 = js.native
  val TLS_1_3: tls1DOT3 = js.native
  def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = js.native
  def cookieJar(): CookieJar = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def file(data: String): FileData = js.native
  def file(data: String, filename: String): FileData = js.native
  def file(data: String, filename: String, contentType: String): FileData = js.native
  def file(data: bytes): FileData = js.native
  def file(data: bytes, filename: String): FileData = js.native
  def file(data: bytes, filename: String, contentType: String): FileData = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
}

