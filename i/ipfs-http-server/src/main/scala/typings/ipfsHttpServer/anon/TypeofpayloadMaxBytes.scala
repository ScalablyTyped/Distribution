package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpayloadMaxBytes extends StObject {
  
  val maxBytes: Double
  
  val output: String
  
  val parse: Boolean
}
object TypeofpayloadMaxBytes {
  
  inline def apply(maxBytes: Double, output: String, parse: Boolean): TypeofpayloadMaxBytes = {
    val __obj = js.Dynamic.literal(maxBytes = maxBytes.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpayloadMaxBytes]
  }
  
  extension [Self <: TypeofpayloadMaxBytes](x: Self) {
    
    inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
