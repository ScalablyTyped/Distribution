package typings.jupyterlabSettingregistry.anon

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ phase in @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Transform} */
@js.native
trait phaseinPhaseTransform extends js.Object {
  
  var compose: js.UndefOr[Transform] = js.native
  
  var fetch: js.UndefOr[Transform] = js.native
}
object phaseinPhaseTransform {
  
  @scala.inline
  def apply(): phaseinPhaseTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[phaseinPhaseTransform]
  }
  
  @scala.inline
  implicit class phaseinPhaseTransformOps[Self <: phaseinPhaseTransform] (val x: Self) extends AnyVal {
    
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
    def setCompose(value: /* plugin */ IPlugin => IPlugin): Self = this.set("compose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompose: Self = this.set("compose", js.undefined)
    
    @scala.inline
    def setFetch(value: /* plugin */ IPlugin => IPlugin): Self = this.set("fetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
  }
}
