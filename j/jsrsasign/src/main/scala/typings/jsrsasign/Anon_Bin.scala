package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bin extends js.Object {
  var bin: String
  var critical: Boolean
}

object Anon_Bin {
  @scala.inline
  def apply(bin: String, critical: Boolean): Anon_Bin = {
    val __obj = js.Dynamic.literal(bin = bin, critical = critical)
  
    __obj.asInstanceOf[Anon_Bin]
  }
}

