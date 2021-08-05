package typings.ionic

import typings.ionic.anon.Env
import typings.ionic.definitionsMod.IonicContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("ionic/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateIonicEnvironment(ctx: IonicContext, pargv: js.Array[String]): js.Promise[Env] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateIonicEnvironment")(ctx.asInstanceOf[js.Any], pargv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Env]]
}
