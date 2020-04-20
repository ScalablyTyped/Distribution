package typings.keycloakConnect.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.keycloakConnect.AnonGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantedRequest
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  var kauth: AnonGrant = js.native
}

