package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddrType extends StObject {
  
  var Addr_Type: String
  
  var Score: Double
}
object AddrType {
  
  inline def apply(Addr_Type: String, Score: Double): AddrType = {
    val __obj = js.Dynamic.literal(Addr_Type = Addr_Type.asInstanceOf[js.Any], Score = Score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddrType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddrType] (val x: Self) extends AnyVal {
    
    inline def setAddr_Type(value: String): Self = StObject.set(x, "Addr_Type", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
  }
}
