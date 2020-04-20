package typings.klawSync.mod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var path: String
  var stats: Stats
}

object Item {
  @scala.inline
  def apply(path: String, stats: Stats): Item = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

