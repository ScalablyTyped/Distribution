package typings.keycloakConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SpecHandler = js.Function3[
    /* token */ typings.keycloakConnect.mod.Token, 
    /* request */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typings.express.mod.Response_, 
    scala.Boolean
  ]
}
