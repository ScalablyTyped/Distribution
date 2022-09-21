package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ds extends StObject {
  
  var ds: String
  
  var `type`: String
  
  var value: String
}
object Ds {
  
  inline def apply(ds: String, `type`: String, value: String): Ds = {
    val __obj = js.Dynamic.literal(ds = ds.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ds]
  }
  
  extension [Self <: Ds](x: Self) {
    
    inline def setDs(value: String): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
