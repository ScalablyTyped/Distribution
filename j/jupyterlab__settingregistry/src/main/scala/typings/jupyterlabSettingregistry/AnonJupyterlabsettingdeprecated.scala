package typings.jupyterlabSettingregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJupyterlabsettingdeprecated extends js.Object {
  @JSName("jupyter.lab.setting-deprecated")
  var `jupyterDotlabDotsetting-deprecated`: AnonDefault
  @JSName("jupyter.lab.setting-icon")
  var `jupyterDotlabDotsetting-icon`: AnonType
  @JSName("jupyter.lab.setting-icon-class")
  var `jupyterDotlabDotsetting-icon-class`: AnonType
  @JSName("jupyter.lab.setting-icon-label")
  var `jupyterDotlabDotsetting-icon-label`: AnonType
  @JSName("jupyter.lab.shortcuts")
  var jupyterDotlabDotshortcuts: AnonItems
  @JSName("jupyter.lab.transform")
  var jupyterDotlabDottransform: AnonDefault
}

object AnonJupyterlabsettingdeprecated {
  @scala.inline
  def apply(
    `jupyterDotlabDotsetting-deprecated`: AnonDefault,
    `jupyterDotlabDotsetting-icon`: AnonType,
    `jupyterDotlabDotsetting-icon-class`: AnonType,
    `jupyterDotlabDotsetting-icon-label`: AnonType,
    jupyterDotlabDotshortcuts: AnonItems,
    jupyterDotlabDottransform: AnonDefault
  ): AnonJupyterlabsettingdeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jupyter.lab.setting-deprecated")(`jupyterDotlabDotsetting-deprecated`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.setting-icon")(`jupyterDotlabDotsetting-icon`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyterDotlabDotsetting-icon-class`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyterDotlabDotsetting-icon-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.shortcuts")(jupyterDotlabDotshortcuts.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.transform")(jupyterDotlabDottransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJupyterlabsettingdeprecated]
  }
}

