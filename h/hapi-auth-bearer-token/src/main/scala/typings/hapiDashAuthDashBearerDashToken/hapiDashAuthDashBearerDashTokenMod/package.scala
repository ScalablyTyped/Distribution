package typings.hapiDashAuthDashBearerDashToken

import typings.hapi.hapiMod.AuthenticationData
import typings.hapi.hapiMod.Request
import typings.hapi.hapiMod.ResponseToolkit
import typings.hapiDashAuthDashBearerDashToken.Anon_IsValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBearerDashTokenMod {
  type Validate = js.Function3[
    /* request */ Request, 
    /* token */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateReturn] | ValidateReturn
  ]
  type ValidateReturn = AuthenticationData with Anon_IsValid
}
