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
  
  @scala.inline
  def apply(): SVGConditionalProcessingAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGConditionalProcessingAttributes]
  }
  
  @scala.inline
  implicit class SVGConditionalProcessingAttributesMutableBuilder[Self <: SVGConditionalProcessingAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredExtensions(value: Boolean): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    @scala.inline
    def setSystemLanguage(value: String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
  }
}
