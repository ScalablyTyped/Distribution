package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: js.UndefOr[String] = js.undefined
  
  var hex: js.UndefOr[String] = js.undefined
  
  var int: js.UndefOr[Double] = js.undefined
}
object Int {
  
  inline def apply(): Int = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Int]
  }
  
  extension [Self <: Int](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    
    inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setIntUndefined: Self = StObject.set(x, "int", js.undefined)
  }
}
