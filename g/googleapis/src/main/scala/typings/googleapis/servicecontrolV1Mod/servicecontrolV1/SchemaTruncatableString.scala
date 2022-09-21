package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTruncatableString extends StObject {
  
  /**
    * The number of bytes removed from the original string. If this value is 0, then the string was not shortened.
    */
  var truncatedByteCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The shortened string. For example, if the original string is 500 bytes long and the limit of the string is 128 bytes, then `value` contains the first 128 bytes of the 500-byte string. Truncation always happens on a UTF8 character boundary. If there are multi-byte characters in the string, then the length of the shortened string might be less than the size limit.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaTruncatableString {
  
  inline def apply(): SchemaTruncatableString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTruncatableString]
  }
  
  extension [Self <: SchemaTruncatableString](x: Self) {
    
    inline def setTruncatedByteCount(value: Double): Self = StObject.set(x, "truncatedByteCount", value.asInstanceOf[js.Any])
    
    inline def setTruncatedByteCountNull: Self = StObject.set(x, "truncatedByteCount", null)
    
    inline def setTruncatedByteCountUndefined: Self = StObject.set(x, "truncatedByteCount", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
