package typings.ky

import typings.ky.distributionTypesOptionsMod.NormalizedOptions
import typings.std.Error
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionErrorsHttperrorMod {
  
  @JSImport("ky/distribution/errors/HTTPError", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends StObject
       with Error {
    def this(response: Response, request: Request, options: NormalizedOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var options: NormalizedOptions = js.native
    
    var request: Request = js.native
    
    var response: Response = js.native
  }
}
