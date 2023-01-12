package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.closeBracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with Element {
  
  var `type`: closeBracket
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("closeBracket")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setType(value: closeBracket): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
