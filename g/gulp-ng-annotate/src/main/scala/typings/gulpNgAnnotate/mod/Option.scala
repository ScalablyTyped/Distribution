package typings.gulpNgAnnotate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//TODO: Should be on ng-annotate module
@js.native
trait Option extends js.Object {
  
  /**
    * Add annotations where non-existing
    */
  var add: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable optional matcher
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * List optional matchers
    */
  var list: js.UndefOr[Boolean] = js.native
  
  /**
    * Load a user plugin with the provided path
    */
  var plugin: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Restrict matching further or to expand matching
    */
  var regexp: js.UndefOr[String] = js.native
  
  /**
    * Remove all existing annotations
    */
  var remove: js.UndefOr[Boolean] = js.native
  
  /**
    * Rename providers (services, factories, controllers, etc.) with a new name when declared and referenced through annotation
    */
  var rename: js.UndefOr[js.Array[RenameOption]] = js.native
  
  /**
    * Output '$scope' instead of "$scope".
    */
  var single_quotes: js.UndefOr[Boolean] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setList(value: Boolean): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setPluginVarargs(value: js.Any*): Self = this.set("plugin", js.Array(value :_*))
    
    @scala.inline
    def setPlugin(value: js.Array[_]): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setRegexp(value: String): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRenameVarargs(value: RenameOption*): Self = this.set("rename", js.Array(value :_*))
    
    @scala.inline
    def setRename(value: js.Array[RenameOption]): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setSingle_quotes(value: Boolean): Self = this.set("single_quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingle_quotes: Self = this.set("single_quotes", js.undefined)
  }
}
