package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impressions extends StObject {
  
  var blank: js.UndefOr[Double] = js.undefined
  
  var `blank-two-sided`: js.UndefOr[Double] = js.undefined
  
  var `full-color`: js.UndefOr[Double] = js.undefined
  
  var `full-color-two-sided`: js.UndefOr[Double] = js.undefined
  
  var `highlight-color`: js.UndefOr[Double] = js.undefined
  
  var `highlight-color-two-sided`: js.UndefOr[Double] = js.undefined
  
  var monochrome: js.UndefOr[Double] = js.undefined
  
  var `monochrome-two-sided`: js.UndefOr[Double] = js.undefined
}
object Impressions {
  
  @scala.inline
  def apply(): Impressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Impressions]
  }
  
  @scala.inline
  implicit class ImpressionsMutableBuilder[Self <: Impressions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlank(value: Double): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlank-two-sided`(value: Double): Self = StObject.set(x, "blank-two-sided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlank-two-sidedUndefined`: Self = StObject.set(x, "blank-two-sided", js.undefined)
    
    @scala.inline
    def setBlankUndefined: Self = StObject.set(x, "blank", js.undefined)
    
    @scala.inline
    def `setFull-color`(value: Double): Self = StObject.set(x, "full-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFull-color-two-sided`(value: Double): Self = StObject.set(x, "full-color-two-sided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFull-color-two-sidedUndefined`: Self = StObject.set(x, "full-color-two-sided", js.undefined)
    
    @scala.inline
    def `setFull-colorUndefined`: Self = StObject.set(x, "full-color", js.undefined)
    
    @scala.inline
    def `setHighlight-color`(value: Double): Self = StObject.set(x, "highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHighlight-color-two-sided`(value: Double): Self = StObject.set(x, "highlight-color-two-sided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHighlight-color-two-sidedUndefined`: Self = StObject.set(x, "highlight-color-two-sided", js.undefined)
    
    @scala.inline
    def `setHighlight-colorUndefined`: Self = StObject.set(x, "highlight-color", js.undefined)
    
    @scala.inline
    def setMonochrome(value: Double): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMonochrome-two-sided`(value: Double): Self = StObject.set(x, "monochrome-two-sided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMonochrome-two-sidedUndefined`: Self = StObject.set(x, "monochrome-two-sided", js.undefined)
    
    @scala.inline
    def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
  }
}
