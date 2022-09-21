package typings.matrixAppservice

import typings.matrixAppservice.anon.Errcode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appserviceHttpErrorMod {
  
  @JSImport("matrix-appservice/lib/AppserviceHttpError", "AppserviceHttpError")
  @js.native
  open class AppserviceHttpError protected ()
    extends StObject
       with Error {
    /**
      * Creates a new Appservice HTTP error
      * @param body The error body.
      * @param status The HTTP status code.
      */
    def this(body: Errcode, status: Double) = this()
    
    val body: Errcode = js.native
    
    /**
      * The Matrix error code
      */
    val errcode: String = js.native
    
    /**
      * Optional human-readable error message.
      */
    val error: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    /**
      * Developer-friendly error message.
      */
    @JSName("message")
    def message_MAppserviceHttpError: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val status: Double = js.native
  }
}
