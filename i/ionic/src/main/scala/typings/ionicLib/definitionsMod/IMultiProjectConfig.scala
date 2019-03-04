package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiProjectConfig extends ProjectFile {
  var defaultProject: js.UndefOr[java.lang.String] = js.undefined
  var projects: org.scalablytyped.runtime.StringDictionary[js.UndefOr[IProjectConfig]]
}

object IMultiProjectConfig {
  @scala.inline
  def apply(
    projects: org.scalablytyped.runtime.StringDictionary[js.UndefOr[IProjectConfig]],
    defaultProject: java.lang.String = null
  ): IMultiProjectConfig = {
    val __obj = js.Dynamic.literal(projects = projects)
    if (defaultProject != null) __obj.updateDynamic("defaultProject")(defaultProject)
    __obj.asInstanceOf[IMultiProjectConfig]
  }
}

