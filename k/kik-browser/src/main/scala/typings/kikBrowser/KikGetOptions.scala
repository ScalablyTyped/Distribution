package typings.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KikGetOptions extends StObject {
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minResults: js.UndefOr[Double] = js.native
  
  var quality: js.UndefOr[Double] = js.native
}
object KikGetOptions {
  
  @scala.inline
  def apply(): KikGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikGetOptions]
  }
  
  @scala.inline
  implicit class KikGetOptionsMutableBuilder[Self <: KikGetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinResults(value: Double): Self = StObject.set(x, "minResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResultsUndefined: Self = StObject.set(x, "minResults", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
