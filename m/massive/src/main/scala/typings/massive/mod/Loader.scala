package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loader extends StObject {
  
  var allowedSchemas: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var blacklist: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var exceptions: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var functionBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var functionWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var scripts: js.UndefOr[String] = js.undefined
  
  var whitelist: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Loader {
  
  @scala.inline
  def apply(): Loader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderMutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedSchemas(value: String | js.Array[String]): Self = StObject.set(x, "allowedSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedSchemasUndefined: Self = StObject.set(x, "allowedSchemas", js.undefined)
    
    @scala.inline
    def setAllowedSchemasVarargs(value: String*): Self = StObject.set(x, "allowedSchemas", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    @scala.inline
    def setExceptions(value: String | js.Array[String]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    
    @scala.inline
    def setExceptionsVarargs(value: String*): Self = StObject.set(x, "exceptions", js.Array(value :_*))
    
    @scala.inline
    def setFunctionBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "functionBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionBlacklistUndefined: Self = StObject.set(x, "functionBlacklist", js.undefined)
    
    @scala.inline
    def setFunctionBlacklistVarargs(value: String*): Self = StObject.set(x, "functionBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setFunctionWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "functionWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionWhitelistUndefined: Self = StObject.set(x, "functionWhitelist", js.undefined)
    
    @scala.inline
    def setFunctionWhitelistVarargs(value: String*): Self = StObject.set(x, "functionWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
