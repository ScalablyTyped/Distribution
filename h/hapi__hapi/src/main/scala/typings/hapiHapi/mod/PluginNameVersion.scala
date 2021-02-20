package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginNameVersion extends StObject {
  
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
  implicit class PluginNameVersionMutableBuilder[Self <: PluginNameVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
