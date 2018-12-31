package typings
package jpmLib.contextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var contentScript: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentScriptFile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var context: ItemContext
  var data: js.Any
  var image: java.lang.String | stdLib.URL
  var label: java.lang.String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def destroy(): scala.Unit
}

