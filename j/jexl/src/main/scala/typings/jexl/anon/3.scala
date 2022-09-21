package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with Element {
  
  var `type`: pipe
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pipe")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setType(value: pipe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
