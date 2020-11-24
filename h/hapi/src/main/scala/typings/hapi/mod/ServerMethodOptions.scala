package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerMethodOptions extends js.Object {
  
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
  implicit class ServerMethodOptionsOps[Self <: ServerMethodOptions] (val x: Self) extends AnyVal {
    
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
    def setBind(value: js.Object): Self = this.set("bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    
    @scala.inline
    def setCache(value: ServerMethodCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setGenerateKey(value: /* repeated */ js.Any => String | Null): Self = this.set("generateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenerateKey: Self = this.set("generateKey", js.undefined)
  }
}
