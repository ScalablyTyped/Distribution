package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeSize extends StObject {
  
  /**
    * What formats are allowed by the publisher. If this repeated field is empty then all formats are allowed. For example, if this field contains AllowedFormatType.AUDIO then the publisher only allows an audio ad (without any video).
    */
  var allowedFormats: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * For video creatives specifies the sizes of companion ads (if present). Companion sizes may be filled in only when creative_size_type = VIDEO
    */
  var companionSizes: js.UndefOr[js.Array[SchemaSize]] = js.undefined
  
  /**
    * The creative size type.
    */
  var creativeSizeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The native template for this creative. It will have a value only if creative_size_type = CreativeSizeType.NATIVE.
    */
  var nativeTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For regular or video creative size type, specifies the size of the creative
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * The type of skippable ad for this creative. It will have a value only if creative_size_type = CreativeSizeType.VIDEO.
    */
  var skippableAdType: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeSize {
  
  inline def apply(): SchemaCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSize]
  }
  
  extension [Self <: SchemaCreativeSize](x: Self) {
    
    inline def setAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    inline def setAllowedFormatsNull: Self = StObject.set(x, "allowedFormats", null)
    
    inline def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    inline def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value*))
    
    inline def setCompanionSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "companionSizes", value.asInstanceOf[js.Any])
    
    inline def setCompanionSizesUndefined: Self = StObject.set(x, "companionSizes", js.undefined)
    
    inline def setCompanionSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "companionSizes", js.Array(value*))
    
    inline def setCreativeSizeType(value: String): Self = StObject.set(x, "creativeSizeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeTypeNull: Self = StObject.set(x, "creativeSizeType", null)
    
    inline def setCreativeSizeTypeUndefined: Self = StObject.set(x, "creativeSizeType", js.undefined)
    
    inline def setNativeTemplate(value: String): Self = StObject.set(x, "nativeTemplate", value.asInstanceOf[js.Any])
    
    inline def setNativeTemplateNull: Self = StObject.set(x, "nativeTemplate", null)
    
    inline def setNativeTemplateUndefined: Self = StObject.set(x, "nativeTemplate", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    inline def setSkippableAdTypeNull: Self = StObject.set(x, "skippableAdType", null)
    
    inline def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
