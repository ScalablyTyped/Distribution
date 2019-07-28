package typings.keycloakDashConnect

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashConnectMod {
  type SpecHandler = js.Function3[/* token */ Token, /* request */ Request, /* response */ Response, Boolean]
}
