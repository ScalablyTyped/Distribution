package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", JSImport.Namespace)
@js.native
object httpModMembers extends js.Object {
  def batch(requests: js.Array[Request]): js.Array[Response] = js.native
  @JSName("batch")
  def batch_StringDictionary(requests: js.Array[Request]): org.scalablytyped.runtime.StringDictionary[Response] = js.native
  def del(url: java.lang.String): Response = js.native
  def del(url: java.lang.String, body: java.lang.String): Response = js.native
  def del(url: java.lang.String, body: java.lang.String, params: RequestParams): Response = js.native
  def del(url: java.lang.String, body: js.Object): Response = js.native
  def del(url: java.lang.String, body: js.Object, params: RequestParams): Response = js.native
  def file(data: java.lang.String): FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String): FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String, contentType: java.lang.String): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String): FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String, contentType: java.lang.String): FileData = js.native
  def get(url: java.lang.String): Response = js.native
  def get(url: java.lang.String, params: RequestParams): Response = js.native
  def options(url: java.lang.String): Response = js.native
  def options(url: java.lang.String, body: java.lang.String): Response = js.native
  def options(url: java.lang.String, body: java.lang.String, params: RequestParams): Response = js.native
  def options(url: java.lang.String, body: js.Object): Response = js.native
  def options(url: java.lang.String, body: js.Object, params: RequestParams): Response = js.native
  def patch(url: java.lang.String): Response = js.native
  def patch(url: java.lang.String, body: java.lang.String): Response = js.native
  def patch(url: java.lang.String, body: java.lang.String, params: RequestParams): Response = js.native
  def patch(url: java.lang.String, body: js.Object): Response = js.native
  def patch(url: java.lang.String, body: js.Object, params: RequestParams): Response = js.native
  def post(url: java.lang.String): Response = js.native
  def post(url: java.lang.String, body: java.lang.String): Response = js.native
  def post(url: java.lang.String, body: java.lang.String, params: RequestParams): Response = js.native
  def post(url: java.lang.String, body: js.Object): Response = js.native
  def post(url: java.lang.String, body: js.Object, params: RequestParams): Response = js.native
  def put(url: java.lang.String): Response = js.native
  def put(url: java.lang.String, body: java.lang.String): Response = js.native
  def put(url: java.lang.String, body: java.lang.String, params: RequestParams): Response = js.native
  def put(url: java.lang.String, body: js.Object): Response = js.native
  def put(url: java.lang.String, body: js.Object, params: RequestParams): Response = js.native
  def request(method: java.lang.String, url: java.lang.String): Response = js.native
  def request(method: java.lang.String, url: java.lang.String, body: java.lang.String): Response = js.native
  def request(method: java.lang.String, url: java.lang.String, body: java.lang.String, params: RequestParams): Response = js.native
  def request(method: java.lang.String, url: java.lang.String, body: js.Object): Response = js.native
  def request(method: java.lang.String, url: java.lang.String, body: js.Object, params: RequestParams): Response = js.native
}

