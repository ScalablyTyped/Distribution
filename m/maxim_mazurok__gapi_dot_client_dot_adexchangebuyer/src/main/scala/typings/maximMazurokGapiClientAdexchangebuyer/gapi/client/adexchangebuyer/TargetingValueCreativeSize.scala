package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueCreativeSize extends StObject {
  
  /** The formats allowed by the publisher. */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.undefined
  
  /** For video size type, the list of companion sizes. */
  var companionSizes: js.UndefOr[js.Array[TargetingValueSize]] = js.undefined
  
  /** The Creative size type. */
  var creativeSizeType: js.UndefOr[String] = js.undefined
  
  /** The native template for native ad. */
  var nativeTemplate: js.UndefOr[String] = js.undefined
  
  /** For regular or video creative size type, specifies the size of the creative. */
  var size: js.UndefOr[TargetingValueSize] = js.undefined
  
  /** The skippable ad type for video size. */
  var skippableAdType: js.UndefOr[String] = js.undefined
}
object TargetingValueCreativeSize {
  
  inline def apply(): TargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueCreativeSize]
  }
  
  extension [Self <: TargetingValueCreativeSize](x: Self) {
    
    inline def setAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    inline def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    inline def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value*))
    
    inline def setCompanionSizes(value: js.Array[TargetingValueSize]): Self = StObject.set(x, "companionSizes", value.asInstanceOf[js.Any])
    
    inline def setCompanionSizesUndefined: Self = StObject.set(x, "companionSizes", js.undefined)
    
    inline def setCompanionSizesVarargs(value: TargetingValueSize*): Self = StObject.set(x, "companionSizes", js.Array(value*))
    
    inline def setCreativeSizeType(value: String): Self = StObject.set(x, "creativeSizeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeTypeUndefined: Self = StObject.set(x, "creativeSizeType", js.undefined)
    
    inline def setNativeTemplate(value: String): Self = StObject.set(x, "nativeTemplate", value.asInstanceOf[js.Any])
    
    inline def setNativeTemplateUndefined: Self = StObject.set(x, "nativeTemplate", js.undefined)
    
    inline def setSize(value: TargetingValueSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    inline def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
