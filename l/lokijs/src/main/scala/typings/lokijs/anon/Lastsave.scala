package typings.lokijs.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lastsave extends js.Object {
  var lastsave: Date
  var savecount: Double
  var value: String
}

object Lastsave {
  @scala.inline
  def apply(lastsave: Date, savecount: Double, value: String): Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastsave]
  }
}

