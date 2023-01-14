package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  var encoded: String
  
  var raw: String
}
object Raw {
  
  inline def apply(encoded: String, raw: String): Raw = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
    
    inline def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
