package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easeLinearity: js.UndefOr[Double] = js.undefined
  
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
}
object PanOptions {
  
  @scala.inline
  def apply(): PanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanOptions]
  }
  
  @scala.inline
  implicit class PanOptionsMutableBuilder[Self <: PanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEaseLinearity(value: Double): Self = StObject.set(x, "easeLinearity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseLinearityUndefined: Self = StObject.set(x, "easeLinearity", js.undefined)
    
    @scala.inline
    def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
  }
}
