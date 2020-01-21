package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event Tag List Response
  */
@js.native
trait SchemaEventTagsListResponse extends js.Object {
  /**
    * Event tag collection.
    */
  var eventTags: js.UndefOr[js.Array[SchemaEventTag]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#eventTagsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEventTagsListResponse {
  @scala.inline
  def apply(eventTags: js.Array[SchemaEventTag] = null, kind: String = null): SchemaEventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTags != null) __obj.updateDynamic("eventTags")(eventTags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventTagsListResponse]
  }
}

