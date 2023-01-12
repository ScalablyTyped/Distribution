package typings.jssha.anon

import typings.jssha.mod.FixedLengthOptionsNoEncodingType
import typings.jssha.mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKey
  extends StObject
     with FixedLengthOptionsNoEncodingType {
  
  var hmacKey: js.UndefOr[GenericInputType] = js.undefined
}
object HmacKey {
  
  inline def apply(): HmacKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HmacKey] (val x: Self) extends AnyVal {
    
    inline def setHmacKey(value: GenericInputType): Self = StObject.set(x, "hmacKey", value.asInstanceOf[js.Any])
    
    inline def setHmacKeyUndefined: Self = StObject.set(x, "hmacKey", js.undefined)
  }
}
