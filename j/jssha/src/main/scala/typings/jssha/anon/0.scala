package typings.jssha.anon

import typings.jssha.mod.FixedLengthOptionsNoEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with FixedLengthOptionsNoEncodingType
     with typings.jssha.distSha1Mod.FixedLengthOptionsNoEncodingType
     with typings.jssha.distSha3Mod.FixedLengthOptionsNoEncodingType
     with typings.jssha.distSha256Mod.FixedLengthOptionsNoEncodingType
     with typings.jssha.distSha512Mod.FixedLengthOptionsNoEncodingType {
  
  var numRounds: js.UndefOr[Double] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
    
    inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
  }
}
