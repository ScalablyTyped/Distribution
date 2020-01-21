package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional search quality metadata of the item.
  */
@js.native
trait SchemaSearchQualityMetadata extends js.Object {
  /**
    * An indication of the quality of the item, used to influence search
    * quality. Value should be between 0.0 (lowest quality) and 1.0 (highest
    * quality). The default value is 0.0.
    */
  var quality: js.UndefOr[Double] = js.native
}

object SchemaSearchQualityMetadata {
  @scala.inline
  def apply(quality: Int | Double = null): SchemaSearchQualityMetadata = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchQualityMetadata]
  }
}

