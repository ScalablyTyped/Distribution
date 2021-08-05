package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerExtOptions extends StObject {
  
  /**
    * a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var after: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var before: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    */
  var bind: js.UndefOr[js.Object] = js.undefined
  
  /**
    * if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions, or when
    * adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var sandbox: js.UndefOr[typings.hapiHapi.hapiHapiStrings.server | plugin] = js.undefined
}
object ServerExtOptions {
  
  inline def apply(): ServerExtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerExtOptions]
  }
  
  extension [Self <: ServerExtOptions](x: Self) {
    
    inline def setAfter(value: String | js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    inline def setBefore(value: String | js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
    
    inline def setBind(value: js.Object): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setSandbox(value: typings.hapiHapi.hapiHapiStrings.server | plugin): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
  }
}
