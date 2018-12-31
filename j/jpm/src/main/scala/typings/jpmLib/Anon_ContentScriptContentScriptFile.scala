package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentScriptContentScriptFile extends js.Object {
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var context: js.UndefOr[js.Array[jpmLib.contextDashMenuMod.Context]] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[jpmLib.contextDashMenuMod.ItemMenuSeparator]
  var label: java.lang.String
  var onMessage: js.Function1[/* message */ js.UndefOr[js.Any], scala.Unit]
}

