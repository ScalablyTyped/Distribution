package typings
package keycloakDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashConnectMod {
  type SpecHandler = js.Function3[
    /* token */ Token, 
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    scala.Boolean
  ]
}
