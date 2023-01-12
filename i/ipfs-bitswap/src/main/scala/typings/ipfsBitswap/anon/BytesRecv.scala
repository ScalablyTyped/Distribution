package typings.ipfsBitswap.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesRecv extends StObject {
  
  var bytesRecv: Double
  
  var bytesSent: Double
}
object BytesRecv {
  
  inline def apply(bytesRecv: Double, bytesSent: Double): BytesRecv = {
    val __obj = js.Dynamic.literal(bytesRecv = bytesRecv.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRecv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BytesRecv] (val x: Self) extends AnyVal {
    
    inline def setBytesRecv(value: Double): Self = StObject.set(x, "bytesRecv", value.asInstanceOf[js.Any])
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
  }
}
