package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cps extends StObject {
  
  var cps: String
  
  var id: String
  
  var unotice: String
}
object Cps {
  
  inline def apply(cps: String, id: String, unotice: String): Cps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unotice = unotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  
  extension [Self <: Cps](x: Self) {
    
    inline def setCps(value: String): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUnotice(value: String): Self = StObject.set(x, "unotice", value.asInstanceOf[js.Any])
  }
}
