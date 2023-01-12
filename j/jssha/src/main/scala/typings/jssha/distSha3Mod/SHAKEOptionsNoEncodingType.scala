package typings.jssha.distSha3Mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SHAKEOptionsNoEncodingType] (val x: Self) extends AnyVal {
    
    inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
    
    inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
  }
}
