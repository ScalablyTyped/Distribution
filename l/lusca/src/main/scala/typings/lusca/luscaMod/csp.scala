package typings.lusca.luscaMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "csp")
@js.native
object csp extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: cspOptions): RequestHandler = js.native
}

