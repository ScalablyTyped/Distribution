package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This submessage provides human-readable hints about the purpose of the
  * authority. Because the name of a note acts as its resource reference, it is
  * important to disambiguate the canonical name of the Note (which might be a
  * UUID for security purposes) from &quot;readable&quot; names more suitable
  * for debug output. Note that these hints should not be used to look up
  * authorities in security sensitive contexts, such as when looking up
  * attestations to verify.
  */
@js.native
trait SchemaHint extends js.Object {
  /**
    * Required. The human readable name of this attestation authority, for
    * example &quot;qa&quot;.
    */
  var humanReadableName: js.UndefOr[String] = js.native
}

object SchemaHint {
  @scala.inline
  def apply(humanReadableName: String = null): SchemaHint = {
    val __obj = js.Dynamic.literal()
    if (humanReadableName != null) __obj.updateDynamic("humanReadableName")(humanReadableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHint]
  }
}

