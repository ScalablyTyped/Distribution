package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: stdLib.Error
  var ok: js.Any
}

object Anon_Err {
  @scala.inline
  def apply(err: stdLib.Error, ok: js.Any): Anon_Err = {
    val __obj = js.Dynamic.literal(err = err, ok = ok)
  
    __obj.asInstanceOf[Anon_Err]
  }
}

