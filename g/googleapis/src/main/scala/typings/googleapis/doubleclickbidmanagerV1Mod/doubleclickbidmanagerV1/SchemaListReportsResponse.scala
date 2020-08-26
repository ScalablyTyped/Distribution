package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List reports response.
  */
@js.native
trait SchemaListReportsResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listReportsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Retrieved reports.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.native
}

object SchemaListReportsResponse {
  @scala.inline
  def apply(): SchemaListReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportsResponse]
  }
  @scala.inline
  implicit class SchemaListReportsResponseOps[Self <: SchemaListReportsResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setReportsVarargs(value: SchemaReport*): Self = this.set("reports", js.Array(value :_*))
    @scala.inline
    def setReports(value: js.Array[SchemaReport]): Self = this.set("reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
  }
  
}

