package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorYAxisResizeControlledAxisOptions extends StObject {
  
  /**
    * (Highstock) Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis will be used.
    */
  var next: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * (Highstock) Array of axes that should move with the current axis while
    * resizing.
    */
  var prev: js.UndefOr[js.Array[Double | String]] = js.undefined
}
object NavigatorYAxisResizeControlledAxisOptions {
  
  inline def apply(): NavigatorYAxisResizeControlledAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisResizeControlledAxisOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorYAxisResizeControlledAxisOptions] (val x: Self) extends AnyVal {
    
    inline def setNext(value: js.Array[Double | String]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: (Double | String)*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setPrev(value: js.Array[Double | String]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPrevVarargs(value: (Double | String)*): Self = StObject.set(x, "prev", js.Array(value*))
  }
}
