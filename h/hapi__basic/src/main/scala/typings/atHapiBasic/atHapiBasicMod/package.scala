package typings.atHapiBasic

import typings.atHapiHapi.atHapiHapiMod.Request
import typings.atHapiHapi.atHapiHapiMod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiBasicMod {
  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
