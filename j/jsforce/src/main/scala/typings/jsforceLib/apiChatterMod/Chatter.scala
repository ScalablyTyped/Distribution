package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/chatter", "Chatter")
@js.native
class Chatter protected () extends js.Object {
  def this(conn: jsforceLib.connectionMod.Connection) = this()
  def batch(): stdLib.Promise[BatchRequestResults] = js.native
  def batch(callback: jsforceLib.connectionMod.Callback[BatchRequestResults]): stdLib.Promise[BatchRequestResults] = js.native
  def request(params: RequestParams): Request[RequestResult] = js.native
  def request(params: RequestParams, callback: jsforceLib.connectionMod.Callback[Request[RequestResult]]): Request[RequestResult] = js.native
  def resource(url: java.lang.String): Resource[RequestResult] = js.native
  def resource(url: java.lang.String, queryParams: js.Object): Resource[RequestResult] = js.native
}

