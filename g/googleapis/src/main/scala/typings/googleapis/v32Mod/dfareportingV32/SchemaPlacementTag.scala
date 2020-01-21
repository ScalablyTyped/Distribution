package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag
  */
@js.native
trait SchemaPlacementTag extends js.Object {
  /**
    * Placement ID
    */
  var placementId: js.UndefOr[String] = js.native
  /**
    * Tags generated for this placement.
    */
  var tagDatas: js.UndefOr[js.Array[SchemaTagData]] = js.native
}

object SchemaPlacementTag {
  @scala.inline
  def apply(placementId: String = null, tagDatas: js.Array[SchemaTagData] = null): SchemaPlacementTag = {
    val __obj = js.Dynamic.literal()
    if (placementId != null) __obj.updateDynamic("placementId")(placementId.asInstanceOf[js.Any])
    if (tagDatas != null) __obj.updateDynamic("tagDatas")(tagDatas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlacementTag]
  }
}

