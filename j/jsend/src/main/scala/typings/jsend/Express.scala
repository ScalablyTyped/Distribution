package typings.jsend

import typings.jsend.jsend.jsendExpress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  @js.native
  trait Response extends StObject {
    
    def jsend(err: String): Unit = js.native
    def jsend(err: String, json: js.Object): Unit = js.native
    def jsend(err: js.Object): Unit = js.native
    def jsend(err: js.Object, json: js.Object): Unit = js.native
    @JSName("jsend")
    var jsend_Original: jsendExpress = js.native
  }
}
