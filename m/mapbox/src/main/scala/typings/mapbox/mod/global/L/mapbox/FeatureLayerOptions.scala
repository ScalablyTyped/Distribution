package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerOptions extends StObject {
  
  var filter: js.UndefOr[FilterFunction] = js.undefined
  
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.undefined
}
object FeatureLayerOptions {
  
  @scala.inline
  def apply(): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerOptions]
  }
  
  @scala.inline
  implicit class FeatureLayerOptionsMutableBuilder[Self <: FeatureLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: /* feature */ js.Any => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setSanitizer(value: /* template */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
  }
}
