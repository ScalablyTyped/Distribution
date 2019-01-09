package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ContentScript extends js.Object {
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var context: js.UndefOr[js.Array[jpmLib.contextDashMenuMod.Context]] = js.native
  var image: js.UndefOr[java.lang.String] = js.native
  var items: js.Array[jpmLib.contextDashMenuMod.ItemMenuSeparator] = js.native
  var label: java.lang.String = js.native
  def onMessage(): scala.Unit = js.native
  def onMessage(message: js.Any): scala.Unit = js.native
}

