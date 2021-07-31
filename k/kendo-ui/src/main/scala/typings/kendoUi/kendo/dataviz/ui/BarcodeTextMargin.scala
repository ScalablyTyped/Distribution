package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarcodeTextMargin extends StObject {
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object BarcodeTextMargin {
  
  @scala.inline
  def apply(): BarcodeTextMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarcodeTextMargin]
  }
  
  @scala.inline
  implicit class BarcodeTextMarginMutableBuilder[Self <: BarcodeTextMargin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
