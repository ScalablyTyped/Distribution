package typings.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var b64Pad: js.UndefOr[String] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setB64Pad(value: String): Self = StObject.set(x, "b64Pad", value.asInstanceOf[js.Any])
    
    inline def setB64PadUndefined: Self = StObject.set(x, "b64Pad", js.undefined)
  }
}
