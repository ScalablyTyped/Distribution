package typings.iobroker

import typings.iobroker.iobrokerMod.Global.ioBroker.ChownFileResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entries extends js.Object {
  var entries: js.Array[ChownFileResult]
  var id: String
}

object Anon_Entries {
  @scala.inline
  def apply(entries: js.Array[ChownFileResult], id: String): Anon_Entries = {
    val __obj = js.Dynamic.literal(entries = entries, id = id)
  
    __obj.asInstanceOf[Anon_Entries]
  }
}

