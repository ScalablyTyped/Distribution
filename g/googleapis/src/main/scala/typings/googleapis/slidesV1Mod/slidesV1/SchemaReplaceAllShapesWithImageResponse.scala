package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of replacing shapes with an image.
  */
@js.native
trait SchemaReplaceAllShapesWithImageResponse extends js.Object {
  /**
    * The number of shapes replaced with images.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object SchemaReplaceAllShapesWithImageResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): SchemaReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReplaceAllShapesWithImageResponse]
  }
}

