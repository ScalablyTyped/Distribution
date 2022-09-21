package typings.hapiJwt.mod

import typings.hapiJwt.hapiJwtStrings.jwt_
import typings.hapiJwt.mod.hapiJwt.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object hapiHapiAugmentingMod {
  
  @js.native
  trait ServerAuth extends StObject {
    
    /**
      * Function to define the server authentication strategy to be used.
      *
      * @param name string name to define the strategy.
      * @param scheme jwt for this plugin.
      * @param options jwt plugin options.
      */
    @JSName("strategy")
    def strategy_jwt(name: String, scheme: jwt_): Unit = js.native
    @JSName("strategy")
    def strategy_jwt(name: String, scheme: jwt_, options: Options): Unit = js.native
  }
}
