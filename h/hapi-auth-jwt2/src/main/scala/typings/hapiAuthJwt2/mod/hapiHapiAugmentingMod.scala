package typings.hapiAuthJwt2.mod

import typings.hapiAuthJwt2.hapiAuthJwt2Strings.jwt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@hapi/hapi", JSImport.Namespace)
@js.native
object hapiHapiAugmentingMod extends js.Object {
  @js.native
  trait ServerAuth extends js.Object {
    @JSName("strategy")
    def strategy_jwt(name: String, scheme: jwt): Unit = js.native
    @JSName("strategy")
    def strategy_jwt(name: String, scheme: jwt, options: Options): Unit = js.native
  }
  
}

