package typings.ionicCliFramework.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparseArgsOptions extends js.Object {
  
  var allowCamelCase: js.UndefOr[Boolean] = js.native
  
  var ignoreFalse: js.UndefOr[Boolean] = js.native
  
  var useDoubleQuotes: js.UndefOr[Boolean] = js.native
  
  var useEquals: js.UndefOr[Boolean] = js.native
}
object UnparseArgsOptions {
  
  @scala.inline
  def apply(): UnparseArgsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnparseArgsOptions]
  }
  
  @scala.inline
  implicit class UnparseArgsOptionsOps[Self <: UnparseArgsOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowCamelCase(value: Boolean): Self = this.set("allowCamelCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCamelCase: Self = this.set("allowCamelCase", js.undefined)
    
    @scala.inline
    def setIgnoreFalse(value: Boolean): Self = this.set("ignoreFalse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFalse: Self = this.set("ignoreFalse", js.undefined)
    
    @scala.inline
    def setUseDoubleQuotes(value: Boolean): Self = this.set("useDoubleQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDoubleQuotes: Self = this.set("useDoubleQuotes", js.undefined)
    
    @scala.inline
    def setUseEquals(value: Boolean): Self = this.set("useEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEquals: Self = this.set("useEquals", js.undefined)
  }
}
