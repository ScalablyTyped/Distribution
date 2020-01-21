package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait SchemaImageProperties extends js.Object {
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaDominantColorsAnnotation] = js.native
}

object SchemaImageProperties {
  @scala.inline
  def apply(dominantColors: SchemaDominantColorsAnnotation = null): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    if (dominantColors != null) __obj.updateDynamic("dominantColors")(dominantColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageProperties]
  }
}

