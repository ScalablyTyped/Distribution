package typings.ionic.definitionsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectConfig extends ProjectFile {
  val hooks: js.UndefOr[Record[HookName, js.UndefOr[String | js.Array[String]]]] = js.undefined
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
    hooks: Record[HookName, js.UndefOr[String | js.Array[String]]] = null,
    id: String = null,
    root: String = null,
    `type`: ProjectType = null
  ): IProjectConfig = {
    val __obj = js.Dynamic.literal(integrations = integrations, name = name)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (id != null) __obj.updateDynamic("id")(id)
    if (root != null) __obj.updateDynamic("root")(root)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IProjectConfig]
  }
}

