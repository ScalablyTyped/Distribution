package typings.liftoff.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiftoffEnv extends js.Object {
  
  /**
    * the base directory of your configuration file (if found)
    */
  var configBase: js.UndefOr[String] = js.native
  
  /**
    * an object of filepaths for each found config file (filepath values will be null if not found)
    */
  var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | Null]]] = js.native
  
  /**
    * the config files searched for
    */
  var configNameSearch: js.Array[String] = js.native
  
  /**
    * the full path to your configuration file (if found)
    */
  var configPath: js.UndefOr[String] = js.native
  
  /**
    * the current working directory
    */
  var cwd: String = js.native
  
  /**
    * the contents of the local module's package.json (if found)
    */
  var modulePackage: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * the full path to the local module your project relies on (if found)
    */
  var modulePath: js.UndefOr[String] = js.native
  
  /**
    * an array of modules that liftoff tried to pre-load
    */
  var require: js.Array[String] = js.native
}
object LiftoffEnv {
  
  @scala.inline
  def apply(configNameSearch: js.Array[String], cwd: String, require: js.Array[String]): LiftoffEnv = {
    val __obj = js.Dynamic.literal(configNameSearch = configNameSearch.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftoffEnv]
  }
  
  @scala.inline
  implicit class LiftoffEnvOps[Self <: LiftoffEnv] (val x: Self) extends AnyVal {
    
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
    def setConfigNameSearchVarargs(value: String*): Self = this.set("configNameSearch", js.Array(value :_*))
    
    @scala.inline
    def setConfigNameSearch(value: js.Array[String]): Self = this.set("configNameSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireVarargs(value: String*): Self = this.set("require", js.Array(value :_*))
    
    @scala.inline
    def setRequire(value: js.Array[String]): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigBase(value: String): Self = this.set("configBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigBase: Self = this.set("configBase", js.undefined)
    
    @scala.inline
    def setConfigFiles(value: StringDictionary[StringDictionary[String | Null]]): Self = this.set("configFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFiles: Self = this.set("configFiles", js.undefined)
    
    @scala.inline
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    
    @scala.inline
    def setModulePackage(value: StringDictionary[js.Any]): Self = this.set("modulePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulePackage: Self = this.set("modulePackage", js.undefined)
    
    @scala.inline
    def setModulePath(value: String): Self = this.set("modulePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulePath: Self = this.set("modulePath", js.undefined)
  }
}
