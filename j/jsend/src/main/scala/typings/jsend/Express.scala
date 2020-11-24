package typings.jsend

import typings.jsend.jsend.jsendExpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Express")
@js.native
object Express extends js.Object {
  
  @js.native
  trait Response extends js.Object {
    
    def jsend(err: String): Unit = js.native
    def jsend(err: String, json: js.Object): Unit = js.native
    def jsend(err: js.Object): Unit = js.native
    def jsend(err: js.Object, json: js.Object): Unit = js.native
    @JSName("jsend")
    var jsend_Original: jsendExpress = js.native
  }
}
