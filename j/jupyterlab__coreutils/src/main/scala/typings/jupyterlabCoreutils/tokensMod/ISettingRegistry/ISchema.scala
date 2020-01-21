package typings.jupyterlabCoreutils.tokensMod.ISettingRegistry

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object`
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
  @JSName("jupyter.lab.setting-deprecated")
  var `jupyterDotlabDotsetting-deprecated`: js.UndefOr[Boolean] = js.undefined
  /**
    * The JupyterLab icon class hint.
    */
  @JSName("jupyter.lab.setting-icon-class")
  var `jupyterDotlabDotsetting-icon-class`: js.UndefOr[String] = js.undefined
  /**
    * The JupyterLab icon label hint.
    */
  @JSName("jupyter.lab.setting-icon-label")
  var `jupyterDotlabDotsetting-icon-label`: js.UndefOr[String] = js.undefined
  /**
    * The JupyterLab shortcuts that are creaed by a plugin's schema.
    */
  @JSName("jupyter.lab.shortcuts")
  var jupyterDotlabDotshortcuts: js.UndefOr[js.Array[IShortcut]] = js.undefined
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
  @JSName("jupyter.lab.transform")
  var jupyterDotlabDottransform: js.UndefOr[Boolean] = js.undefined
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
    `jupyterDotlabDotsetting-deprecated`: js.UndefOr[Boolean] = js.undefined,
    `jupyterDotlabDotsetting-icon-class`: String = null,
    `jupyterDotlabDotsetting-icon-label`: String = null,
    jupyterDotlabDotshortcuts: js.Array[IShortcut] = null,
    jupyterDotlabDottransform: js.UndefOr[Boolean] = js.undefined,
    properties: StringDictionary[IProperty] = null,
    title: String = null
  ): ISchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(`jupyterDotlabDotsetting-deprecated`)) __obj.updateDynamic("jupyter.lab.setting-deprecated")(`jupyterDotlabDotsetting-deprecated`.asInstanceOf[js.Any])
    if (`jupyterDotlabDotsetting-icon-class` != null) __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyterDotlabDotsetting-icon-class`.asInstanceOf[js.Any])
    if (`jupyterDotlabDotsetting-icon-label` != null) __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyterDotlabDotsetting-icon-label`.asInstanceOf[js.Any])
    if (jupyterDotlabDotshortcuts != null) __obj.updateDynamic("jupyter.lab.shortcuts")(jupyterDotlabDotshortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(jupyterDotlabDottransform)) __obj.updateDynamic("jupyter.lab.transform")(jupyterDotlabDottransform.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
}

