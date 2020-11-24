package typings.hapiAuthBearerToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Validate = js.Function3[
    /* request */ typings.hapiHapi.mod.Request, 
    /* token */ java.lang.String, 
    /* h */ typings.hapiHapi.mod.ResponseToolkit, 
    js.Promise[typings.hapiAuthBearerToken.mod.ValidateReturn] | typings.hapiAuthBearerToken.mod.ValidateReturn
  ]
}
