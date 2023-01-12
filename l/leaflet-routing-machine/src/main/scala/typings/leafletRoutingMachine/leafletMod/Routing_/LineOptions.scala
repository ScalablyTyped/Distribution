package typings.leafletRoutingMachine.leafletMod.Routing_

import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOptions extends StObject {
  
  var addWaypoints: js.UndefOr[Boolean] = js.undefined
  
  var extendToWaypoints: Boolean
  
  var missingRouteStyles: js.UndefOr[js.Array[PathOptions]] = js.undefined
  
  var missingRouteTolerance: Double
  
  var styles: js.UndefOr[js.Array[PathOptions]] = js.undefined
}
object LineOptions {
  
  inline def apply(extendToWaypoints: Boolean, missingRouteTolerance: Double): LineOptions = {
    val __obj = js.Dynamic.literal(extendToWaypoints = extendToWaypoints.asInstanceOf[js.Any], missingRouteTolerance = missingRouteTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
    
    inline def setAddWaypoints(value: Boolean): Self = StObject.set(x, "addWaypoints", value.asInstanceOf[js.Any])
    
    inline def setAddWaypointsUndefined: Self = StObject.set(x, "addWaypoints", js.undefined)
    
    inline def setExtendToWaypoints(value: Boolean): Self = StObject.set(x, "extendToWaypoints", value.asInstanceOf[js.Any])
    
    inline def setMissingRouteStyles(value: js.Array[PathOptions]): Self = StObject.set(x, "missingRouteStyles", value.asInstanceOf[js.Any])
    
    inline def setMissingRouteStylesUndefined: Self = StObject.set(x, "missingRouteStyles", js.undefined)
    
    inline def setMissingRouteStylesVarargs(value: PathOptions*): Self = StObject.set(x, "missingRouteStyles", js.Array(value*))
    
    inline def setMissingRouteTolerance(value: Double): Self = StObject.set(x, "missingRouteTolerance", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[PathOptions]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: PathOptions*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
