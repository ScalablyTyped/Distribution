package typings.hyperlorisTyson

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deserializationErrorMod {
  
  @JSImport("@hyperloris/tyson/dist/types/exceptions/deserializationError", "DeserializationError")
  @js.native
  open class DeserializationError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, json: String) = this()
    def this(message: Unit, json: String) = this()
    
    /* private */ var _json: Any = js.native
    
    val json: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
