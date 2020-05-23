package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bin extends js.Object {
  var bin: String
  var critical: Boolean
}

object Bin {
  @scala.inline
  def apply(bin: String, critical: Boolean): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
}

