package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResultsGetRequest extends js.Object {
  var resultMask: js.UndefOr[SchemaResultsMask] = js.native
}

object SchemaResultsGetRequest {
  @scala.inline
  def apply(resultMask: SchemaResultsMask = null): SchemaResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    if (resultMask != null) __obj.updateDynamic("resultMask")(resultMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultsGetRequest]
  }
}

