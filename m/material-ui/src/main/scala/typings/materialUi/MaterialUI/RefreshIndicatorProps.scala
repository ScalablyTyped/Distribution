package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.hide
import typings.materialUi.materialUiStrings.loading
import typings.materialUi.materialUiStrings.ready
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshIndicatorProps extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var left: Double
  
  var loadingColor: js.UndefOr[String] = js.undefined
  
  var percentage: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[ready | loading | hide] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var top: Double
}
object RefreshIndicatorProps {
  
  @scala.inline
  def apply(left: Double, top: Double): RefreshIndicatorProps = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshIndicatorProps]
  }
  
  @scala.inline
  implicit class RefreshIndicatorPropsMutableBuilder[Self <: RefreshIndicatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingColor(value: String): Self = StObject.set(x, "loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingColorUndefined: Self = StObject.set(x, "loadingColor", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: ready | loading | hide): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
