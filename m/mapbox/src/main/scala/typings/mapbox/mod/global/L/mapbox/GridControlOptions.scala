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
  
  @scala.inline
  def apply(): GridControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridControlOptions]
  }
  
  @scala.inline
  implicit class GridControlOptionsMutableBuilder[Self <: GridControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPinnable(value: Boolean): Self = StObject.set(x, "pinnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnableUndefined: Self = StObject.set(x, "pinnable", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTouchTeaser(value: Boolean): Self = StObject.set(x, "touchTeaser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchTeaserUndefined: Self = StObject.set(x, "touchTeaser", js.undefined)
  }
}
