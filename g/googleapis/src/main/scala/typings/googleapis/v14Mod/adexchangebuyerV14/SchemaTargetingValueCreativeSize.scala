package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next Id: 7
  */
@js.native
trait SchemaTargetingValueCreativeSize extends js.Object {
  /**
    * The formats allowed by the publisher.
    */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * For video size type, the list of companion sizes.
    */
  var companionSizes: js.UndefOr[js.Array[SchemaTargetingValueSize]] = js.native
  /**
    * The Creative size type.
    */
  var creativeSizeType: js.UndefOr[String] = js.native
  /**
    * The native template for native ad.
    */
  var nativeTemplate: js.UndefOr[String] = js.native
  /**
    * For regular or video creative size type, specifies the size of the
    * creative.
    */
  var size: js.UndefOr[SchemaTargetingValueSize] = js.native
  /**
    * The skippable ad type for video size.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}

object SchemaTargetingValueCreativeSize {
  @scala.inline
  def apply(
    allowedFormats: js.Array[String] = null,
    companionSizes: js.Array[SchemaTargetingValueSize] = null,
    creativeSizeType: String = null,
    nativeTemplate: String = null,
    size: SchemaTargetingValueSize = null,
    skippableAdType: String = null
  ): SchemaTargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    if (allowedFormats != null) __obj.updateDynamic("allowedFormats")(allowedFormats.asInstanceOf[js.Any])
    if (companionSizes != null) __obj.updateDynamic("companionSizes")(companionSizes.asInstanceOf[js.Any])
    if (creativeSizeType != null) __obj.updateDynamic("creativeSizeType")(creativeSizeType.asInstanceOf[js.Any])
    if (nativeTemplate != null) __obj.updateDynamic("nativeTemplate")(nativeTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skippableAdType != null) __obj.updateDynamic("skippableAdType")(skippableAdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueCreativeSize]
  }
}

