package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriangulationStatusChangedEventUIParam extends StObject {
  
  /**
    * Used to get current status.
    */
  var currentStatus: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to map object.
    */
  var map: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
}
object TriangulationStatusChangedEventUIParam {
  
  @scala.inline
  def apply(): TriangulationStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationStatusChangedEventUIParam]
  }
  
  @scala.inline
  implicit class TriangulationStatusChangedEventUIParamMutableBuilder[Self <: TriangulationStatusChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentStatus(value: js.Any): Self = StObject.set(x, "currentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStatusUndefined: Self = StObject.set(x, "currentStatus", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
