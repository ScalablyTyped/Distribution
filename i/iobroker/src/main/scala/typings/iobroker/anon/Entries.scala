package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.ChownFileResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries extends js.Object {
  var entries: js.Array[ChownFileResult]
  var id: String
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[ChownFileResult], id: String): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
}

