package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource definition for Gmail filters. Filters apply to specific messages
  * instead of an entire email thread.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * Action that the filter performs.
    */
  var action: js.UndefOr[SchemaFilterAction] = js.native
  /**
    * Matching criteria for the filter.
    */
  var criteria: js.UndefOr[SchemaFilterCriteria] = js.native
  /**
    * The server assigned ID of the filter.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(action: SchemaFilterAction = null, criteria: SchemaFilterCriteria = null, id: String = null): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilter]
  }
}

