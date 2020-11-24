package typings.jupyterlabSettingregistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jupyterlabsettingdeprecated extends js.Object {
  
  @JSName("jupyter.lab.setting-deprecated")
  var `jupyterDotlabDotsetting-deprecated`: Default = js.native
  
  @JSName("jupyter.lab.setting-icon")
  var `jupyterDotlabDotsetting-icon`: Type = js.native
  
  @JSName("jupyter.lab.setting-icon-class")
  var `jupyterDotlabDotsetting-icon-class`: Type = js.native
  
  @JSName("jupyter.lab.setting-icon-label")
  var `jupyterDotlabDotsetting-icon-label`: Type = js.native
  
  @JSName("jupyter.lab.shortcuts")
  var jupyterDotlabDotshortcuts: Items = js.native
  
  @JSName("jupyter.lab.transform")
  var jupyterDotlabDottransform: Default = js.native
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
  
  @scala.inline
  implicit class JupyterlabsettingdeprecatedOps[Self <: Jupyterlabsettingdeprecated] (val x: Self) extends AnyVal {
    
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
    def `setJupyterDotlabDotsetting-deprecated`(value: Default): Self = this.set("jupyter.lab.setting-deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJupyterDotlabDotsetting-icon`(value: Type): Self = this.set("jupyter.lab.setting-icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJupyterDotlabDotsetting-icon-class`(value: Type): Self = this.set("jupyter.lab.setting-icon-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJupyterDotlabDotsetting-icon-label`(value: Type): Self = this.set("jupyter.lab.setting-icon-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJupyterDotlabDotshortcuts(value: Items): Self = this.set("jupyter.lab.shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJupyterDotlabDottransform(value: Default): Self = this.set("jupyter.lab.transform", value.asInstanceOf[js.Any])
  }
}
