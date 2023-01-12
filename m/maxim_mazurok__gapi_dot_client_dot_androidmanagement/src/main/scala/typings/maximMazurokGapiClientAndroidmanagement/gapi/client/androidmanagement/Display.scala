package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  /** Display density expressed as dots-per-inch. */
  var density: js.UndefOr[Double] = js.undefined
  
  /** Unique display id. */
  var displayId: js.UndefOr[Double] = js.undefined
  
  /** Display height in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Name of the display. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Refresh rate of the display in frames per second. */
  var refreshRate: js.UndefOr[Double] = js.undefined
  
  /** State of the display. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Display width in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}
object Display {
  
  inline def apply(): Display = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setDisplayId(value: Double): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    inline def setDisplayIdUndefined: Self = StObject.set(x, "displayId", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
    
    inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
