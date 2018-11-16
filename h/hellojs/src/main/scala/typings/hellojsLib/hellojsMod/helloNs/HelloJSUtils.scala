package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API utilities
@js.native
trait HelloJSUtils extends js.Object {
  var Event: HelloJSEvent = js.native
  def append(node: java.lang.String, attr: js.Object, target: java.lang.String): stdLib.HTMLElement = js.native
  def append(node: java.lang.String, attr: js.Object, target: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def append(node: java.lang.String, attr: js.UndefOr[scala.Nothing], target: java.lang.String): stdLib.HTMLElement = js.native
  def append(node: java.lang.String, attr: js.UndefOr[scala.Nothing], target: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def append(node: java.lang.String, attr: scala.Null, target: java.lang.String): stdLib.HTMLElement = js.native
  def append(node: java.lang.String, attr: scala.Null, target: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def append(node: stdLib.HTMLElement, attr: js.Object, target: java.lang.String): stdLib.HTMLElement = js.native
  def append(node: stdLib.HTMLElement, attr: js.Object, target: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def append(node: stdLib.HTMLElement, attr: js.UndefOr[scala.Nothing], target: java.lang.String): stdLib.HTMLElement = js.native
  def append(node: stdLib.HTMLElement, attr: js.UndefOr[scala.Nothing], target: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def append(node: stdLib.HTMLElement, attr: scala.Null, target: java.lang.String): stdLib.HTMLElement = js.native
  def append(node: stdLib.HTMLElement, attr: scala.Null, target: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def args(o: js.Object, args: js.Object): js.Any | hellojsLib.hellojsLibNumbers.`false` = js.native
  def clone[T](obj: T): T = js.native
  def dataToJSON(p: js.Any): js.Any = js.native
  def diff(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
  def diffKey(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
  def domInstance(`type`: java.lang.String, data: js.Any): scala.Boolean = js.native
  def error(code: scala.Double, message: java.lang.String): hellojsLib.Anon_Code = js.native
  def extend(r: js.Object, a: js.Any*): js.Any = js.native
  def globalEvent(callback: js.Function0[scala.Unit]): java.lang.String = js.native
  def globalEvent(callback: js.Function0[scala.Unit], guid: java.lang.String): java.lang.String = js.native
  def hasBinary(data: js.Any): scala.Boolean = js.native
  def iframe(src: java.lang.String): scala.Unit = js.native
  def iframe(src: java.lang.String, redirectUri: java.lang.String): scala.Unit = js.native
  def isBinary(data: js.Any): scala.Boolean = js.native
  def isEmpty(obj: js.Any): scala.Boolean = js.native
  def jsonp(url: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def jsonp(url: java.lang.String, callback: js.Function0[scala.Unit], callbackID: java.lang.String): scala.Unit = js.native
  def jsonp(
    url: java.lang.String,
    callback: js.Function0[scala.Unit],
    callbackID: java.lang.String,
    timeout: scala.Double
  ): scala.Unit = js.native
  def merge(a: js.Any*): js.Any = js.native
  def nodeListToJSON(nodelist: stdLib.NodeList): js.Any = js.native
  def param(o: js.Object): java.lang.String = js.native
  def param(o: js.Object, formatFunction: js.Function1[/* param */ js.Any, java.lang.String]): java.lang.String = js.native
  def param(s: java.lang.String): js.Any = js.native
  def param(s: java.lang.String, formatFunction: js.Function1[/* param */ java.lang.String, _]): js.Any = js.native
  def popup(url: java.lang.String): stdLib.Window | js.Any = js.native
  def popup(url: java.lang.String, redirectUri: java.lang.String): stdLib.Window | js.Any = js.native
  def popup(url: java.lang.String, redirectUri: java.lang.String, options: js.Object): stdLib.Window | js.Any = js.native
  def post(url: java.lang.String, data: js.Any, options: js.Object, callback: HelloJSResponseCallback): scala.Unit = js.native
  def post(
    url: java.lang.String,
    data: js.Any,
    options: js.Object,
    callback: HelloJSResponseCallback,
    callbackID: java.lang.String
  ): scala.Unit = js.native
  def post(
    url: java.lang.String,
    data: js.Any,
    options: js.Object,
    callback: HelloJSResponseCallback,
    callbackID: java.lang.String,
    timeout: scala.Double
  ): scala.Unit = js.native
  def qs(url: java.lang.String): java.lang.String = js.native
  def qs(url: java.lang.String, params: js.Object): java.lang.String = js.native
  def qs(
    url: java.lang.String,
    params: js.Object,
    formatFunction: js.Function1[/* param */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  def request(p: js.Object, callback: HelloJSResponseCallback): scala.Unit = js.native
  def request_cors(callback: HelloJSResponseCallback): scala.Boolean = js.native
  def responseHandler(window: stdLib.Window): scala.Unit = js.native
  def responseHandler(window: stdLib.Window, parent: js.Any): scala.Unit = js.native
  def store(): js.Any = js.native
  def store(name: java.lang.String): js.Any = js.native
  def store(name: java.lang.String, value: js.Any): js.Any = js.native
  def toBlob(dataURI: java.lang.String): stdLib.Blob | java.lang.String = js.native
  def unique(a: js.Array[_]): js.Array[_] = js.native
  def url(): stdLib.Location = js.native
  def url(path: java.lang.String): stdLib.URL | stdLib.HTMLAnchorElement = js.native
  def xhr(
    method: java.lang.String,
    url: java.lang.String,
    headers: js.Object,
    data: js.Any,
    callback: HelloJSResponseCallback
  ): stdLib.XMLHttpRequest = js.native
}

