package typings.lokijs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lastsave extends js.Object {
  var lastsave: Date
  var savecount: Double
  var value: String
}

object Anon_Lastsave {
  @scala.inline
  def apply(lastsave: Date, savecount: Double, value: String): Anon_Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave, savecount = savecount, value = value)
  
    __obj.asInstanceOf[Anon_Lastsave]
  }
}

