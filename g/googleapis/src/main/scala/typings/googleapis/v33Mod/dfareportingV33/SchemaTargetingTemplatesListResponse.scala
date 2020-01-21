package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targeting Template List Response
  */
@js.native
trait SchemaTargetingTemplatesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplatesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Targeting template collection.
    */
  var targetingTemplates: js.UndefOr[js.Array[SchemaTargetingTemplate]] = js.native
}

object SchemaTargetingTemplatesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    targetingTemplates: js.Array[SchemaTargetingTemplate] = null
  ): SchemaTargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (targetingTemplates != null) __obj.updateDynamic("targetingTemplates")(targetingTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingTemplatesListResponse]
  }
}

