package typings
package keycloakDashConnectLib.keycloakDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeycloakNs {
  type SpecHandler = js.Function3[
    /* token */ Token, 
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    scala.Boolean
  ]
}
