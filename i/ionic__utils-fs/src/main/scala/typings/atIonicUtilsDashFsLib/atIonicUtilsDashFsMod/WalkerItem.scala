package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerItem extends js.Object {
  var path: java.lang.String
  var stats: fsDashExtraLib.fsDashExtraMod.Stats
}

object WalkerItem {
  @scala.inline
  def apply(path: java.lang.String, stats: fsDashExtraLib.fsDashExtraMod.Stats): WalkerItem = {
    val __obj = js.Dynamic.literal(path = path, stats = stats)
  
    __obj.asInstanceOf[WalkerItem]
  }
}

