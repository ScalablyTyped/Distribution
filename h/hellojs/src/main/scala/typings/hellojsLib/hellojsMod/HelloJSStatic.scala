package typings
package hellojsLib.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSStatic extends HelloJSEvent {
  var settings: HelloJSLoginOptions = js.native
  var utils: HelloJSUtils = js.native
  def apply(network: java.lang.String): HelloJSStatic = js.native
  def api(): js.Thenable[_] = js.native
  def api(options: js.Object): js.Thenable[_] = js.native
  def api(
    path: js.UndefOr[java.lang.String],
    query: js.UndefOr[js.Object],
    method: js.UndefOr[java.lang.String],
    data: js.UndefOr[js.Object],
    timeout: js.UndefOr[scala.Double],
    callback: js.UndefOr[js.Function1[/* json */ js.Any, scala.Unit]]
  ): js.Thenable[_] = js.native
  def api(path: java.lang.String): js.Thenable[_] = js.native
  def api(path: java.lang.String, method: java.lang.String): js.Thenable[_] = js.native
  def api(path: java.lang.String, method: java.lang.String, data: js.Object): js.Thenable[_] = js.native
  def api(
    path: java.lang.String,
    method: java.lang.String,
    data: js.Object,
    callback: js.Function1[/* json */ js.Any, scala.Unit]
  ): js.Thenable[_] = js.native
  def getAuthResponse(): HelloJSAuthResponse = js.native
  def getAuthResponse(network: java.lang.String): HelloJSAuthResponse = js.native
  def init(serviceAppIds: org.scalablytyped.runtime.StringDictionary[HelloJSServiceDef | java.lang.String]): scala.Unit = js.native
  def init(
    serviceAppIds: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    options: HelloJSLoginOptions
  ): scala.Unit = js.native
  def login(): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(callback: js.Function0[scala.Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(network: java.lang.String): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(network: java.lang.String, options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(network: java.lang.String, options: HelloJSLoginOptions, callback: js.Function0[scala.Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
  def login(options: HelloJSLoginOptions, callback: js.Function0[scala.Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
  def logout(): js.Thenable[_] = js.native
  def logout(callback: js.Function0[scala.Unit]): js.Thenable[_] = js.native
  def logout(network: java.lang.String): js.Thenable[_] = js.native
  def logout(network: java.lang.String, options: HelloJSLogoutOptions): js.Thenable[_] = js.native
  def logout(network: java.lang.String, options: HelloJSLogoutOptions, callback: js.Function0[scala.Unit]): js.Thenable[_] = js.native
  def logout(options: HelloJSLogoutOptions): js.Thenable[_] = js.native
  def logout(options: HelloJSLogoutOptions, callback: js.Function0[scala.Unit]): js.Thenable[_] = js.native
}

