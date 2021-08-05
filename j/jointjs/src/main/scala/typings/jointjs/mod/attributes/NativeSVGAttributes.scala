package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeSVGAttributes
  extends StObject
     with SVGCoreAttributes
     with SVGPresentationAttributes
     with SVGConditionalProcessingAttributes
     with SVGXLinkAttributes
     with /* key */ StringDictionary[js.Any] {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var externalResourcesRequired: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[js.Any] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
}
object NativeSVGAttributes {
  
  inline def apply(): NativeSVGAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeSVGAttributes]
  }
  
  extension [Self <: NativeSVGAttributes](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setExternalResourcesRequired(value: Boolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
    
    inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
