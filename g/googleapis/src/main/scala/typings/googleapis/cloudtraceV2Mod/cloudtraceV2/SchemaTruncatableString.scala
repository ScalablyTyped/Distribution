package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a string that might be shortened to a specified length.
  */
@js.native
trait SchemaTruncatableString extends js.Object {
  /**
    * The number of bytes removed from the original string. If this value is 0,
    * then the string was not shortened.
    */
  var truncatedByteCount: js.UndefOr[Double] = js.native
  /**
    * The shortened string. For example, if the original string is 500 bytes
    * long and the limit of the string is 128 bytes, then `value` contains the
    * first 128 bytes of the 500-byte string.  Truncation always happens on a
    * UTF8 character boundary. If there are multi-byte characters in the
    * string, then the length of the shortened string might be less than the
    * size limit.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaTruncatableString {
  @scala.inline
  def apply(truncatedByteCount: Int | Double = null, value: String = null): SchemaTruncatableString = {
    val __obj = js.Dynamic.literal()
    if (truncatedByteCount != null) __obj.updateDynamic("truncatedByteCount")(truncatedByteCount.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTruncatableString]
  }
}

