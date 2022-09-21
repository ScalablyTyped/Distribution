package typings.jssip

import typings.jssip.nameAddrHeaderMod.NameAddrHeader
import typings.jssip.uriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sipmessageMod {
  
  @JSImport("jssip/lib/SIPMessage", "IncomingRequest")
  @js.native
  open class IncomingRequest ()
    extends StObject
       with IncomingMessage {
    
    var ruri: URI = js.native
  }
  
  @JSImport("jssip/lib/SIPMessage", "IncomingResponse")
  @js.native
  open class IncomingResponse ()
    extends StObject
       with IncomingMessage {
    
    var reason_phrase: String = js.native
    
    var status_code: Double = js.native
  }
  
  @JSImport("jssip/lib/SIPMessage", "OutgoingRequest")
  @js.native
  open class OutgoingRequest () extends StObject {
    
    var body: String = js.native
    
    var call_id: String = js.native
    
    var cseq: Double = js.native
    
    var from: NameAddrHeader = js.native
    
    def getHeader(name: String): String = js.native
    
    def getHeaders(name: String): js.Array[String] = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    var method: String = js.native
    
    var ruri: URI = js.native
    
    def setHeader(name: String, value: String): Unit = js.native
    def setHeader(name: String, value: js.Array[String]): Unit = js.native
    
    var to: NameAddrHeader = js.native
  }
  
  @js.native
  trait IncomingMessage extends StObject {
    
    var body: String = js.native
    
    def countHeader(name: String): Double = js.native
    
    var from: NameAddrHeader = js.native
    
    def getHeader(name: String): String = js.native
    
    def getHeaders(name: String): js.Array[String] = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    var method: String = js.native
    
    def parseHeader[T](name: String): T = js.native
    def parseHeader[T](name: String, idx: Double): T = js.native
    
    var to: NameAddrHeader = js.native
  }
}
