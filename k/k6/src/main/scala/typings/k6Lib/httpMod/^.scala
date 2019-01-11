package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def batch(requests: js.Array[k6Lib.httpMod.Request]): js.Array[k6Lib.httpMod.Response] = js.native
  @JSName("batch")
  def batch_StringDictionary(requests: js.Array[k6Lib.httpMod.Request]): org.scalablytyped.runtime.StringDictionary[k6Lib.httpMod.Response] = js.native
  def del(url: java.lang.String): k6Lib.httpMod.Response = js.native
  def del(url: java.lang.String, body: java.lang.String): k6Lib.httpMod.Response = js.native
  def del(url: java.lang.String, body: java.lang.String, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def del(url: java.lang.String, body: js.Object): k6Lib.httpMod.Response = js.native
  def del(url: java.lang.String, body: js.Object, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def file(data: java.lang.String): k6Lib.httpMod.FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String): k6Lib.httpMod.FileData = js.native
  def file(data: java.lang.String, filename: java.lang.String, contentType: java.lang.String): k6Lib.httpMod.FileData = js.native
  def file(data: k6Lib.k6Mod.bytes): k6Lib.httpMod.FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String): k6Lib.httpMod.FileData = js.native
  def file(data: k6Lib.k6Mod.bytes, filename: java.lang.String, contentType: java.lang.String): k6Lib.httpMod.FileData = js.native
  def get(url: java.lang.String): k6Lib.httpMod.Response = js.native
  def get(url: java.lang.String, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def options(url: java.lang.String): k6Lib.httpMod.Response = js.native
  def options(url: java.lang.String, body: java.lang.String): k6Lib.httpMod.Response = js.native
  def options(url: java.lang.String, body: java.lang.String, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def options(url: java.lang.String, body: js.Object): k6Lib.httpMod.Response = js.native
  def options(url: java.lang.String, body: js.Object, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def patch(url: java.lang.String): k6Lib.httpMod.Response = js.native
  def patch(url: java.lang.String, body: java.lang.String): k6Lib.httpMod.Response = js.native
  def patch(url: java.lang.String, body: java.lang.String, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def patch(url: java.lang.String, body: js.Object): k6Lib.httpMod.Response = js.native
  def patch(url: java.lang.String, body: js.Object, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def post(url: java.lang.String): k6Lib.httpMod.Response = js.native
  def post(url: java.lang.String, body: java.lang.String): k6Lib.httpMod.Response = js.native
  def post(url: java.lang.String, body: java.lang.String, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def post(url: java.lang.String, body: js.Object): k6Lib.httpMod.Response = js.native
  def post(url: java.lang.String, body: js.Object, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def put(url: java.lang.String): k6Lib.httpMod.Response = js.native
  def put(url: java.lang.String, body: java.lang.String): k6Lib.httpMod.Response = js.native
  def put(url: java.lang.String, body: java.lang.String, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def put(url: java.lang.String, body: js.Object): k6Lib.httpMod.Response = js.native
  def put(url: java.lang.String, body: js.Object, params: k6Lib.httpMod.RequestParams): k6Lib.httpMod.Response = js.native
  def request(method: java.lang.String, url: java.lang.String): k6Lib.httpMod.Response = js.native
  def request(method: java.lang.String, url: java.lang.String, body: java.lang.String): k6Lib.httpMod.Response = js.native
  def request(
    method: java.lang.String,
    url: java.lang.String,
    body: java.lang.String,
    params: k6Lib.httpMod.RequestParams
  ): k6Lib.httpMod.Response = js.native
  def request(method: java.lang.String, url: java.lang.String, body: js.Object): k6Lib.httpMod.Response = js.native
  def request(
    method: java.lang.String,
    url: java.lang.String,
    body: js.Object,
    params: k6Lib.httpMod.RequestParams
  ): k6Lib.httpMod.Response = js.native
}

