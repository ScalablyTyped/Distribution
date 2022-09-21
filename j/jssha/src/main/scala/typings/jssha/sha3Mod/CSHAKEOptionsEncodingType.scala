package typings.jssha.sha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSHAKEOptionsEncodingType
  extends StObject
     with CSHAKEOptionsNoEncodingType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
}
object CSHAKEOptionsEncodingType {
  
  inline def apply(): CSHAKEOptionsEncodingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSHAKEOptionsEncodingType]
  }
  
  extension [Self <: CSHAKEOptionsEncodingType](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
