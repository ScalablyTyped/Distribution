package typings.jssha.distSha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SHAKEOptionsEncodingType
  extends StObject
     with SHAKEOptionsNoEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
}
object SHAKEOptionsEncodingType {
  
  inline def apply(): SHAKEOptionsEncodingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SHAKEOptionsEncodingType]
  }
  
  extension [Self <: SHAKEOptionsEncodingType](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
