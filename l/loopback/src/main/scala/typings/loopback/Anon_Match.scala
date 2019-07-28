package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Match extends js.Object {
  var `match`: String
  var options: js.Any
}

object Anon_Match {
  @scala.inline
  def apply(`match`: String, options: js.Any): Anon_Match = {
    val __obj = js.Dynamic.literal(options = options)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Anon_Match]
  }
}

