package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerMethodOptions extends StObject {
  
  /**
    * a context object passed back to the method function (via this) when called. Defaults to active context (set via server.bind() when the method is registered. Ignored if the method is an arrow
    * function.
    */
  var bind: js.UndefOr[js.Object] = js.native
  
  /**
    * the same cache configuration used in server.cache(). The generateTimeout option is required.
    */
  var cache: js.UndefOr[ServerMethodCache] = js.native
  
  /**
    * a function used to generate a unique key (for caching) from the arguments passed to the method function (the flags argument is not passed as input). The server will automatically generate a
    * unique key if the function's arguments are all of types 'string', 'number', or 'boolean'. However if the method uses other types of arguments, a key generation function must be provided which
    * takes the same arguments as the function and returns a unique string (or null if no key can be generated).
    */
  var generateKey: js.UndefOr[js.Function1[/* repeated */ js.Any, String | Null]] = js.native
}
object ServerMethodOptions {
  
  @scala.inline
  def apply(): ServerMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerMethodOptions]
  }
  
  @scala.inline
  implicit class ServerMethodOptionsMutableBuilder[Self <: ServerMethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: js.Object): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    @scala.inline
    def setCache(value: ServerMethodCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setGenerateKey(value: /* repeated */ js.Any => String | Null): Self = StObject.set(x, "generateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateKeyUndefined: Self = StObject.set(x, "generateKey", js.undefined)
  }
}
