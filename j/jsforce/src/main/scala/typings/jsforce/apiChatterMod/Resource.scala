package typings.jsforce.apiChatterMod

import typings.jsforce.connectionMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/chatter", "Resource")
@js.native
class Resource[T] protected () extends Request[T] {
  def this(chatter: Chatter, url: String) = this()
  def this(chatter: Chatter, url: String, queryParams: js.Object) = this()
  def create(data: String): Request[T] = js.native
  def create(data: String, callback: Callback[T]): Request[T] = js.native
  def create(data: js.Object): Request[T] = js.native
  def create(data: js.Object, callback: Callback[T]): Request[T] = js.native
  def del(): Request[T] = js.native
  def del(callback: Callback[T]): Request[T] = js.native
  def delete(): Request[T] = js.native
  def delete(callback: Callback[T]): Request[T] = js.native
  def retrieve(): Request[T] = js.native
  def retrieve(callback: Callback[T]): Request[T] = js.native
  def update(data: js.Object): Request[T] = js.native
  def update(data: js.Object, callback: Callback[T]): Request[T] = js.native
}

