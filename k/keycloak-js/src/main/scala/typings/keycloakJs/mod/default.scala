package typings.keycloakJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client for the Keycloak authentication server.
  * @see {@link https://keycloak.gitbooks.io/securing-client-applications-guide/content/topics/oidc/javascript-adapter.html|Keycloak JS adapter documentation}
  */
@JSImport("keycloak-js", JSImport.Default)
@js.native
/**
	 * Creates a new Keycloak client instance.
	 * @param config A configuration object or path to a JSON config file.
	 */
open class default ()
  extends StObject
     with Keycloak {
  def this(config: String) = this()
  def this(config: KeycloakConfig) = this()
}
object default {
  
  /**
    * @deprecated Construct a Keycloak instance using the `new` keyword instead.
    */
  @JSImport("keycloak-js", JSImport.Default)
  @js.native
  def apply(): Keycloak = js.native
  @JSImport("keycloak-js", JSImport.Default)
  @js.native
  def apply(config: String): Keycloak = js.native
  @JSImport("keycloak-js", JSImport.Default)
  @js.native
  def apply(config: KeycloakConfig): Keycloak = js.native
}
