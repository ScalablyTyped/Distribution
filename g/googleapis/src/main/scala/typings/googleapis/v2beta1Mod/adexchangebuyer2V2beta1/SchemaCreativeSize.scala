package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    allowedFormats: js.Array[String] = null,
    companionSizes: js.Array[SchemaSize] = null,
    creativeSizeType: String = null,
    nativeTemplate: String = null,
    size: SchemaSize = null,
    skippableAdType: String = null
  ): SchemaCreativeSize = {
    val __obj = js.Dynamic.literal()
    if (allowedFormats != null) __obj.updateDynamic("allowedFormats")(allowedFormats.asInstanceOf[js.Any])
    if (companionSizes != null) __obj.updateDynamic("companionSizes")(companionSizes.asInstanceOf[js.Any])
    if (creativeSizeType != null) __obj.updateDynamic("creativeSizeType")(creativeSizeType.asInstanceOf[js.Any])
    if (nativeTemplate != null) __obj.updateDynamic("nativeTemplate")(nativeTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skippableAdType != null) __obj.updateDynamic("skippableAdType")(skippableAdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeSize]
  }
}

