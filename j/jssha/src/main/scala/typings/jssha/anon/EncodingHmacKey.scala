package typings.jssha.anon

import typings.jssha.distSha1Mod.EncodingType
import typings.jssha.distSha1Mod.FixedLengthOptionsEncodingType
import typings.jssha.distSha1Mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingHmacKey
  extends StObject
     with FixedLengthOptionsEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
  
  var hmacKey: js.UndefOr[GenericInputType] = js.undefined
}
object EncodingHmacKey {
  
  inline def apply(): EncodingHmacKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingHmacKey]
  }
  
  extension [Self <: EncodingHmacKey](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHmacKey(value: GenericInputType): Self = StObject.set(x, "hmacKey", value.asInstanceOf[js.Any])
    
    inline def setHmacKeyUndefined: Self = StObject.set(x, "hmacKey", js.undefined)
  }
}
