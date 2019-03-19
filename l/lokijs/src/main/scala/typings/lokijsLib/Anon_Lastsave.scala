package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lastsave extends js.Object {
  var lastsave: stdLib.Date
  var savecount: scala.Double
  var value: java.lang.String
}

object Anon_Lastsave {
  @scala.inline
  def apply(lastsave: stdLib.Date, savecount: scala.Double, value: java.lang.String): Anon_Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave, savecount = savecount, value = value)
  
    __obj.asInstanceOf[Anon_Lastsave]
  }
}

