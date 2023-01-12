package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.openCurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with Element {
  
  var `type`: openCurl
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("openCurl")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setType(value: openCurl): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
