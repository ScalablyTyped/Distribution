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
  def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  @scala.inline
  implicit class SchemaDetailOps[Self <: SchemaDetail] (val x: Self) extends AnyVal {
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
    def setFindingsVarargs(value: SchemaFinding*): Self = this.set("findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: js.Array[SchemaFinding]): Self = this.set("findings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
  }
  
}

