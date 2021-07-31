package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRadialGaugeRange
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets the brush for the entire range.
    */
  var brush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the ending value of the range.
    */
  var endValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the ending value of the inner extent of the range.
    */
  var innerEndExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the starting value of the inner extent of the range.
    */
  var innerStartExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the name of the range.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the ending value of the outer extent of the range.
    */
  var outerEndExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the starting value of the outer extent of the range.
    */
  var outerStartExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the brush for the outline of the range.
    */
  var outline: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the flag used to determine if the range should be removed. If set to true, the range (if existing) is removed.
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the starting value of the range.
    */
  var startValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the thickness of the range outline.
    */
  var strokeThickness: js.UndefOr[Double] = js.undefined
}
object IgRadialGaugeRange {
  
  @scala.inline
  def apply(): IgRadialGaugeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialGaugeRange]
  }
  
  @scala.inline
  implicit class IgRadialGaugeRangeMutableBuilder[Self <: IgRadialGaugeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrush(value: String): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    @scala.inline
    def setInnerEndExtent(value: Double): Self = StObject.set(x, "innerEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerEndExtentUndefined: Self = StObject.set(x, "innerEndExtent", js.undefined)
    
    @scala.inline
    def setInnerStartExtent(value: Double): Self = StObject.set(x, "innerStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerStartExtentUndefined: Self = StObject.set(x, "innerStartExtent", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOuterEndExtent(value: Double): Self = StObject.set(x, "outerEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterEndExtentUndefined: Self = StObject.set(x, "outerEndExtent", js.undefined)
    
    @scala.inline
    def setOuterStartExtent(value: Double): Self = StObject.set(x, "outerStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterStartExtentUndefined: Self = StObject.set(x, "outerStartExtent", js.undefined)
    
    @scala.inline
    def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    @scala.inline
    def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
  }
}
