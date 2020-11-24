package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the size of the creative.
  */
@js.native
trait SchemaCreativeSize extends js.Object {
  
  /**
    * What formats are allowed by the publisher. If this repeated field is
    * empty then all formats are allowed. For example, if this field contains
    * AllowedFormatType.AUDIO then the publisher only allows an audio ad
    * (without any video).
    */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * For video creatives specifies the sizes of companion ads (if present).
    * Companion sizes may be filled in only when creative_size_type = VIDEO
    */
  var companionSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  
  /**
    * The creative size type.
    */
  var creativeSizeType: js.UndefOr[String] = js.native
  
  /**
    * The native template for this creative. It will have a value only if
    * creative_size_type = CreativeSizeType.NATIVE. @OutputOnly
    */
  var nativeTemplate: js.UndefOr[String] = js.native
  
  /**
    * For regular or video creative size type, specifies the size of the
    * creative
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * The type of skippable ad for this creative. It will have a value only if
    * creative_size_type = CreativeSizeType.VIDEO.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}
object SchemaCreativeSize {
  
  @scala.inline
  def apply(): SchemaCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSize]
  }
  
  @scala.inline
  implicit class SchemaCreativeSizeOps[Self <: SchemaCreativeSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedFormatsVarargs(value: String*): Self = this.set("allowedFormats", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFormats(value: js.Array[String]): Self = this.set("allowedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFormats: Self = this.set("allowedFormats", js.undefined)
    
    @scala.inline
    def setCompanionSizesVarargs(value: SchemaSize*): Self = this.set("companionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCompanionSizes(value: js.Array[SchemaSize]): Self = this.set("companionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionSizes: Self = this.set("companionSizes", js.undefined)
    
    @scala.inline
    def setCreativeSizeType(value: String): Self = this.set("creativeSizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSizeType: Self = this.set("creativeSizeType", js.undefined)
    
    @scala.inline
    def setNativeTemplate(value: String): Self = this.set("nativeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeTemplate: Self = this.set("nativeTemplate", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSkippableAdType(value: String): Self = this.set("skippableAdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippableAdType: Self = this.set("skippableAdType", js.undefined)
  }
}
