package typings
package hapiDashAuthDashBasicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBasicMod {
  type Validate = js.Function4[
    /* request */ hapiLib.hapiMod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ hapiLib.hapiMod.ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
