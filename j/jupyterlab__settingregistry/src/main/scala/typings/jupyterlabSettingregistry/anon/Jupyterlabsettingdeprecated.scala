package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jupyterlabsettingdeprecated extends js.Object {
  @JSName("jupyter.lab.setting-deprecated")
  var `jupyterDotlabDotsetting-deprecated`: Default
  @JSName("jupyter.lab.setting-icon")
  var `jupyterDotlabDotsetting-icon`: Type
  @JSName("jupyter.lab.setting-icon-class")
  var `jupyterDotlabDotsetting-icon-class`: Type
  @JSName("jupyter.lab.setting-icon-label")
  var `jupyterDotlabDotsetting-icon-label`: Type
  @JSName("jupyter.lab.shortcuts")
  var jupyterDotlabDotshortcuts: Items
  @JSName("jupyter.lab.transform")
  var jupyterDotlabDottransform: Default
}

object Jupyterlabsettingdeprecated {
  @scala.inline
  def apply(
    `jupyterDotlabDotsetting-deprecated`: Default,
    `jupyterDotlabDotsetting-icon`: Type,
    `jupyterDotlabDotsetting-icon-class`: Type,
    `jupyterDotlabDotsetting-icon-label`: Type,
    jupyterDotlabDotshortcuts: Items,
    jupyterDotlabDottransform: Default
  ): Jupyterlabsettingdeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jupyter.lab.setting-deprecated")(`jupyterDotlabDotsetting-deprecated`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.setting-icon")(`jupyterDotlabDotsetting-icon`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyterDotlabDotsetting-icon-class`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyterDotlabDotsetting-icon-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.shortcuts")(jupyterDotlabDotshortcuts.asInstanceOf[js.Any])
    __obj.updateDynamic("jupyter.lab.transform")(jupyterDotlabDottransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jupyterlabsettingdeprecated]
  }
}

