package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the position of slides in the presentation.
  */
@js.native
trait SchemaUpdateSlidesPositionRequest extends js.Object {
  /**
    * The index where the slides should be inserted, based on the slide
    * arrangement before the move takes place. Must be between zero and the
    * number of slides in the presentation, inclusive.
    */
  var insertionIndex: js.UndefOr[Double] = js.native
  /**
    * The IDs of the slides in the presentation that should be moved. The
    * slides in this list must be in existing presentation order, without
    * duplicates.
    */
  var slideObjectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUpdateSlidesPositionRequest {
  @scala.inline
  def apply(insertionIndex: js.UndefOr[Double] = js.undefined, slideObjectIds: js.Array[String] = null): SchemaUpdateSlidesPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertionIndex)) __obj.updateDynamic("insertionIndex")(insertionIndex.get.asInstanceOf[js.Any])
    if (slideObjectIds != null) __obj.updateDynamic("slideObjectIds")(slideObjectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateSlidesPositionRequest]
  }
}

