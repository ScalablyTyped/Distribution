package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectConfig extends ProjectFile {
  val hooks: js.UndefOr[
    stdLib.Record[HookName, js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  val integrations: ProjectIntegrations
  var name: java.lang.String
  var root: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[ProjectType] = js.undefined
}

object IProjectConfig {
  @scala.inline
  def apply(
    integrations: ProjectIntegrations,
    name: java.lang.String,
    hooks: stdLib.Record[HookName, js.UndefOr[java.lang.String | js.Array[java.lang.String]]] = null,
    id: java.lang.String = null,
    root: java.lang.String = null,
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

