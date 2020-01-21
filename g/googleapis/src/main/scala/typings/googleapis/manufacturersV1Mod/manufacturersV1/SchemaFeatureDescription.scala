package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A feature description of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#featuredesc.
  */
@js.native
trait SchemaFeatureDescription extends js.Object {
  /**
    * A short description of the feature.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * An optional image describing the feature.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * A detailed description of the feature.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaFeatureDescription {
  @scala.inline
  def apply(headline: String = null, image: SchemaImage = null, text: String = null): SchemaFeatureDescription = {
    val __obj = js.Dynamic.literal()
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFeatureDescription]
  }
}

