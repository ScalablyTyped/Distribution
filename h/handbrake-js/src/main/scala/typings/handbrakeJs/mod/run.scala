package typings.handbrakeJs.mod

import typings.handbrakeJs.anon.Stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("handbrake-js", "run")
@js.native
object run extends js.Object {
  
  def apply(options: HandbrakeOptions): js.Promise[Stderr] = js.native
}
