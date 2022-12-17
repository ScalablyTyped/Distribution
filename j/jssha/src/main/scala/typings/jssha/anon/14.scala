package typings.jssha.anon

import typings.jssha.distSha512Mod.FixedLengthOptionsNoEncodingType
import typings.jssha.distSha512Mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`
  extends StObject
     with FixedLengthOptionsNoEncodingType {
  
  var hmacKey: js.UndefOr[GenericInputType] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setHmacKey(value: GenericInputType): Self = StObject.set(x, "hmacKey", value.asInstanceOf[js.Any])
    
    inline def setHmacKeyUndefined: Self = StObject.set(x, "hmacKey", js.undefined)
  }
}
