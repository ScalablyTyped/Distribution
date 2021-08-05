package typings.lzmaNative

import typings.lzmaNative.mod.Check
import typings.lzmaNative.mod.Coders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lzmaNativeStrings {
  
  @js.native
  sealed trait CHECK_CRC32
    extends StObject
       with Check
  inline def CHECK_CRC32: CHECK_CRC32 = "CHECK_CRC32".asInstanceOf[CHECK_CRC32]
  
  @js.native
  sealed trait CHECK_CRC64
    extends StObject
       with Check
  inline def CHECK_CRC64: CHECK_CRC64 = "CHECK_CRC64".asInstanceOf[CHECK_CRC64]
  
  @js.native
  sealed trait CHECK_NONE
    extends StObject
       with Check
  inline def CHECK_NONE: CHECK_NONE = "CHECK_NONE".asInstanceOf[CHECK_NONE]
  
  @js.native
  sealed trait CHECK_SHA256
    extends StObject
       with Check
  inline def CHECK_SHA256: CHECK_SHA256 = "CHECK_SHA256".asInstanceOf[CHECK_SHA256]
  
  @js.native
  sealed trait CONCATENATED extends StObject
  inline def CONCATENATED: CONCATENATED = "CONCATENATED".asInstanceOf[CONCATENATED]
  
  @js.native
  sealed trait TELL_ANY_CHECK extends StObject
  inline def TELL_ANY_CHECK: TELL_ANY_CHECK = "TELL_ANY_CHECK".asInstanceOf[TELL_ANY_CHECK]
  
  @js.native
  sealed trait TELL_NO_CHECK extends StObject
  inline def TELL_NO_CHECK: TELL_NO_CHECK = "TELL_NO_CHECK".asInstanceOf[TELL_NO_CHECK]
  
  @js.native
  sealed trait TELL_UNSUPPORTED_CHECK extends StObject
  inline def TELL_UNSUPPORTED_CHECK: TELL_UNSUPPORTED_CHECK = "TELL_UNSUPPORTED_CHECK".asInstanceOf[TELL_UNSUPPORTED_CHECK]
  
  @js.native
  sealed trait aloneDecoder
    extends StObject
       with Coders
  inline def aloneDecoder: aloneDecoder = "aloneDecoder".asInstanceOf[aloneDecoder]
  
  @js.native
  sealed trait aloneEncoder
    extends StObject
       with Coders
  inline def aloneEncoder: aloneEncoder = "aloneEncoder".asInstanceOf[aloneEncoder]
  
  @js.native
  sealed trait autoDecoder
    extends StObject
       with Coders
  inline def autoDecoder: autoDecoder = "autoDecoder".asInstanceOf[autoDecoder]
  
  @js.native
  sealed trait easyEncoder
    extends StObject
       with Coders
  inline def easyEncoder: easyEncoder = "easyEncoder".asInstanceOf[easyEncoder]
  
  @js.native
  sealed trait rawEncoder
    extends StObject
       with Coders
  inline def rawEncoder: rawEncoder = "rawEncoder".asInstanceOf[rawEncoder]
  
  @js.native
  sealed trait streamDecoder
    extends StObject
       with Coders
  inline def streamDecoder: streamDecoder = "streamDecoder".asInstanceOf[streamDecoder]
  
  @js.native
  sealed trait streamEncoder
    extends StObject
       with Coders
  inline def streamEncoder: streamEncoder = "streamEncoder".asInstanceOf[streamEncoder]
}
