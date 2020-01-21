package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains multiple sensitive information findings for each resource slice.
  */
@js.native
trait SchemaDetail extends js.Object {
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.native
}

object SchemaDetail {
  @scala.inline
  def apply(findings: js.Array[SchemaFinding] = null): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDetail]
  }
}

