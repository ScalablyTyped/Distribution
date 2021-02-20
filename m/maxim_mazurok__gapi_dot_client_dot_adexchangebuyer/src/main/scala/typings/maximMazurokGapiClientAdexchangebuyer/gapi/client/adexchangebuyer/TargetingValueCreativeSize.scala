package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValueCreativeSize extends StObject {
  
  /** The formats allowed by the publisher. */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  
  /** For video size type, the list of companion sizes. */
  var companionSizes: js.UndefOr[js.Array[TargetingValueSize]] = js.native
  
  /** The Creative size type. */
  var creativeSizeType: js.UndefOr[String] = js.native
  
  /** The native template for native ad. */
  var nativeTemplate: js.UndefOr[String] = js.native
  
  /** For regular or video creative size type, specifies the size of the creative. */
  var size: js.UndefOr[TargetingValueSize] = js.native
  
  /** The skippable ad type for video size. */
  var skippableAdType: js.UndefOr[String] = js.native
}
object TargetingValueCreativeSize {
  
  @scala.inline
  def apply(): TargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueCreativeSize]
  }
  
  @scala.inline
  implicit class TargetingValueCreativeSizeMutableBuilder[Self <: TargetingValueCreativeSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    @scala.inline
    def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value :_*))
    
    @scala.inline
    def setCompanionSizes(value: js.Array[TargetingValueSize]): Self = StObject.set(x, "companionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionSizesUndefined: Self = StObject.set(x, "companionSizes", js.undefined)
    
    @scala.inline
    def setCompanionSizesVarargs(value: TargetingValueSize*): Self = StObject.set(x, "companionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCreativeSizeType(value: String): Self = StObject.set(x, "creativeSizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeTypeUndefined: Self = StObject.set(x, "creativeSizeType", js.undefined)
    
    @scala.inline
    def setNativeTemplate(value: String): Self = StObject.set(x, "nativeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeTemplateUndefined: Self = StObject.set(x, "nativeTemplate", js.undefined)
    
    @scala.inline
    def setSize(value: TargetingValueSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
