package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var intl: Boolean
  
  var intlTokens: Boolean
  
  var relative: Boolean
  
  var zones: Boolean
}
object Features {
  
  inline def apply(intl: Boolean, intlTokens: Boolean, relative: Boolean, zones: Boolean): Features = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], intlTokens = intlTokens.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setIntl(value: Boolean): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
    
    inline def setIntlTokens(value: Boolean): Self = StObject.set(x, "intlTokens", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setZones(value: Boolean): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
  }
}
