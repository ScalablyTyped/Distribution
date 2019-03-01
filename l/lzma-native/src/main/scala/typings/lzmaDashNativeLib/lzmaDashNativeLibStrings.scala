package typings
package lzmaDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object lzmaDashNativeLibStrings {
  @js.native
  sealed trait CHECK_CRC32
    extends lzmaDashNativeLib.lzmaDashNativeMod.Check
  
  @js.native
  sealed trait CHECK_CRC64
    extends lzmaDashNativeLib.lzmaDashNativeMod.Check
  
  @js.native
  sealed trait CHECK_NONE
    extends lzmaDashNativeLib.lzmaDashNativeMod.Check
  
  @js.native
  sealed trait CHECK_SHA256
    extends lzmaDashNativeLib.lzmaDashNativeMod.Check
  
  @js.native
  sealed trait CONCATENATED extends js.Object
  
  @js.native
  sealed trait TELL_ANY_CHECK extends js.Object
  
  @js.native
  sealed trait TELL_NO_CHECK extends js.Object
  
  @js.native
  sealed trait TELL_UNSUPPORTED_CHECK extends js.Object
  
  @js.native
  sealed trait aloneDecoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @js.native
  sealed trait aloneEncoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @js.native
  sealed trait autoDecoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @js.native
  sealed trait easyEncoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @js.native
  sealed trait rawEncoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @js.native
  sealed trait streamDecoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @js.native
  sealed trait streamEncoder
    extends lzmaDashNativeLib.lzmaDashNativeMod.Coders
  
  @scala.inline
  def CHECK_CRC32: CHECK_CRC32 = "CHECK_CRC32".asInstanceOf[CHECK_CRC32]
  @scala.inline
  def CHECK_CRC64: CHECK_CRC64 = "CHECK_CRC64".asInstanceOf[CHECK_CRC64]
  @scala.inline
  def CHECK_NONE: CHECK_NONE = "CHECK_NONE".asInstanceOf[CHECK_NONE]
  @scala.inline
  def CHECK_SHA256: CHECK_SHA256 = "CHECK_SHA256".asInstanceOf[CHECK_SHA256]
  @scala.inline
  def CONCATENATED: CONCATENATED = "CONCATENATED".asInstanceOf[CONCATENATED]
  @scala.inline
  def TELL_ANY_CHECK: TELL_ANY_CHECK = "TELL_ANY_CHECK".asInstanceOf[TELL_ANY_CHECK]
  @scala.inline
  def TELL_NO_CHECK: TELL_NO_CHECK = "TELL_NO_CHECK".asInstanceOf[TELL_NO_CHECK]
  @scala.inline
  def TELL_UNSUPPORTED_CHECK: TELL_UNSUPPORTED_CHECK = "TELL_UNSUPPORTED_CHECK".asInstanceOf[TELL_UNSUPPORTED_CHECK]
  @scala.inline
  def aloneDecoder: aloneDecoder = "aloneDecoder".asInstanceOf[aloneDecoder]
  @scala.inline
  def aloneEncoder: aloneEncoder = "aloneEncoder".asInstanceOf[aloneEncoder]
  @scala.inline
  def autoDecoder: autoDecoder = "autoDecoder".asInstanceOf[autoDecoder]
  @scala.inline
  def easyEncoder: easyEncoder = "easyEncoder".asInstanceOf[easyEncoder]
  @scala.inline
  def rawEncoder: rawEncoder = "rawEncoder".asInstanceOf[rawEncoder]
  @scala.inline
  def streamDecoder: streamDecoder = "streamDecoder".asInstanceOf[streamDecoder]
  @scala.inline
  def streamEncoder: streamEncoder = "streamEncoder".asInstanceOf[streamEncoder]
}

