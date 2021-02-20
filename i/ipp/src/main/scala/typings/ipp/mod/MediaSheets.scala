package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSheets extends StObject {
  
  var blank: js.UndefOr[Double] = js.native
  
  var `full-color`: js.UndefOr[Double] = js.native
  
  var `highlight-color`: js.UndefOr[Double] = js.native
  
  var monochrome: js.UndefOr[Double] = js.native
}
object MediaSheets {
  
  @scala.inline
  def apply(): MediaSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSheets]
  }
  
  @scala.inline
  implicit class MediaSheetsMutableBuilder[Self <: MediaSheets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlank(value: Double): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlankUndefined: Self = StObject.set(x, "blank", js.undefined)
    
    @scala.inline
    def `setFull-color`(value: Double): Self = StObject.set(x, "full-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFull-colorUndefined`: Self = StObject.set(x, "full-color", js.undefined)
    
    @scala.inline
    def `setHighlight-color`(value: Double): Self = StObject.set(x, "highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHighlight-colorUndefined`: Self = StObject.set(x, "highlight-color", js.undefined)
    
    @scala.inline
    def setMonochrome(value: Double): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
  }
}
