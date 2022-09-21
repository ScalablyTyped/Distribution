package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sticky extends StObject {
  
  var sticky: js.UndefOr[ZIndex] = js.undefined
}
object Sticky {
  
  inline def apply(): Sticky = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sticky]
  }
  
  extension [Self <: Sticky](x: Self) {
    
    inline def setSticky(value: ZIndex): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
