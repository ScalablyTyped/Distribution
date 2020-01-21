package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity List Response
  */
@js.native
trait SchemaFloodlightActivitiesListResponse extends js.Object {
  /**
    * Floodlight activity collection.
    */
  var floodlightActivities: js.UndefOr[js.Array[SchemaFloodlightActivity]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaFloodlightActivitiesListResponse {
  @scala.inline
  def apply(
    floodlightActivities: js.Array[SchemaFloodlightActivity] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaFloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivities != null) __obj.updateDynamic("floodlightActivities")(floodlightActivities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloodlightActivitiesListResponse]
  }
}

