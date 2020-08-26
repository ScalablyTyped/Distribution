package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schema type that is a minimal subset of the formal JSON Schema along with
  * optional JupyterLab rendering hints.
  */
@js.native
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
  var `jupyterDotlabDotsetting-deprecated`: js.UndefOr[Boolean] = js.native
  /**
    * The JupyterLab icon hint.
    */
  @JSName("jupyter.lab.setting-icon")
  var `jupyterDotlabDotsetting-icon`: js.UndefOr[String] = js.native
  /**
    * The JupyterLab icon class hint.
    */
  @JSName("jupyter.lab.setting-icon-class")
  var `jupyterDotlabDotsetting-icon-class`: js.UndefOr[String] = js.native
  /**
    * The JupyterLab icon label hint.
    */
  @JSName("jupyter.lab.setting-icon-label")
  var `jupyterDotlabDotsetting-icon-label`: js.UndefOr[String] = js.native
  /**
    * The JupyterLab shortcuts that are created by a plugin's schema.
    */
  @JSName("jupyter.lab.shortcuts")
  var jupyterDotlabDotshortcuts: js.UndefOr[js.Array[IShortcut]] = js.native
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
  var jupyterDotlabDottransform: js.UndefOr[Boolean] = js.native
  /**
    * The root schema is always an object.
    */
  @JSName("type")
  var type_ISchema: `object` = js.native
}

object ISchema {
  @scala.inline
  def apply(`type`: `object`): ISchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
  @scala.inline
  implicit class ISchemaOps[Self <: ISchema] (val x: Self) extends AnyVal {
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
    def setType(value: `object`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def `setJupyterDotlabDotsetting-deprecated`(value: Boolean): Self = this.set("jupyter.lab.setting-deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJupyterDotlabDotsetting-deprecated`: Self = this.set("jupyter.lab.setting-deprecated", js.undefined)
    @scala.inline
    def `setJupyterDotlabDotsetting-icon`(value: String): Self = this.set("jupyter.lab.setting-icon", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJupyterDotlabDotsetting-icon`: Self = this.set("jupyter.lab.setting-icon", js.undefined)
    @scala.inline
    def `setJupyterDotlabDotsetting-icon-class`(value: String): Self = this.set("jupyter.lab.setting-icon-class", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJupyterDotlabDotsetting-icon-class`: Self = this.set("jupyter.lab.setting-icon-class", js.undefined)
    @scala.inline
    def `setJupyterDotlabDotsetting-icon-label`(value: String): Self = this.set("jupyter.lab.setting-icon-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJupyterDotlabDotsetting-icon-label`: Self = this.set("jupyter.lab.setting-icon-label", js.undefined)
    @scala.inline
    def setJupyterDotlabDotshortcutsVarargs(value: IShortcut*): Self = this.set("jupyter.lab.shortcuts", js.Array(value :_*))
    @scala.inline
    def setJupyterDotlabDotshortcuts(value: js.Array[IShortcut]): Self = this.set("jupyter.lab.shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJupyterDotlabDotshortcuts: Self = this.set("jupyter.lab.shortcuts", js.undefined)
    @scala.inline
    def setJupyterDotlabDottransform(value: Boolean): Self = this.set("jupyter.lab.transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJupyterDotlabDottransform: Self = this.set("jupyter.lab.transform", js.undefined)
  }
  
}

