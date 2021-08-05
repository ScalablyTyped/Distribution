package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGConditionalProcessingAttributes extends StObject {
  
  var requiredExtensions: js.UndefOr[Boolean] = js.undefined
  
  var requiredFeatures: js.UndefOr[String] = js.undefined
  
  var systemLanguage: js.UndefOr[String] = js.undefined
}
object SVGConditionalProcessingAttributes {
  
  inline def apply(): SVGConditionalProcessingAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGConditionalProcessingAttributes]
  }
  
  extension [Self <: SVGConditionalProcessingAttributes](x: Self) {
    
    inline def setRequiredExtensions(value: Boolean): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
    
    inline def setRequiredFeatures(value: String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setSystemLanguage(value: String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
  }
}
