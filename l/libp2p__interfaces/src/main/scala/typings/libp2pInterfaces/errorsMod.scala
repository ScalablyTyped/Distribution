package typings.libp2pInterfaces

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object errorsMod {
  
  @JSImport("@libp2p/interfaces/errors", "AbortError")
  @js.native
  open class AbortError ()
    extends typings.libp2pInterfaces.distSrcErrorsMod.AbortError {
    def this(message: String) = this()
  }
  /* static members */
  object AbortError {
    
    @JSImport("@libp2p/interfaces/errors", "AbortError.code")
    @js.native
    val code: /* "ABORT_ERR" */ String = js.native
    
    @JSImport("@libp2p/interfaces/errors", "AbortError.type")
    @js.native
    val `type`: /* "aborted" */ String = js.native
  }
  
  @JSImport("@libp2p/interfaces/errors", "CodeError")
  @js.native
  open class CodeError[T /* <: Record[String, Any] */] protected ()
    extends typings.libp2pInterfaces.distSrcErrorsMod.CodeError[T] {
    def this(message: String, code: String) = this()
    def this(message: String, code: String, props: T) = this()
  }
}
