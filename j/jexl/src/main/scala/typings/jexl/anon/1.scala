package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.openBracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with Element {
  
  var `type`: openBracket
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("openBracket")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setType(value: openBracket): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
