package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = js.native
  def cookieJar(): CookieJar = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def file(data: java.lang.String): FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String): FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String, contentType: java.lang.String): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String, contentType: java.lang.String): FileData = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: RequestBody, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: java.lang.String, body: scala.Null, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String, body: RequestBody): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String, body: RequestBody, params: GenericParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: java.lang.String, url: java.lang.String, body: scala.Null, params: GenericParams[RT]): RefinedResponse[RT] = js.native
}

