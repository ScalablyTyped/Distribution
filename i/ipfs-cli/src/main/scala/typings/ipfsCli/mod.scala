package typings.ipfsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cli(
    command: js.Array[String],
    ctxMiddleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.MiddlewareFunction */ Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cli")(command.asInstanceOf[js.Any], ctxMiddleware.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
