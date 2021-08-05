package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Progressbar //////////////////////////////////////////////////
trait ProgressbarOptions
  extends StObject
     with ProgressbarEvents {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double | Boolean] = js.undefined
}
object ProgressbarOptions {
  
  inline def apply(): ProgressbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressbarOptions]
  }
  
  extension [Self <: ProgressbarOptions](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setValue(value: Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
