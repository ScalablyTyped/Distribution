package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Launcher extends js.Object {
  @JSName("aurora")
  var aurora_Original: BrowserFunction = js.native
  @JSName("canary")
  var canary_Original: BrowserFunction = js.native
  @JSName("chrome")
  var chrome_Original: BrowserFunction = js.native
  @JSName("chromium")
  var chromium_Original: BrowserFunction = js.native
  @JSName("edge")
  var edge_Original: BrowserFunction = js.native
  @JSName("firefox")
  var firefox_Original: BrowserFunction = js.native
  @JSName("ie")
  var ie_Original: BrowserFunction = js.native
  @JSName("nodeWebkit")
  var nodeWebkit_Original: BrowserFunction = js.native
  @JSName("opera")
  var opera_Original: BrowserFunction = js.native
  @JSName("phantom")
  var phantom_Original: BrowserFunction = js.native
  @JSName("safari")
  var safari_Original: BrowserFunction = js.native
  def apply(
    url: java.lang.String,
    options: LaunchOptions,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def aurora(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def browsers(cb: js.Function2[/* error */ js.Any, /* browsers */ js.UndefOr[js.Array[Browser]], scala.Unit]): scala.Unit = js.native
  def canary(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def chrome(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def chromium(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def edge(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def firefox(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def ie(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def nodeWebkit(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def opera(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def phantom(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
  def safari(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit]
  ): scala.Unit = js.native
}

