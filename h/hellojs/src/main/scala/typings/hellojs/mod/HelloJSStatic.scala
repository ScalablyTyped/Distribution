package typings.hellojs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSStatic extends HelloJSEvent {
  var settings: HelloJSLoginOptions = js.native
  var utils: HelloJSUtils = js.native
  def apply(network: String): HelloJSStatic = js.native
  def api(): js.Thenable[_] = js.native
  def api(options: js.Object): js.Thenable[_] = js.native
  def api(
    path: js.UndefOr[String],
    query: js.UndefOr[js.Object],
    method: js.UndefOr[String],
    data: js.UndefOr[js.Object],
    timeout: js.UndefOr[Double],
    callback: js.UndefOr[js.Function1[/* json */ js.Any, Unit]]
  ): js.Thenable[_] = js.native
  def api(path: String): js.Thenable[_] = js.native
  def api(path: String, method: String): js.Thenable[_] = js.native
  def api(path: String, method: String, data: js.Object): js.Thenable[_] = js.native
  def api(path: String, method: String, data: js.Object, callback: js.Function1[/* json */ js.Any, Unit]): js.Thenable[_] = js.native
  def getAuthResponse(): HelloJSAuthResponse = js.native
  def getAuthResponse(network: String): HelloJSAuthResponse = js.native
  def init(serviceAppIds: StringDictionary[HelloJSServiceDef | String]): Unit = js.native
  def init(serviceAppIds: StringDictionary[String], options: HelloJSLoginOptions): Unit = js.native
  def login(): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(network: String): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(network: String, options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(network: String, options: HelloJSLoginOptions, callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(options: HelloJSLoginOptions, callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
  def logout(): js.Thenable[_] = js.native
  def logout(callback: js.Function0[Unit]): js.Thenable[_] = js.native
  def logout(network: String): js.Thenable[_] = js.native
  def logout(network: String, options: HelloJSLogoutOptions): js.Thenable[_] = js.native
  def logout(network: String, options: HelloJSLogoutOptions, callback: js.Function0[Unit]): js.Thenable[_] = js.native
  def logout(options: HelloJSLogoutOptions): js.Thenable[_] = js.native
  def logout(options: HelloJSLogoutOptions, callback: js.Function0[Unit]): js.Thenable[_] = js.native
}

