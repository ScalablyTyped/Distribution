package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for online images.
  */
@js.native
trait SchemaWebImage extends js.Object {
  /**
    * (Deprecated) Overall relevancy score for the image.
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The result image URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaWebImage {
  @scala.inline
  def apply(score: js.UndefOr[Double] = js.undefined, url: String = null): SchemaWebImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebImage]
  }
}

