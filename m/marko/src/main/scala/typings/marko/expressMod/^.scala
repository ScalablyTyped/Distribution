package typings.marko.expressMod

import typings.express.expressMod.Application
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  var application: Application = js.native
  var request: Request = js.native
  var response: Response = js.native
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): Express = js.native
}

