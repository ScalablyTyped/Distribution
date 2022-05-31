package typings.keycloakJs

import typings.keycloakJs.mod.KeycloakConfig
import typings.keycloakJs.mod.KeycloakInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Creates a new Keycloak client instance.
    * @param config A configuration object or path to a JSON config file.
    */
  inline def Keycloak(): KeycloakInstance = js.Dynamic.global.applyDynamic("Keycloak")().asInstanceOf[KeycloakInstance]
  inline def Keycloak(config: String): KeycloakInstance = js.Dynamic.global.applyDynamic("Keycloak")(config.asInstanceOf[js.Any]).asInstanceOf[KeycloakInstance]
  inline def Keycloak(config: KeycloakConfig): KeycloakInstance = js.Dynamic.global.applyDynamic("Keycloak")(config.asInstanceOf[js.Any]).asInstanceOf[KeycloakInstance]
}
