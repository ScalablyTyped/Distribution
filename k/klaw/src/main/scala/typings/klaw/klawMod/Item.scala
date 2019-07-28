package typings.klaw.klawMod

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
    val __obj = js.Dynamic.literal(path = path, stats = stats)
  
    __obj.asInstanceOf[Item]
  }
}

