package typings.gulpLoadPlugins.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  /** if true, transforms hyphenated plugin names to camel case, default true */
  var camelize: js.UndefOr[Boolean] = js.native
  
  /** where to find the plugins, searched up from process.cwd(), default 'package.json' */
  var config: js.UndefOr[String] = js.native
  
  /** whether the plugins should be lazy loaded on demand, default true */
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /** the glob(s) to search for, default ['gulp-*', 'gulp.*'] */
  var pattern: js.UndefOr[js.Array[String]] = js.native
  
  /** a mapping of plugins to rename, the key being the NPM name of the package, and the value being an alias you define */
  var rename: js.UndefOr[IPluginNameMappings] = js.native
  
  /** what to remove from the name of the module when adding it to the context, default /^gulp(-|\.)/ */
  var replaceString: js.UndefOr[RegExp] = js.native
  
  /** which keys in the config to look within, default ['dependencies', 'devDependencies', 'peerDependencies'] */
  var scope: js.UndefOr[js.Array[String]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setCamelize(value: Boolean): Self = this.set("camelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamelize: Self = this.set("camelize", js.undefined)
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = this.set("pattern", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setRename(value: IPluginNameMappings): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setReplaceString(value: RegExp): Self = this.set("replaceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceString: Self = this.set("replaceString", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
