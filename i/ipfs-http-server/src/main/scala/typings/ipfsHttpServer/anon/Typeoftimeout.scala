package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftimeout extends StObject {
  
  val socket: Boolean
}
object Typeoftimeout {
  
  inline def apply(socket: Boolean): Typeoftimeout = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftimeout]
  }
  
  extension [Self <: Typeoftimeout](x: Self) {
    
    inline def setSocket(value: Boolean): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
