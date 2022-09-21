package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.colon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with Element {
  
  var `type`: colon
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("colon")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setType(value: colon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
