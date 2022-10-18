package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Errcode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsMatrixErrorMod {
  
  @JSImport("matrix-bot-sdk/lib/models/MatrixError", "MatrixError")
  @js.native
  open class MatrixError protected ()
    extends StObject
       with Error {
    /**
      * Creates a new Matrix Error
      * @param body The error body.
      * @param statusCode The HTTP status code.
      */
    def this(body: Errcode, statusCode: Double) = this()
    
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
    def message_MMatrixError: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * If rate limited, the time in milliseconds to wait before retrying the request
      */
    val retryAfterMs: js.UndefOr[Double] = js.native
    
    val statusCode: Double = js.native
  }
}
