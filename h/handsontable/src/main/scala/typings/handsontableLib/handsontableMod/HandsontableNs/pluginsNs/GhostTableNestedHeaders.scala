package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostTableNestedHeaders extends js.Object {
  var container: js.Any
  var nestedHeaders: NestedHeaders
  var widthsCache: js.Array[_]
  def clear(): scala.Unit
}

object GhostTableNestedHeaders {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    container: js.Any,
    nestedHeaders: NestedHeaders,
    widthsCache: js.Array[_]
  ): GhostTableNestedHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("nestedHeaders")(nestedHeaders)
    __obj.updateDynamic("widthsCache")(widthsCache)
    __obj.asInstanceOf[GhostTableNestedHeaders]
  }
}

