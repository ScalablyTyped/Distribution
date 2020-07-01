package typings.ltijs.databaseMod

import typings.ltijs.anon.Data
import typings.ltijs.ltijsBooleans.`false`
import typings.ltijs.ltijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def Close(): js.Promise[`true`] = js.native
  def Decrypt(data: String, _iv: String, secret: String): js.Promise[String] = js.native
  def Delete(collection: String, query: js.Object): js.Promise[`true`] = js.native
  def Get(encryptionKey: String, collection: String, query: js.Object): js.Promise[js.Object | `false`] = js.native
  @JSName("Get")
  def Get_false(encryptionKey: `false`, collection: String, query: js.Object): js.Promise[js.Object | `false`] = js.native
  def Insert(encryptionKey: String, collection: String, item: js.Object, index: js.Object): js.Promise[`true`] = js.native
  @JSName("Insert")
  def Insert_false(encryptionKey: `false`, collection: String, item: js.Object, index: js.Object): js.Promise[`true`] = js.native
  def Modify(encryptionKey: String, collection: String, query: js.Object, modification: js.Object): js.Promise[`true`] = js.native
  @JSName("Modify")
  def Modify_false(encryptionKey: `false`, collection: String, query: js.Object, modification: js.Object): js.Promise[`true`] = js.native
  def encrypt(data: String, secret: String): js.Promise[Data] = js.native
  def setup(): js.Promise[`true`] = js.native
}

