package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/chatter", "Resource")
@js.native
class Resource[T] protected () extends Request[T] {
  def this(chatter: Chatter, url: java.lang.String) = this()
  def this(chatter: Chatter, url: java.lang.String, queryParams: js.Object) = this()
  def create(data: java.lang.String): Request[T] = js.native
  def create(data: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): Request[T] = js.native
  def create(data: js.Object): Request[T] = js.native
  def create(data: js.Object, callback: jsforceLib.connectionMod.Callback[T]): Request[T] = js.native
  def del(): Request[T] = js.native
  def del(callback: jsforceLib.connectionMod.Callback[T]): Request[T] = js.native
  def delete(): Request[T] = js.native
  def delete(callback: jsforceLib.connectionMod.Callback[T]): Request[T] = js.native
  def retrieve(): Request[T] = js.native
  def retrieve(callback: jsforceLib.connectionMod.Callback[T]): Request[T] = js.native
  def update(data: js.Object): Request[T] = js.native
  def update(data: js.Object, callback: jsforceLib.connectionMod.Callback[T]): Request[T] = js.native
}

