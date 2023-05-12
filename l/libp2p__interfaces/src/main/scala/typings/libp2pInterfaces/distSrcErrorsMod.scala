package typings.libp2pInterfaces

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("@libp2p/interfaces/dist/src/errors", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    val code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object AbortError {
    
    @JSImport("@libp2p/interfaces/dist/src/errors", "AbortError.code")
    @js.native
    val code: /* "ABORT_ERR" */ String = js.native
    
    @JSImport("@libp2p/interfaces/dist/src/errors", "AbortError.type")
    @js.native
    val `type`: /* "aborted" */ String = js.native
  }
  
  @JSImport("@libp2p/interfaces/dist/src/errors", "CodeError")
  @js.native
  open class CodeError[T /* <: Record[String, Any] */] protected ()
    extends StObject
       with Error {
    def this(message: String, code: String) = this()
    def this(message: String, code: String, props: T) = this()
    
    val code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val props: T = js.native
  }
}
