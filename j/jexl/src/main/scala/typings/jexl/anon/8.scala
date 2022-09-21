package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.openParen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`
  extends StObject
     with Element {
  
  var `type`: openParen
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("openParen")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setType(value: openParen): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
