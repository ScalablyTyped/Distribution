package typings.jssha.sha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SHAKEOptionsNoEncodingType extends StObject {
  
  var numRounds: js.UndefOr[Double] = js.undefined
}
object SHAKEOptionsNoEncodingType {
  
  inline def apply(): SHAKEOptionsNoEncodingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SHAKEOptionsNoEncodingType]
  }
  
  extension [Self <: SHAKEOptionsNoEncodingType](x: Self) {
    
    inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
    
    inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
  }
}
