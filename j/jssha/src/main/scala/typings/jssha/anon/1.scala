package typings.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var b64Pad: js.UndefOr[String] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setB64Pad(value: String): Self = StObject.set(x, "b64Pad", value.asInstanceOf[js.Any])
    
    inline def setB64PadUndefined: Self = StObject.set(x, "b64Pad", js.undefined)
  }
}
