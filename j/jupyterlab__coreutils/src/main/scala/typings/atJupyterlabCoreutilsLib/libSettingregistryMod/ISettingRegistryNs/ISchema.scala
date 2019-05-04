package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schema type that is a minimal subset of the formal JSON Schema along with
  * optional JupyterLab rendering hints.
  */
trait ISchema
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * The default value, if any.
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * The schema description.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The JupyterLab icon class hint for a plugin can be overridden by user
    * settings. It can also be root level and therefore "private".
    */
  var `jupyter.lab.setting-icon-class`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The JupyterLab icon label hint for a plugin can be overridden by user
    * settings. It can also be root level and therefore "private".
    */
  var `jupyter.lab.setting-icon-label`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The schema's child properties.
    */
  var properties: js.UndefOr[atJupyterlabCoreutilsLib.Anon_Jupyterlabsettingiconclass] = js.undefined
  /**
    * The title of the schema.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type or types of the data.
    */
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ISchema {
  @scala.inline
  def apply(
    default: js.Any = null,
    description: java.lang.String = null,
    `jupyter.lab.setting-icon-class`: java.lang.String = null,
    `jupyter.lab.setting-icon-label`: java.lang.String = null,
    properties: atJupyterlabCoreutilsLib.Anon_Jupyterlabsettingiconclass = null,
    title: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null
  ): ISchema = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`jupyter.lab.setting-icon-class` != null) __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyter.lab.setting-icon-class`)
    if (`jupyter.lab.setting-icon-label` != null) __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyter.lab.setting-icon-label`)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
}

