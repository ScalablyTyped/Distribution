package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoded extends StObject {
  
  var encoded: String
  
  var raw: String
  
  var sub_proof_index: Double
}
object Encoded {
  
  inline def apply(encoded: String, raw: String, sub_proof_index: Double): Encoded = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], sub_proof_index = sub_proof_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encoded] (val x: Self) extends AnyVal {
    
    inline def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setSub_proof_index(value: Double): Self = StObject.set(x, "sub_proof_index", value.asInstanceOf[js.Any])
  }
}
