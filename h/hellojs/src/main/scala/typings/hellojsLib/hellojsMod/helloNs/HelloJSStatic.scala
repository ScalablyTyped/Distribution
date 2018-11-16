package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSStatic extends HelloJSEvent {
  var settings: HelloJSLoginOptions = js.native
  var utils: HelloJSUtils = js.native
  def apply(network: java.lang.String): HelloJSStatic = js.native
  def api(): stdLib.PromiseLike[_] = js.native
  def api(options: js.Object): stdLib.PromiseLike[_] = js.native
  def api(path: java.lang.String): stdLib.PromiseLike[_] = js.native
  def api(path: java.lang.String, method: java.lang.String): stdLib.PromiseLike[_] = js.native
  def api(path: java.lang.String, method: java.lang.String, data: js.Object): stdLib.PromiseLike[_] = js.native
  def api(
    path: java.lang.String,
    method: java.lang.String,
    data: js.Object,
    callback: js.Function1[/* json */ js.Any, scala.Unit]
  ): stdLib.PromiseLike[_] = js.native
  def api(
    path: js.UndefOr[java.lang.String],
    query: js.UndefOr[js.Object],
    method: js.UndefOr[java.lang.String],
    data: js.UndefOr[js.Object],
    timeout: js.UndefOr[scala.Double],
    callback: js.UndefOr[js.Function1[/* json */ js.Any, scala.Unit]]
  ): stdLib.PromiseLike[_] = js.native
  def getAuthResponse(): HelloJSAuthResponse = js.native
  def getAuthResponse(network: java.lang.String): HelloJSAuthResponse = js.native
  def init(serviceAppIds: ScalablyTyped.runtime.StringDictionary[HelloJSServiceDef | java.lang.String]): scala.Unit = js.native
  def init(
    serviceAppIds: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    options: HelloJSLoginOptions
  ): scala.Unit = js.native
  def login(): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def login(callback: js.Function0[scala.Unit]): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def login(network: java.lang.String): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def login(network: java.lang.String, options: HelloJSLoginOptions): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def login(network: java.lang.String, options: HelloJSLoginOptions, callback: js.Function0[scala.Unit]): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def login(options: HelloJSLoginOptions): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def login(options: HelloJSLoginOptions, callback: js.Function0[scala.Unit]): stdLib.PromiseLike[HelloJSLoginEventArguement] = js.native
  def logout(): stdLib.PromiseLike[_] = js.native
  def logout(callback: js.Function0[scala.Unit]): stdLib.PromiseLike[_] = js.native
  def logout(network: java.lang.String): stdLib.PromiseLike[_] = js.native
  def logout(network: java.lang.String, options: HelloJSLogoutOptions): stdLib.PromiseLike[_] = js.native
  def logout(network: java.lang.String, options: HelloJSLogoutOptions, callback: js.Function0[scala.Unit]): stdLib.PromiseLike[_] = js.native
  def logout(options: HelloJSLogoutOptions): stdLib.PromiseLike[_] = js.native
  def logout(options: HelloJSLogoutOptions, callback: js.Function0[scala.Unit]): stdLib.PromiseLike[_] = js.native
}

