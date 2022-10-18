package typings.ipfsCoreUtils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("ipfs-core-utils/dist/src/errors", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  object TimeoutError {
    
    @JSImport("ipfs-core-utils/dist/src/errors", "TimeoutError.code")
    @js.native
    val code: String = js.native
  }
}
