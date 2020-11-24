package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends js.Object {
  
  var allowedSchemas: js.UndefOr[String | js.Array[String]] = js.native
  
  var blacklist: js.UndefOr[String | js.Array[String]] = js.native
  
  var exceptions: js.UndefOr[String | js.Array[String]] = js.native
  
  var functionBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  
  var functionWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  
  var scripts: js.UndefOr[String] = js.native
  
  var whitelist: js.UndefOr[String | js.Array[String]] = js.native
}
object Loader {
  
  @scala.inline
  def apply(): Loader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    
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
    def setAllowedSchemasVarargs(value: String*): Self = this.set("allowedSchemas", js.Array(value :_*))
    
    @scala.inline
    def setAllowedSchemas(value: String | js.Array[String]): Self = this.set("allowedSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedSchemas: Self = this.set("allowedSchemas", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: String | js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setExceptionsVarargs(value: String*): Self = this.set("exceptions", js.Array(value :_*))
    
    @scala.inline
    def setExceptions(value: String | js.Array[String]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
    
    @scala.inline
    def setFunctionBlacklistVarargs(value: String*): Self = this.set("functionBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setFunctionBlacklist(value: String | js.Array[String]): Self = this.set("functionBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionBlacklist: Self = this.set("functionBlacklist", js.undefined)
    
    @scala.inline
    def setFunctionWhitelistVarargs(value: String*): Self = this.set("functionWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setFunctionWhitelist(value: String | js.Array[String]): Self = this.set("functionWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionWhitelist: Self = this.set("functionWhitelist", js.undefined)
    
    @scala.inline
    def setScripts(value: String): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: String | js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
