package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ecprvhex extends StObject {
  
  var ecprvhex: String
  
  var ecpubhex: String
}
object Ecprvhex {
  
  inline def apply(ecprvhex: String, ecpubhex: String): Ecprvhex = {
    val __obj = js.Dynamic.literal(ecprvhex = ecprvhex.asInstanceOf[js.Any], ecpubhex = ecpubhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecprvhex]
  }
  
  extension [Self <: Ecprvhex](x: Self) {
    
    inline def setEcprvhex(value: String): Self = StObject.set(x, "ecprvhex", value.asInstanceOf[js.Any])
    
    inline def setEcpubhex(value: String): Self = StObject.set(x, "ecpubhex", value.asInstanceOf[js.Any])
  }
}
