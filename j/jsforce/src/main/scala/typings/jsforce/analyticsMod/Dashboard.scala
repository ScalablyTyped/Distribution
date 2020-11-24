package typings.jsforce.analyticsMod

import typings.jsforce.connectionMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/api/analytics", "Dashboard")
@js.native
class Dashboard () extends js.Object {
  
  def clone(name: String, folderid: String): js.Promise[_] = js.native
  def clone(name: String, folderid: String, callback: Callback[js.Object]): js.Promise[_] = js.native
  def clone(name: js.Object, folderid: String): js.Promise[_] = js.native
  def clone(name: js.Object, folderid: String, callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def components(componentIds: js.Function0[_ | js.Array[String] | String]): js.Promise[_] = js.native
  def components(componentIds: js.Function0[_ | js.Array[String] | String], callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def del(): js.Promise[_] = js.native
  def del(callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def delete(): js.Promise[_] = js.native
  def delete(callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def describe(): js.Promise[_] = js.native
  def describe(callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def destory(): js.Promise[_] = js.native
  def destory(callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def refresh(): js.Promise[_] = js.native
  def refresh(callback: Callback[js.Object]): js.Promise[_] = js.native
  
  def status(): js.Promise[_] = js.native
  def status(callback: Callback[js.Object]): js.Promise[_] = js.native
}
