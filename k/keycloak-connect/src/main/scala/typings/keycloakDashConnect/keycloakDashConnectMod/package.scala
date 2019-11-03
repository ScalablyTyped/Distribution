package typings.keycloakDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashConnectMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type SpecHandler = js.Function3[
    /* token */ Token, 
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    Boolean
  ]
}
