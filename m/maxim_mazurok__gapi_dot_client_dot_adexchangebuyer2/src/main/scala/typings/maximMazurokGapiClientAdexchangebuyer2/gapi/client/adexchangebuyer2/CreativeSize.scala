package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeSize extends StObject {
  
  /**
    * What formats are allowed by the publisher. If this repeated field is empty then all formats are allowed. For example, if this field contains AllowedFormatType.AUDIO then the
    * publisher only allows an audio ad (without any video).
    */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  
  /** For video creatives specifies the sizes of companion ads (if present). Companion sizes may be filled in only when creative_size_type = VIDEO */
  var companionSizes: js.UndefOr[js.Array[Size]] = js.native
  
  /** The creative size type. */
  var creativeSizeType: js.UndefOr[String] = js.native
  
  /** Output only. The native template for this creative. It will have a value only if creative_size_type = CreativeSizeType.NATIVE. */
  var nativeTemplate: js.UndefOr[String] = js.native
  
  /** For regular or video creative size type, specifies the size of the creative */
  var size: js.UndefOr[Size] = js.native
  
  /** The type of skippable ad for this creative. It will have a value only if creative_size_type = CreativeSizeType.VIDEO. */
  var skippableAdType: js.UndefOr[String] = js.native
}
object CreativeSize {
  
  @scala.inline
  def apply(): CreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeSize]
  }
  
  @scala.inline
  implicit class CreativeSizeMutableBuilder[Self <: CreativeSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "allowedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFormatsUndefined: Self = StObject.set(x, "allowedFormats", js.undefined)
    
    @scala.inline
    def setAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "allowedFormats", js.Array(value :_*))
    
    @scala.inline
    def setCompanionSizes(value: js.Array[Size]): Self = StObject.set(x, "companionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionSizesUndefined: Self = StObject.set(x, "companionSizes", js.undefined)
    
    @scala.inline
    def setCompanionSizesVarargs(value: Size*): Self = StObject.set(x, "companionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCreativeSizeType(value: String): Self = StObject.set(x, "creativeSizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeTypeUndefined: Self = StObject.set(x, "creativeSizeType", js.undefined)
    
    @scala.inline
    def setNativeTemplate(value: String): Self = StObject.set(x, "nativeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeTemplateUndefined: Self = StObject.set(x, "nativeTemplate", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
