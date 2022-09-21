package typings.keycloakJs

import typings.keycloakJs.mod.KeycloakConfig
import typings.keycloakJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * A client for the Keycloak authentication server.
    * @see {@link https://keycloak.gitbooks.io/securing-client-applications-guide/content/topics/oidc/javascript-adapter.html|Keycloak JS adapter documentation}
    */
  @JSGlobal("Keycloak")
  @js.native
  /**
  	 * Creates a new Keycloak client instance.
  	 * @param config A configuration object or path to a JSON config file.
  	 */
  open class Keycloak () extends default {
    def this(config: String) = this()
    def this(config: KeycloakConfig) = this()
  }
  object Keycloak {
    
    /**
      * @deprecated Construct a Keycloak instance using the `new` keyword instead.
      */
    @JSGlobal("Keycloak")
    @js.native
    def apply(): typings.keycloakJs.mod.Keycloak = js.native
    @JSGlobal("Keycloak")
    @js.native
    def apply(config: String): typings.keycloakJs.mod.Keycloak = js.native
    @JSGlobal("Keycloak")
    @js.native
    def apply(config: KeycloakConfig): typings.keycloakJs.mod.Keycloak = js.native
  }
}
