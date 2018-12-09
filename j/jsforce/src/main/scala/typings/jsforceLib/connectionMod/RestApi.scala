package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/connection", "RestApi")
@js.native
abstract class RestApi () extends js.Object {
  def del(path: java.lang.String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  def get(path: java.lang.String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  def patch(path: java.lang.String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  def post(path: java.lang.String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  def put(path: java.lang.String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
}

