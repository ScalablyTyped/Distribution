package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSelectedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the color object.
    */
  var color: js.UndefOr[js.Any] = js.undefined
}
object ColorSelectedEventUIParam {
  
  inline def apply(): ColorSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSelectedEventUIParam]
  }
  
  extension [Self <: ColorSelectedEventUIParam](x: Self) {
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
