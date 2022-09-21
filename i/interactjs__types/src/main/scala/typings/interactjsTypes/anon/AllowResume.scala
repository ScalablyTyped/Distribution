package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowResume extends StObject {
  
  var allowResume: js.UndefOr[`true`] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endSpeed: js.UndefOr[Double] = js.undefined
  
  var minSpeed: js.UndefOr[Double] = js.undefined
  
  var resistance: js.UndefOr[Double] = js.undefined
  
  var smoothEndDuration: js.UndefOr[Double] = js.undefined
}
object AllowResume {
  
  inline def apply(): AllowResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowResume]
  }
  
  extension [Self <: AllowResume](x: Self) {
    
    inline def setAllowResume(value: `true`): Self = StObject.set(x, "allowResume", value.asInstanceOf[js.Any])
    
    inline def setAllowResumeUndefined: Self = StObject.set(x, "allowResume", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndSpeed(value: Double): Self = StObject.set(x, "endSpeed", value.asInstanceOf[js.Any])
    
    inline def setEndSpeedUndefined: Self = StObject.set(x, "endSpeed", js.undefined)
    
    inline def setMinSpeed(value: Double): Self = StObject.set(x, "minSpeed", value.asInstanceOf[js.Any])
    
    inline def setMinSpeedUndefined: Self = StObject.set(x, "minSpeed", js.undefined)
    
    inline def setResistance(value: Double): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
    
    inline def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
    
    inline def setSmoothEndDuration(value: Double): Self = StObject.set(x, "smoothEndDuration", value.asInstanceOf[js.Any])
    
    inline def setSmoothEndDurationUndefined: Self = StObject.set(x, "smoothEndDuration", js.undefined)
  }
}
