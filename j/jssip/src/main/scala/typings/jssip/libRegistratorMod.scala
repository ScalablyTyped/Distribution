package typings.jssip

import typings.jssip.libTransportMod.Transport
import typings.jssip.libUAMod.UA
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegistratorMod {
  
  @JSImport("jssip/lib/Registrator", "Registrator")
  @js.native
  open class Registrator protected () extends StObject {
    def this(ua: UA, transport: Transport) = this()
    
    def setExtraContactParams(extraContactParams: ExtraContactParams): Unit = js.native
    
    def setExtraHeaders(extraHeaders: js.Array[String]): Unit = js.native
  }
  
  type ExtraContactParams = Record[String, String | Double | Boolean]
}
