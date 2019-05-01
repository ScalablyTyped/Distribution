package typings
package hapiDashAuthDashBearerDashTokenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBearerDashTokenMod {
  type Validate = js.Function3[
    /* request */ hapiLib.hapiMod.Request, 
    /* token */ java.lang.String, 
    /* h */ hapiLib.hapiMod.ResponseToolkit, 
    js.Promise[ValidateReturn] | ValidateReturn
  ]
  type ValidateReturn = hapiLib.hapiMod.AuthenticationData with hapiDashAuthDashBearerDashTokenLib.Anon_IsValid
}
