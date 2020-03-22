package typings.hostValidation.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("host-validation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(opts: config): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

