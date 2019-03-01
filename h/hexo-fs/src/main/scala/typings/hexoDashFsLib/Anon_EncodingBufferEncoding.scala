package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingBufferEncoding extends js.Object {
  var encoding: js.UndefOr[nodeLib.BufferEncoding | scala.Null] = js.undefined
}

object Anon_EncodingBufferEncoding {
  @scala.inline
  def apply(encoding: nodeLib.BufferEncoding = null): Anon_EncodingBufferEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_EncodingBufferEncoding]
  }
}

