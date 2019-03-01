package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: nodeLib.BufferEncoding | scala.Null
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: nodeLib.BufferEncoding = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

