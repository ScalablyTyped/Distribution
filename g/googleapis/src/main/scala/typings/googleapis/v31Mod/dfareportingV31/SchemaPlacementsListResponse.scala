package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement List Response
  */
@js.native
trait SchemaPlacementsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Placement collection.
    */
  var placements: js.UndefOr[js.Array[SchemaPlacement]] = js.native
}

object SchemaPlacementsListResponse {
  @scala.inline
  def apply(): SchemaPlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementsListResponse]
  }
  @scala.inline
  implicit class SchemaPlacementsListResponseOps[Self <: SchemaPlacementsListResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPlacementsVarargs(value: SchemaPlacement*): Self = this.set("placements", js.Array(value :_*))
    @scala.inline
    def setPlacements(value: js.Array[SchemaPlacement]): Self = this.set("placements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacements: Self = this.set("placements", js.undefined)
  }
  
}

