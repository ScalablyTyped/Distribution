package typings.gun

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: Error
  var ok: js.Any
}

object Anon_Err {
  @scala.inline
  def apply(err: Error, ok: js.Any): Anon_Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Err]
  }
}

