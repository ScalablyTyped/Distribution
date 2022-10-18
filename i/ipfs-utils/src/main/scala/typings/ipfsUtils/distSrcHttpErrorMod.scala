package typings.ipfsUtils

import typings.std.Error
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHttpErrorMod {
  
  @JSImport("ipfs-utils/dist/src/http/error", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("ipfs-utils/dist/src/http/error", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends StObject
       with Error {
    /**
      * @param {Response} response
      */
    def this(response: Response) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var response: Response = js.native
  }
  
  @JSImport("ipfs-utils/dist/src/http/error", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
