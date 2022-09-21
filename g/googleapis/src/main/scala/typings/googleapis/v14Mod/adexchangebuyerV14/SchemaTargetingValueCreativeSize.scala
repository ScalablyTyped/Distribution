package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueCreativeSize extends StObject {
  
  /**
    * The formats allowed by the publisher.
    */
  var allowedFormats: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * For video size type, the list of companion sizes.
    */
  var companionSizes: js.UndefOr[js.Array[SchemaTargetingValueSize]] = js.undefined
  
  /**
    * The Creative size type.
    */
  var creativeSizeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The native template for native ad.
    */
  var nativeTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For regular or video creative size type, specifies the size of the creative.
    */
  var size: js.UndefOr[SchemaTargetingValueSize] = js.undefined
  
  /**
    * The skippable ad type for video size.
    */
  var skippableAdType: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetingValueCreativeSize {
  
  inline def apply(): SchemaTargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueCreativeSize]
  }
  
  extension [Self <: SchemaTargetingValueCreativeSize](x: Self) {
    
    inline def setAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    inline def setAllowedFormatsNull: Self = StObject.set(x, "allowedFormats", null)
    
    inline def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    inline def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value*))
    
    inline def setCompanionSizes(value: js.Array[SchemaTargetingValueSize]): Self = StObject.set(x, "companionSizes", value.asInstanceOf[js.Any])
    
    inline def setCompanionSizesUndefined: Self = StObject.set(x, "companionSizes", js.undefined)
    
    inline def setCompanionSizesVarargs(value: SchemaTargetingValueSize*): Self = StObject.set(x, "companionSizes", js.Array(value*))
    
    inline def setCreativeSizeType(value: String): Self = StObject.set(x, "creativeSizeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeTypeNull: Self = StObject.set(x, "creativeSizeType", null)
    
    inline def setCreativeSizeTypeUndefined: Self = StObject.set(x, "creativeSizeType", js.undefined)
    
    inline def setNativeTemplate(value: String): Self = StObject.set(x, "nativeTemplate", value.asInstanceOf[js.Any])
    
    inline def setNativeTemplateNull: Self = StObject.set(x, "nativeTemplate", null)
    
    inline def setNativeTemplateUndefined: Self = StObject.set(x, "nativeTemplate", js.undefined)
    
    inline def setSize(value: SchemaTargetingValueSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    inline def setSkippableAdTypeNull: Self = StObject.set(x, "skippableAdType", null)
    
    inline def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
