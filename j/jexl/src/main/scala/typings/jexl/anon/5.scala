package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.closeCurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`
  extends StObject
     with Element {
  
  var `type`: closeCurl
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("closeCurl")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setType(value: closeCurl): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
