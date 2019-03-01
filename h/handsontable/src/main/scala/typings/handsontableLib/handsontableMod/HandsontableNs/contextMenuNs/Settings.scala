package typings
package handsontableLib.handsontableMod.HandsontableNs.contextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var items: js.Any
  def callback(key: java.lang.String, options: Options): scala.Unit
}

object Settings {
  @scala.inline
  def apply(callback: js.Function2[java.lang.String, Options, scala.Unit], items: js.Any): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Settings]
  }
}

