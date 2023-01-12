package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.comma
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`
  extends StObject
     with Element {
  
  var `type`: comma
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("comma")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setType(value: comma): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
