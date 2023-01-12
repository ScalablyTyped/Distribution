package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriangulationStatusChangedEventUIParam extends StObject {
  
  /**
    * Used to get current status.
    */
  var currentStatus: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to map object.
    */
  var map: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[Any] = js.undefined
}
object TriangulationStatusChangedEventUIParam {
  
  inline def apply(): TriangulationStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationStatusChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriangulationStatusChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setCurrentStatus(value: Any): Self = StObject.set(x, "currentStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentStatusUndefined: Self = StObject.set(x, "currentStatus", js.undefined)
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setSeries(value: Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
