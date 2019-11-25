package typings.lzmaDashNative.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_CRC32
  - typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_CRC64
  - typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_NONE
  - typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_SHA256
*/
trait Check extends js.Object

object Check {
  @scala.inline
  def CHECK_CRC32: typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_CRC32 = this.cast("CHECK_CRC32")
  @scala.inline
  def CHECK_CRC64: typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_CRC64 = this.cast("CHECK_CRC64")
  @scala.inline
  def CHECK_NONE: typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_NONE = this.cast("CHECK_NONE")
  @scala.inline
  def CHECK_SHA256: typings.lzmaDashNative.lzmaDashNativeStrings.CHECK_SHA256 = this.cast("CHECK_SHA256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

