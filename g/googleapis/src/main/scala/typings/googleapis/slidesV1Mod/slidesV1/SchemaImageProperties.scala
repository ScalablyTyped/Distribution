package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Image.
  */
@js.native
trait SchemaImageProperties extends js.Object {
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var contrast: js.UndefOr[Double] = js.native
  /**
    * The crop properties of the image. If not set, the image is not cropped.
    * This property is read-only.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.native
  /**
    * The hyperlink destination of the image. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * The outline of the image. If not set, the image has no outline.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  /**
    * The recolor effect of the image. If not set, the image is not recolored.
    * This property is read-only.
    */
  var recolor: js.UndefOr[SchemaRecolor] = js.native
  /**
    * The shadow of the image. If not set, the image has no shadow. This
    * property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.native
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    * This property is read-only.
    */
  var transparency: js.UndefOr[Double] = js.native
}

object SchemaImageProperties {
  @scala.inline
  def apply(
    brightness: js.UndefOr[Double] = js.undefined,
    contrast: js.UndefOr[Double] = js.undefined,
    cropProperties: SchemaCropProperties = null,
    link: SchemaLink = null,
    outline: SchemaOutline = null,
    recolor: SchemaRecolor = null,
    shadow: SchemaShadow = null,
    transparency: js.UndefOr[Double] = js.undefined
  ): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (recolor != null) __obj.updateDynamic("recolor")(recolor.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageProperties]
  }
}

