package typings.gulpCoffeeify.mod

import typings.gulpCoffeeify.anon.Base
import typings.gulpCoffeeify.anon.Debug
import typings.gulpCoffeeify.anon.Ext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  /**
    * [DEPRECATED]: You should use a 'paths' options of browserify.
    */
  var aliases: js.UndefOr[Aliases] = js.native
  
  var options: js.UndefOr[Debug] = js.native
  
  /**
    * [DEPRECATED]
    */
  var transforms: js.UndefOr[Transforms] = js.native
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
    def setAliasesVarargs(value: Base*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: Aliases): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setOptions(value: Debug): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: Ext*): Self = this.set("transforms", js.Array(value :_*))
    
    @scala.inline
    def setTransforms(value: Transforms): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
}
