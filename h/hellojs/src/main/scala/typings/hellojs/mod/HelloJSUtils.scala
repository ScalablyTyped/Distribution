package typings.hellojs.mod

import typings.hellojs.anon.Code
import typings.hellojs.hellojsBooleans.`false`
import typings.std.Blob
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.Location
import typings.std.NodeList
import typings.std.URL
import typings.std.Window
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API utilities
@js.native
trait HelloJSUtils extends js.Object {
  var Event: HelloJSEvent = js.native
  def append(node: String, attr: js.UndefOr[scala.Nothing], target: String): HTMLElement = js.native
  def append(node: String, attr: js.UndefOr[scala.Nothing], target: HTMLElement): HTMLElement = js.native
  def append(node: String, attr: js.Object, target: String): HTMLElement = js.native
  def append(node: String, attr: js.Object, target: HTMLElement): HTMLElement = js.native
  def append(node: String, attr: Null, target: String): HTMLElement = js.native
  def append(node: String, attr: Null, target: HTMLElement): HTMLElement = js.native
  def append(node: HTMLElement, attr: js.UndefOr[scala.Nothing], target: String): HTMLElement = js.native
  def append(node: HTMLElement, attr: js.UndefOr[scala.Nothing], target: HTMLElement): HTMLElement = js.native
  def append(node: HTMLElement, attr: js.Object, target: String): HTMLElement = js.native
  def append(node: HTMLElement, attr: js.Object, target: HTMLElement): HTMLElement = js.native
  def append(node: HTMLElement, attr: Null, target: String): HTMLElement = js.native
  def append(node: HTMLElement, attr: Null, target: HTMLElement): HTMLElement = js.native
  def args(o: js.Object, args: js.Object): js.Any | `false` = js.native
  def clone[T](obj: T): T = js.native
  def dataToJSON(p: js.Any): js.Any = js.native
  def diff(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
  def diffKey(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
  def domInstance(`type`: String, data: js.Any): Boolean = js.native
  def error(code: Double, message: String): Code = js.native
  def extend(r: js.Object, a: js.Any*): js.Any = js.native
  def globalEvent(callback: js.Function0[Unit]): String = js.native
  def globalEvent(callback: js.Function0[Unit], guid: String): String = js.native
  def hasBinary(data: js.Any): Boolean = js.native
  def iframe(src: String): Unit = js.native
  def iframe(src: String, redirectUri: String): Unit = js.native
  def isBinary(data: js.Any): Boolean = js.native
  def isEmpty(obj: js.Any): Boolean = js.native
  def jsonp(url: String, callback: js.Function0[Unit]): Unit = js.native
  def jsonp(url: String, callback: js.Function0[Unit], callbackID: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def jsonp(url: String, callback: js.Function0[Unit], callbackID: String): Unit = js.native
  def jsonp(url: String, callback: js.Function0[Unit], callbackID: String, timeout: Double): Unit = js.native
  def merge(a: js.Any*): js.Any = js.native
  def nodeListToJSON(nodelist: NodeList): js.Any = js.native
  def param(o: js.Object): String = js.native
  def param(o: js.Object, formatFunction: js.Function1[/* param */ js.Any, String]): String = js.native
  def param(s: String): js.Any = js.native
  def param(s: String, formatFunction: js.Function1[/* param */ String, _]): js.Any = js.native
  def popup(url: String): Window | js.Any = js.native
  def popup(url: String, redirectUri: js.UndefOr[scala.Nothing], options: js.Object): Window | js.Any = js.native
  def popup(url: String, redirectUri: String): Window | js.Any = js.native
  def popup(url: String, redirectUri: String, options: js.Object): Window | js.Any = js.native
  def post(url: String, data: js.Any, options: js.Object, callback: HelloJSResponseCallback): Unit = js.native
  def post(
    url: String,
    data: js.Any,
    options: js.Object,
    callback: HelloJSResponseCallback,
    callbackID: js.UndefOr[scala.Nothing],
    timeout: Double
  ): Unit = js.native
  def post(
    url: String,
    data: js.Any,
    options: js.Object,
    callback: HelloJSResponseCallback,
    callbackID: String
  ): Unit = js.native
  def post(
    url: String,
    data: js.Any,
    options: js.Object,
    callback: HelloJSResponseCallback,
    callbackID: String,
    timeout: Double
  ): Unit = js.native
  def qs(url: String): String = js.native
  def qs(
    url: String,
    params: js.UndefOr[scala.Nothing],
    formatFunction: js.Function1[/* param */ js.Any, String]
  ): String = js.native
  def qs(url: String, params: js.Object): String = js.native
  def qs(url: String, params: js.Object, formatFunction: js.Function1[/* param */ js.Any, String]): String = js.native
  def request(p: js.Object, callback: HelloJSResponseCallback): Unit = js.native
  def request_cors(callback: HelloJSResponseCallback): Boolean = js.native
  def responseHandler(window: Window): Unit = js.native
  def responseHandler(window: Window, parent: js.Any): Unit = js.native
  def store(): js.Any = js.native
  def store(name: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
  def store(name: String): js.Any = js.native
  def store(name: String, value: js.Any): js.Any = js.native
  def toBlob(dataURI: String): Blob | String = js.native
  def unique(a: js.Array[_]): js.Array[_] = js.native
  def url(): Location = js.native
  def url(path: String): URL | HTMLAnchorElement = js.native
  def xhr(method: String, url: String, headers: js.Object, data: js.Any, callback: HelloJSResponseCallback): XMLHttpRequest = js.native
}

