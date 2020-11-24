package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgRadialGaugeRange
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets the brush for the entire range.
    */
  var brush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the ending value of the range.
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the ending value of the inner extent of the range.
    */
  var innerEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the starting value of the inner extent of the range.
    */
  var innerStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the name of the range.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the ending value of the outer extent of the range.
    */
  var outerEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the starting value of the outer extent of the range.
    */
  var outerStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush for the outline of the range.
    */
  var outline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the flag used to determine if the range should be removed. If set to true, the range (if existing) is removed.
    */
  var remove: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the starting value of the range.
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the thickness of the range outline.
    */
  var strokeThickness: js.UndefOr[Double] = js.native
}
object IgRadialGaugeRange {
  
  @scala.inline
  def apply(): IgRadialGaugeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialGaugeRange]
  }
  
  @scala.inline
  implicit class IgRadialGaugeRangeOps[Self <: IgRadialGaugeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrush(value: String): Self = this.set("brush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrush: Self = this.set("brush", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setInnerEndExtent(value: Double): Self = this.set("innerEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerEndExtent: Self = this.set("innerEndExtent", js.undefined)
    
    @scala.inline
    def setInnerStartExtent(value: Double): Self = this.set("innerStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerStartExtent: Self = this.set("innerStartExtent", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOuterEndExtent(value: Double): Self = this.set("outerEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterEndExtent: Self = this.set("outerEndExtent", js.undefined)
    
    @scala.inline
    def setOuterStartExtent(value: Double): Self = this.set("outerStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterStartExtent: Self = this.set("outerStartExtent", js.undefined)
    
    @scala.inline
    def setOutline(value: String): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    
    @scala.inline
    def setStrokeThickness(value: Double): Self = this.set("strokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeThickness: Self = this.set("strokeThickness", js.undefined)
  }
}
