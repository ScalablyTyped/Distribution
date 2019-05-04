package typings
package atJupyterlabCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Jupyterlabsettingiconclass
  extends /**
  * Arbitrary setting keys can be added.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema] {
  /**
    * The JupyterLab icon class hint for a plugin can be overridden by user
    * settings. It can also be root level and therefore "private".
    */
  var `jupyter.lab.setting-icon-class`: js.UndefOr[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema] = js.undefined
  /**
    * The JupyterLab icon label hint for a plugin can be overridden by user
    * settings. It can also be root level and therefore "private".
    */
  var `jupyter.lab.setting-icon-label`: js.UndefOr[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema] = js.undefined
}

object Anon_Jupyterlabsettingiconclass {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Arbitrary setting keys can be added.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema] = null,
    `jupyter.lab.setting-icon-class`: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema = null,
    `jupyter.lab.setting-icon-label`: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema = null
  ): Anon_Jupyterlabsettingiconclass = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`jupyter.lab.setting-icon-class` != null) __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyter.lab.setting-icon-class`)
    if (`jupyter.lab.setting-icon-label` != null) __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyter.lab.setting-icon-label`)
    __obj.asInstanceOf[Anon_Jupyterlabsettingiconclass]
  }
}

