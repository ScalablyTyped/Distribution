package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserWindow extends js.Object {
  var tabs: js.Array[Tab] = js.native
  var title: java.lang.String = js.native
  def activate(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

