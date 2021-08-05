package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpayload extends StObject {
  
  val output: String
  
  val parse: Boolean
}
object Typeofpayload {
  
  inline def apply(output: String, parse: Boolean): Typeofpayload = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpayload]
  }
  
  extension [Self <: Typeofpayload](x: Self) {
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
