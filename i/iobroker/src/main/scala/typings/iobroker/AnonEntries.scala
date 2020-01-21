package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.ChownFileResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntries extends js.Object {
  var entries: js.Array[ChownFileResult]
  var id: String
}

object AnonEntries {
  @scala.inline
  def apply(entries: js.Array[ChownFileResult], id: String): AnonEntries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntries]
  }
}

