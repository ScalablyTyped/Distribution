package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOptions extends StObject {
  
  var addWaypoints: js.UndefOr[Boolean] = js.native
  
  var extendToWaypoints: Boolean = js.native
  
  var missingRouteStyles: js.UndefOr[js.Array[PathOptions]] = js.native
  
  var missingRouteTolerance: Double = js.native
  
  var styles: js.UndefOr[js.Array[PathOptions]] = js.native
}
object LineOptions {
  
  @scala.inline
  def apply(extendToWaypoints: Boolean, missingRouteTolerance: Double): LineOptions = {
    val __obj = js.Dynamic.literal(extendToWaypoints = extendToWaypoints.asInstanceOf[js.Any], missingRouteTolerance = missingRouteTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
  
  @scala.inline
  implicit class LineOptionsMutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddWaypoints(value: Boolean): Self = StObject.set(x, "addWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddWaypointsUndefined: Self = StObject.set(x, "addWaypoints", js.undefined)
    
    @scala.inline
    def setExtendToWaypoints(value: Boolean): Self = StObject.set(x, "extendToWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingRouteStyles(value: js.Array[PathOptions]): Self = StObject.set(x, "missingRouteStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingRouteStylesUndefined: Self = StObject.set(x, "missingRouteStyles", js.undefined)
    
    @scala.inline
    def setMissingRouteStylesVarargs(value: PathOptions*): Self = StObject.set(x, "missingRouteStyles", js.Array(value :_*))
    
    @scala.inline
    def setMissingRouteTolerance(value: Double): Self = StObject.set(x, "missingRouteTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[PathOptions]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: PathOptions*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
