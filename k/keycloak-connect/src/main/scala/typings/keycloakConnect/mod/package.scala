package typings.keycloakConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SpecHandler = js.Function3[
    /* token */ typings.keycloakConnect.mod.Token, 
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
