package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.RecordHookNamestringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.IProjectConfig
  - typings.ionic.definitionsMod.IMultiProjectConfig
*/
trait ProjectFile extends js.Object

object ProjectFile {
  @scala.inline
  def IProjectConfig(
    integrations: ProjectIntegrations,
    name: String,
    hooks: RecordHookNamestringArray = null,
    id: String = null,
    root: String = null,
    `type`: ProjectType = null
  ): ProjectFile = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectFile]
  }
  @scala.inline
  def IMultiProjectConfig(projects: StringDictionary[js.UndefOr[IProjectConfig]], defaultProject: String = null): ProjectFile = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    if (defaultProject != null) __obj.updateDynamic("defaultProject")(defaultProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectFile]
  }
}

