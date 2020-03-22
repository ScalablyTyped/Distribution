package typings.hapiAuthBearerToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Validate = js.Function3[
    /* request */ typings.hapi.mod.Request, 
    /* token */ java.lang.String, 
    /* h */ typings.hapi.mod.ResponseToolkit, 
    js.Promise[typings.hapiAuthBearerToken.mod.ValidateReturn] | typings.hapiAuthBearerToken.mod.ValidateReturn
  ]
}
