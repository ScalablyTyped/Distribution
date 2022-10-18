package typings.jssha.anon

import typings.jssha.distSha3Mod.FixedLengthOptionsNoEncodingType
import typings.jssha.distSha3Mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`
  extends StObject
     with FixedLengthOptionsNoEncodingType {
  
  var hmacKey: js.UndefOr[GenericInputType] = js.undefined
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setHmacKey(value: GenericInputType): Self = StObject.set(x, "hmacKey", value.asInstanceOf[js.Any])
    
    inline def setHmacKeyUndefined: Self = StObject.set(x, "hmacKey", js.undefined)
  }
}
