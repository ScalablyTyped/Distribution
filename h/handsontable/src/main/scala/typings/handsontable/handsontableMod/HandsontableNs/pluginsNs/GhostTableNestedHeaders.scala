package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostTableNestedHeaders extends js.Object {
  var container: js.Any
  var nestedHeaders: NestedHeaders
  var widthsCache: js.Array[_]
  def clear(): Unit
}

object GhostTableNestedHeaders {
  @scala.inline
  def apply(clear: () => Unit, container: js.Any, nestedHeaders: NestedHeaders, widthsCache: js.Array[_]): GhostTableNestedHeaders = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), container = container, nestedHeaders = nestedHeaders, widthsCache = widthsCache)
  
    __obj.asInstanceOf[GhostTableNestedHeaders]
  }
}

