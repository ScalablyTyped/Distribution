package typings.googleapis.v33Mod.dfareportingV33

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
  def apply(): SchemaPlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementsGenerateTagsResponse]
  }
  @scala.inline
  implicit class SchemaPlacementsGenerateTagsResponseOps[Self <: SchemaPlacementsGenerateTagsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPlacementTagsVarargs(value: SchemaPlacementTag*): Self = this.set("placementTags", js.Array(value :_*))
    @scala.inline
    def setPlacementTags(value: js.Array[SchemaPlacementTag]): Self = this.set("placementTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTags: Self = this.set("placementTags", js.undefined)
  }
  
}

