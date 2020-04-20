package typings.marko.expressMod

import typings.express.mod.Application_
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  var application: Application_ = js.native
  var request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  var response: Response_[js.Any] = js.native
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): Express = js.native
}

