package typings.jupyterlabSettingregistry.anon

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ phase in @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Transform} */
trait phaseinPhaseTransform extends js.Object {
  var compose: js.UndefOr[Transform] = js.undefined
  var fetch: js.UndefOr[Transform] = js.undefined
}

object phaseinPhaseTransform {
  @scala.inline
  def apply(compose: /* plugin */ IPlugin => IPlugin = null, fetch: /* plugin */ IPlugin => IPlugin = null): phaseinPhaseTransform = {
    val __obj = js.Dynamic.literal()
    if (compose != null) __obj.updateDynamic("compose")(js.Any.fromFunction1(compose))
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[phaseinPhaseTransform]
  }
}

