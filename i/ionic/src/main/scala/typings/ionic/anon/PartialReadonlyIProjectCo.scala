package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectIntegrations
import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.IProjectConfig>> */
trait PartialReadonlyIProjectCo extends js.Object {
  var hooks: js.UndefOr[RecordHookNamestringArray] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var integrations: js.UndefOr[ProjectIntegrations] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ProjectType] = js.undefined
}

object PartialReadonlyIProjectCo {
  @scala.inline
  def apply(
    hooks: RecordHookNamestringArray = null,
    id: String = null,
    integrations: ProjectIntegrations = null,
    name: String = null,
    root: String = null,
    `type`: ProjectType = null
  ): PartialReadonlyIProjectCo = {
    val __obj = js.Dynamic.literal()
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReadonlyIProjectCo]
  }
}

