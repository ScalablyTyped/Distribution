package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridControlOptions
  extends StObject
     with ControlOptions {
  
  var follow: js.UndefOr[Boolean] = js.undefined
  
  var location: js.UndefOr[Boolean] = js.undefined
  
  var pinnable: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var touchTeaser: js.UndefOr[Boolean] = js.undefined
}
object GridControlOptions {
  
  inline def apply(): GridControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridControlOptions]
  }
  
  extension [Self <: GridControlOptions](x: Self) {
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPinnable(value: Boolean): Self = StObject.set(x, "pinnable", value.asInstanceOf[js.Any])
    
    inline def setPinnableUndefined: Self = StObject.set(x, "pinnable", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTouchTeaser(value: Boolean): Self = StObject.set(x, "touchTeaser", value.asInstanceOf[js.Any])
    
    inline def setTouchTeaserUndefined: Self = StObject.set(x, "touchTeaser", js.undefined)
  }
}
