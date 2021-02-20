package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDataChartCrosshairPoint
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The x coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}
object IgDataChartCrosshairPoint {
  
  @scala.inline
  def apply(): IgDataChartCrosshairPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartCrosshairPoint]
  }
  
  @scala.inline
  implicit class IgDataChartCrosshairPointMutableBuilder[Self <: IgDataChartCrosshairPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
