package typings.hapiAuthBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Validate = js.Function4[
    /* request */ typings.hapi.mod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ typings.hapi.mod.ResponseToolkit, 
    js.Promise[
      typings.hapiAuthBasic.mod.ValidateResponse | typings.hapiAuthBasic.mod.ValidateCustomResponse
    ]
  ]
}
