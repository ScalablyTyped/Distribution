package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement GenerateTags Response
  */
@js.native
trait SchemaPlacementsGenerateTagsResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementsGenerateTagsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Set of generated tags for the specified placements.
    */
  var placementTags: js.UndefOr[js.Array[SchemaPlacementTag]] = js.native
}

object SchemaPlacementsGenerateTagsResponse {
  @scala.inline
  def apply(kind: String = null, placementTags: js.Array[SchemaPlacementTag] = null): SchemaPlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (placementTags != null) __obj.updateDynamic("placementTags")(placementTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlacementsGenerateTagsResponse]
  }
}

