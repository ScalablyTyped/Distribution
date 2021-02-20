package typings.jupyterlabSettingregistry

import typings.jupyterlabSettingregistry.anon.Jupyterlabsettingdeprecated
import typings.jupyterlabSettingregistry.anon.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginSchemaMod {
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "additionalProperties")
  @js.native
  def additionalProperties: Boolean = js.native
  @scala.inline
  def additionalProperties_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "definitions")
  @js.native
  def definitions: Shortcut = js.native
  @scala.inline
  def definitions_=(x: Shortcut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "description")
  @js.native
  def description: String = js.native
  @scala.inline
  def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "properties")
  @js.native
  def properties: Jupyterlabsettingdeprecated = js.native
  @scala.inline
  def properties_=(x: Jupyterlabsettingdeprecated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "$schema")
  @js.native
  def schema: String = js.native
  
  @scala.inline
  def schema_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$schema")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "title")
  @js.native
  def title: String = js.native
  @scala.inline
  def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("@jupyterlab/settingregistry/lib/plugin-schema", "type")
  @js.native
  val `type`: String = js.native
}
