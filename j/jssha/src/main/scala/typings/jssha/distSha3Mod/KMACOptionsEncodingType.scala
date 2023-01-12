package typings.jssha.distSha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMACOptionsEncodingType
  extends StObject
     with KMACOptionsNoEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
}
object KMACOptionsEncodingType {
  
  inline def apply(kmacKey: GenericInputType): KMACOptionsEncodingType = {
    val __obj = js.Dynamic.literal(kmacKey = kmacKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMACOptionsEncodingType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KMACOptionsEncodingType] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
