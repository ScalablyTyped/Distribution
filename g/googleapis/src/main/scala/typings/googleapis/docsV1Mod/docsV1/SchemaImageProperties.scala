package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of an image.
  */
@js.native
trait SchemaImageProperties extends js.Object {
  /**
    * The clockwise rotation angle of the image, in radians.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * A URI to the image with a default lifetime of 30 minutes. This URI is
    * tagged with the account of the requester. Anyone with the URI effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the document&#39;s sharing settings change.
    */
  var contentUri: js.UndefOr[String] = js.native
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var contrast: js.UndefOr[Double] = js.native
  /**
    * The crop properties of the image.  After cropping, the image will be
    * stretched to fit in its container.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.native
  /**
    * The source URI is the URI used to insert the image. The source URI can be
    * empty.
    */
  var sourceUri: js.UndefOr[String] = js.native
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    */
  var transparency: js.UndefOr[Double] = js.native
}

object SchemaImageProperties {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    brightness: js.UndefOr[Double] = js.undefined,
    contentUri: String = null,
    contrast: js.UndefOr[Double] = js.undefined,
    cropProperties: SchemaCropProperties = null,
    sourceUri: String = null,
    transparency: js.UndefOr[Double] = js.undefined
  ): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageProperties]
  }
}

