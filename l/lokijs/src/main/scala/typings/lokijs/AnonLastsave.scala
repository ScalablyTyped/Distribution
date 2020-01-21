package typings.lokijs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastsave extends js.Object {
  var lastsave: Date
  var savecount: Double
  var value: String
}

object AnonLastsave {
  @scala.inline
  def apply(lastsave: Date, savecount: Double, value: String): AnonLastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastsave]
  }
}

