package typings.ionic.definitionsMod

import typings.ionic.RecordHookNamestringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectConfig extends ProjectFile {
  val hooks: js.UndefOr[RecordHookNamestringArray] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  val integrations: ProjectIntegrations
  var name: String
  var root: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ProjectType] = js.undefined
}

object IProjectConfig {
  @scala.inline
  def apply(
    integrations: ProjectIntegrations,
    name: String,
    hooks: RecordHookNamestringArray = null,
    id: String = null,
    root: String = null,
    `type`: ProjectType = null
  ): IProjectConfig = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectConfig]
  }
}

