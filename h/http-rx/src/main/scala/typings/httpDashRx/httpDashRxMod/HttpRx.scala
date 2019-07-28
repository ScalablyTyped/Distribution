package typings.httpDashRx.httpDashRxMod

import typings.request.requestMod.CoreOptions
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRx extends js.Object {
  def delete(url: String): Observable[ResponseWrapper] = js.native
  def delete(url: String, options: CoreOptions): Observable[ResponseWrapper] = js.native
  def get(url: String): Observable[ResponseWrapper] = js.native
  def get(url: String, options: CoreOptions): Observable[ResponseWrapper] = js.native
  def head(url: String): Observable[ResponseWrapper] = js.native
  def head(url: String, options: CoreOptions): Observable[ResponseWrapper] = js.native
  def patch(url: String): Observable[ResponseWrapper] = js.native
  def patch(url: String, options: CoreOptions): Observable[ResponseWrapper] = js.native
  def post(url: String): Observable[ResponseWrapper] = js.native
  def post(url: String, options: CoreOptions): Observable[ResponseWrapper] = js.native
  def put(url: String): Observable[ResponseWrapper] = js.native
  def put(url: String, options: CoreOptions): Observable[ResponseWrapper] = js.native
}

