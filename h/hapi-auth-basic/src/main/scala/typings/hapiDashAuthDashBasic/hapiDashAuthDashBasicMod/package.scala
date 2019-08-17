package typings.hapiDashAuthDashBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBasicMod {
  import typings.hapi.hapiMod.Request
  import typings.hapi.hapiMod.ResponseToolkit

  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
