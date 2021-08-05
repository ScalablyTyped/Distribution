package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invert extends StObject {
  
  var invert: js.UndefOr[`3`] = js.undefined
}
object Invert {
  
  inline def apply(): Invert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invert]
  }
  
  extension [Self <: Invert](x: Self) {
    
    inline def setInvert(value: `3`): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
  }
}
