package typings.hardRejection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Make unhandled promise rejections fail hard right away instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
    	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
    	*/
    def apply(): Unit = js.native
    def apply(log: js.Function1[/* stack */ js.UndefOr[String], Unit]): Unit = js.native
  }
}
