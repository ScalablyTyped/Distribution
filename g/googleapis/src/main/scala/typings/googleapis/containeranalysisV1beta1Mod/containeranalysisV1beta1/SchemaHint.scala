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
  def apply(): SchemaHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHint]
  }
  @scala.inline
  implicit class SchemaHintOps[Self <: SchemaHint] (val x: Self) extends AnyVal {
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
    def setHumanReadableName(value: String): Self = this.set("humanReadableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanReadableName: Self = this.set("humanReadableName", js.undefined)
  }
  
}

