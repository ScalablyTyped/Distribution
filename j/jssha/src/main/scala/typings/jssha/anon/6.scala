package typings.jssha.anon

import typings.jssha.distSha256Mod.EncodingType
import typings.jssha.distSha256Mod.FixedLengthOptionsEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with FixedLengthOptionsEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
  
  var numRounds: js.UndefOr[Double] = js.undefined
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
    
    inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
  }
}
