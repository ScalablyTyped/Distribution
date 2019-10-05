package typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod

import typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Strings.jwt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@hapi/hapi", JSImport.Namespace)
@js.native
object atHapiHapiMod extends js.Object {
  @js.native
  trait ServerAuth extends js.Object {
    @JSName("strategy")
    def strategy_jwt(name: String, scheme: jwt): Unit = js.native
    @JSName("strategy")
    def strategy_jwt(name: String, scheme: jwt, options: Options): Unit = js.native
  }
  
}

