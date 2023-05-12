package typings.jotai.anon

import typings.jotai.vanillaStoreMod.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait D extends StObject {
  
  var d: Dependencies
}
object D {
  
  inline def apply(d: Dependencies): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: D] (val x: Self) extends AnyVal {
    
    inline def setD(value: Dependencies): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
