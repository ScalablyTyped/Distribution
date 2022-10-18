package typings.jssha.anon

import typings.jssha.mod.EncodingType
import typings.jssha.mod.FixedLengthOptionsEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumRounds
  extends StObject
     with FixedLengthOptionsEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
  
  var numRounds: js.UndefOr[Double] = js.undefined
}
object NumRounds {
  
  inline def apply(): NumRounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumRounds]
  }
  
  extension [Self <: NumRounds](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
    
    inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
  }
}
