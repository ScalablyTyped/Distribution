package typings.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/connection", "RestApi")
@js.native
abstract class RestApi () extends js.Object {
  
  def del(path: String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  
  def get(path: String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  
  def patch(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  
  def post(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  
  def put(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
}
