package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
}
object Length {
  
  inline def apply(): Length = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
