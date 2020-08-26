package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectIntegrations
import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.IProjectConfig>> */
@js.native
trait PartialReadonlyIProjectCo extends js.Object {
  var hooks: js.UndefOr[RecordHookNamestringArray] = js.native
  var id: js.UndefOr[String] = js.native
  var integrations: js.UndefOr[ProjectIntegrations] = js.native
  var name: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[ProjectType] = js.native
}

object PartialReadonlyIProjectCo {
  @scala.inline
  def apply(): PartialReadonlyIProjectCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyIProjectCo]
  }
  @scala.inline
  implicit class PartialReadonlyIProjectCoOps[Self <: PartialReadonlyIProjectCo] (val x: Self) extends AnyVal {
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
    def setHooks(value: RecordHookNamestringArray): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIntegrations(value: ProjectIntegrations): Self = this.set("integrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setType(value: ProjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

