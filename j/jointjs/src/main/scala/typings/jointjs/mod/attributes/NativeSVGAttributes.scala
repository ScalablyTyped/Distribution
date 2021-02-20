package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeSVGAttributes
  extends SVGCoreAttributes
     with SVGPresentationAttributes
     with SVGConditionalProcessingAttributes
     with SVGXLinkAttributes
     with /* key */ StringDictionary[js.Any] {
  
  var `class`: js.UndefOr[String] = js.native
  
  var externalResourcesRequired: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var transform: js.UndefOr[String] = js.native
}
object NativeSVGAttributes {
  
  @scala.inline
  def apply(): NativeSVGAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeSVGAttributes]
  }
  
  @scala.inline
  implicit class NativeSVGAttributesMutableBuilder[Self <: NativeSVGAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setExternalResourcesRequired(value: Boolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
