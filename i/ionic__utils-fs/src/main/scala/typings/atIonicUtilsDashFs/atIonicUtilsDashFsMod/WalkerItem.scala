package typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerItem extends js.Object {
  var path: String
  var stats: typings.fsDashExtra.fsDashExtraMod.Stats
}

object WalkerItem {
  @scala.inline
  def apply(path: String, stats: typings.fsDashExtra.fsDashExtraMod.Stats): WalkerItem = {
    val __obj = js.Dynamic.literal(path = path, stats = stats)
  
    __obj.asInstanceOf[WalkerItem]
  }
}

