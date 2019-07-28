package typings.hapiDashAuthDashBasic

import typings.hapi.hapiMod.Request
import typings.hapi.hapiMod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBasicMod {
  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
