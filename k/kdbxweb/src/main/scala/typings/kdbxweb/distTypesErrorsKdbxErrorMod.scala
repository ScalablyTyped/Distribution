package typings.kdbxweb

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesErrorsKdbxErrorMod {
  
  @JSImport("kdbxweb/dist/types/errors/kdbx-error", "KdbxError")
  @js.native
  open class KdbxError protected ()
    extends StObject
       with Error {
    def this(code: String) = this()
    def this(code: String, message: String) = this()
    
    val code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
