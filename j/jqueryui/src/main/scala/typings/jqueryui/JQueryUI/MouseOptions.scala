package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// UI //////////////////////////////////////////////////
trait MouseOptions extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
}
object MouseOptions {
  
  @scala.inline
  def apply(): MouseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseOptions]
  }
  
  @scala.inline
  implicit class MouseOptionsMutableBuilder[Self <: MouseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
