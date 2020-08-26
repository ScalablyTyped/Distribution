package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginNameVersion extends js.Object {
  /**
    * (required) the plugin name string. The name is used as a unique key. Published plugins (e.g. published in the npm
    * registry) should use the same name as the name field in their 'package.json' file. Names must be
    * unique within each application.
    */
  var name: String = js.native
  /**
    * optional plugin version. The version is only used informatively to enable other plugins to find out the versions loaded. The version should be the same as the one specified in the plugin's
    * 'package.json' file.
    */
  var version: js.UndefOr[String] = js.native
}

object PluginNameVersion {
  @scala.inline
  def apply(name: String): PluginNameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginNameVersion]
  }
  @scala.inline
  implicit class PluginNameVersionOps[Self <: PluginNameVersion] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

