package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgBulletGraphRange
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets or sets the brush to use to fill the range.
    */
  var brush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the value at which the range ends along the scale.
    */
  var endValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the inner edge of the range.
    * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
    */
  var innerEndExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the inner edge of the range.
    * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
    */
  var innerStartExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the name of the range.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the outer edge of the range.
    * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
    */
  var outerEndExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the outer edge of the range.
    * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
    */
  var outerStartExtent: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the outline to use when rendering the range.
    */
  var outline: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the value at which the range starts along the scale.
    */
  var startValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the stroke thickness to use when rendering this range's outline.
    */
  var strokeThickness: js.UndefOr[Double] = js.undefined
}
object IgBulletGraphRange {
  
  inline def apply(): IgBulletGraphRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBulletGraphRange]
  }
  
  extension [Self <: IgBulletGraphRange](x: Self) {
    
    inline def setBrush(value: String): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    inline def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
    
    inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setInnerEndExtent(value: Double): Self = StObject.set(x, "innerEndExtent", value.asInstanceOf[js.Any])
    
    inline def setInnerEndExtentUndefined: Self = StObject.set(x, "innerEndExtent", js.undefined)
    
    inline def setInnerStartExtent(value: Double): Self = StObject.set(x, "innerStartExtent", value.asInstanceOf[js.Any])
    
    inline def setInnerStartExtentUndefined: Self = StObject.set(x, "innerStartExtent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOuterEndExtent(value: Double): Self = StObject.set(x, "outerEndExtent", value.asInstanceOf[js.Any])
    
    inline def setOuterEndExtentUndefined: Self = StObject.set(x, "outerEndExtent", js.undefined)
    
    inline def setOuterStartExtent(value: Double): Self = StObject.set(x, "outerStartExtent", value.asInstanceOf[js.Any])
    
    inline def setOuterStartExtentUndefined: Self = StObject.set(x, "outerStartExtent", js.undefined)
    
    inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
    
    inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
  }
}
