package typings.ionic

import typings.ionic.anon.Env
import typings.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  def generateIonicEnvironment(ctx: IonicContext, pargv: js.Array[String]): js.Promise[Env] = js.native
}

