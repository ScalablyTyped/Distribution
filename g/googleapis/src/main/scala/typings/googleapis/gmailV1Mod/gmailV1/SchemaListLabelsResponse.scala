package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListLabelsResponse extends js.Object {
  /**
    * List of labels.
    */
  var labels: js.UndefOr[js.Array[SchemaLabel]] = js.native
}

object SchemaListLabelsResponse {
  @scala.inline
  def apply(labels: js.Array[SchemaLabel] = null): SchemaListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLabelsResponse]
  }
}

