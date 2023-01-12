package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invert extends StObject {
  
  var invert: js.UndefOr[`5`] = js.undefined
}
object Invert {
  
  inline def apply(): Invert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invert] (val x: Self) extends AnyVal {
    
    inline def setInvert(value: `5`): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
  }
}
