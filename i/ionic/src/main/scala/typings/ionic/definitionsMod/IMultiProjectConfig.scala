package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiProjectConfig extends ProjectFile {
  var defaultProject: js.UndefOr[String] = js.undefined
  var projects: StringDictionary[js.UndefOr[IProjectConfig]]
}

object IMultiProjectConfig {
  @scala.inline
  def apply(projects: StringDictionary[js.UndefOr[IProjectConfig]], defaultProject: String = null): IMultiProjectConfig = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    if (defaultProject != null) __obj.updateDynamic("defaultProject")(defaultProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiProjectConfig]
  }
}

