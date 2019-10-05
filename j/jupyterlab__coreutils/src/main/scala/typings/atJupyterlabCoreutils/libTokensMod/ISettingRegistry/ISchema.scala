package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schema type that is a minimal subset of the formal JSON Schema along with
  * optional JupyterLab rendering hints.
  */
trait ISchema extends IProperty {
  /**
    * Whether the schema is deprecated.
    *
    * #### Notes
    * This flag can be used by functionality that loads this plugin's settings
    * from the registry. For example, the setting editor does not display a
    * plugin's settings if it is set to `true`.
    */
  var `jupyter.lab.setting-deprecated`: js.UndefOr[Boolean] = js.undefined
  /**
    * The JupyterLab icon class hint.
    */
  var `jupyter.lab.setting-icon-class`: js.UndefOr[String] = js.undefined
  /**
    * The JupyterLab icon label hint.
    */
  var `jupyter.lab.setting-icon-label`: js.UndefOr[String] = js.undefined
  /**
    * The JupyterLab shortcuts that are creaed by a plugin's schema.
    */
  var `jupyter.lab.shortcuts`: js.UndefOr[js.Array[IShortcut]] = js.undefined
  /**
    * A flag that indicates plugin should be transformed before being used by
    * the setting registry.
    *
    * #### Notes
    * If this value is set to `true`, the setting registry will wait until a
    * transformation has been registered (by calling the `transform()` method
    * of the registry) for the plugin ID before resolving `load()` promises.
    * This means that if the attribute is set to `true` but no transformation
    * is registered in time, calls to `load()` a plugin will eventually time
    * out and reject.
    */
  var `jupyter.lab.transform`: js.UndefOr[Boolean] = js.undefined
  /**
    * The root schema is always an object.
    */
  @JSName("type")
  var type_ISchema: `object`
}

object ISchema {
  @scala.inline
  def apply(
    `type`: `object`,
    default: js.Any = null,
    description: String = null,
    `jupyter.lab.setting-deprecated`: js.UndefOr[Boolean] = js.undefined,
    `jupyter.lab.setting-icon-class`: String = null,
    `jupyter.lab.setting-icon-label`: String = null,
    `jupyter.lab.shortcuts`: js.Array[IShortcut] = null,
    `jupyter.lab.transform`: js.UndefOr[Boolean] = js.undefined,
    properties: StringDictionary[IProperty] = null,
    title: String = null
  ): ISchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(`jupyter.lab.setting-deprecated`)) __obj.updateDynamic("jupyter.lab.setting-deprecated")(`jupyter.lab.setting-deprecated`)
    if (`jupyter.lab.setting-icon-class` != null) __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyter.lab.setting-icon-class`)
    if (`jupyter.lab.setting-icon-label` != null) __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyter.lab.setting-icon-label`)
    if (`jupyter.lab.shortcuts` != null) __obj.updateDynamic("jupyter.lab.shortcuts")(`jupyter.lab.shortcuts`)
    if (!js.isUndefined(`jupyter.lab.transform`)) __obj.updateDynamic("jupyter.lab.transform")(`jupyter.lab.transform`)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ISchema]
  }
}

