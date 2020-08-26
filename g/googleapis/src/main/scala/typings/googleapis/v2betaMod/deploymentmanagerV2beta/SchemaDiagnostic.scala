package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiagnostic extends js.Object {
  /**
    * JsonPath expression on the resource that if non empty, indicates that
    * this field needs to be extracted as a diagnostic.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Level to record this diagnostic.
    */
  var level: js.UndefOr[String] = js.native
}

object SchemaDiagnostic {
  @scala.inline
  def apply(): SchemaDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnostic]
  }
  @scala.inline
  implicit class SchemaDiagnosticOps[Self <: SchemaDiagnostic] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

