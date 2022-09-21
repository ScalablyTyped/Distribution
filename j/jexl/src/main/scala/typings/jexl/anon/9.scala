package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.closeParen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`
  extends StObject
     with Element {
  
  var `type`: closeParen
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("closeParen")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setType(value: closeParen): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
