package typings.lottieWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRendererConfig
  extends StObject
     with BaseRendererConfig {
  
  var description: js.UndefOr[String] = js.undefined
  
  var filterSize: js.UndefOr[FilterSizeConfig] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var hideOnTransparent: js.UndefOr[Boolean] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var progressiveLoad: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var viewBoxOnly: js.UndefOr[Boolean] = js.undefined
  
  var viewBoxSize: js.UndefOr[String] = js.undefined
}
object SVGRendererConfig {
  
  inline def apply(): SVGRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRendererConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGRendererConfig] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilterSize(value: FilterSizeConfig): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    inline def setFilterSizeUndefined: Self = StObject.set(x, "filterSize", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
    
    inline def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
    
    inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setViewBoxOnly(value: Boolean): Self = StObject.set(x, "viewBoxOnly", value.asInstanceOf[js.Any])
    
    inline def setViewBoxOnlyUndefined: Self = StObject.set(x, "viewBoxOnly", js.undefined)
    
    inline def setViewBoxSize(value: String): Self = StObject.set(x, "viewBoxSize", value.asInstanceOf[js.Any])
    
    inline def setViewBoxSizeUndefined: Self = StObject.set(x, "viewBoxSize", js.undefined)
  }
}
