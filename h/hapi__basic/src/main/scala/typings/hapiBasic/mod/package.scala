package typings.hapiBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Validate = js.Function4[
    /* request */ typings.hapiHapi.mod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ typings.hapiHapi.mod.ResponseToolkit, 
    js.Promise[
      typings.hapiBasic.mod.ValidateResponse | typings.hapiBasic.mod.ValidateCustomResponse
    ]
  ]
}
