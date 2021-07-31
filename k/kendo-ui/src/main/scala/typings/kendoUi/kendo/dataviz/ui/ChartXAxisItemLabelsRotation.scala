package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartXAxisItemLabelsRotation extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var angle: js.UndefOr[Double | String] = js.undefined
}
object ChartXAxisItemLabelsRotation {
  
  @scala.inline
  def apply(): ChartXAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxisItemLabelsRotation]
  }
  
  @scala.inline
  implicit class ChartXAxisItemLabelsRotationMutableBuilder[Self <: ChartXAxisItemLabelsRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAngle(value: Double | String): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
