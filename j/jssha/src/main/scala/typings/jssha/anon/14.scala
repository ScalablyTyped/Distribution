package typings.jssha.anon

import typings.jssha.distSha512Mod.EncodingType
import typings.jssha.distSha512Mod.FixedLengthOptionsEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`
  extends StObject
     with FixedLengthOptionsEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
  
  var numRounds: js.UndefOr[Double] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
    
    inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
  }
}
