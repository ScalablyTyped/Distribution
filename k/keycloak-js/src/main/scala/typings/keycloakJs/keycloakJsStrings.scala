package typings.keycloakJs

import typings.keycloakJs.mod.KeycloakFlow
import typings.keycloakJs.mod.KeycloakOnLoad
import typings.keycloakJs.mod.KeycloakResponseMode
import typings.keycloakJs.mod.KeycloakResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keycloakJsStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait S256 extends StObject
  inline def S256: S256 = "S256".asInstanceOf[S256]
  
  @js.native
  sealed trait cancelled extends StObject
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait `check-sso`
    extends StObject
       with KeycloakOnLoad
  inline def `check-sso`: `check-sso` = "check-sso".asInstanceOf[`check-sso`]
  
  @js.native
  sealed trait code
    extends StObject
       with KeycloakResponseType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait `code id_token token`
    extends StObject
       with KeycloakResponseType
  inline def `code id_token token`: `code id_token token` = ("code id_token token").asInstanceOf[`code id_token token`]
  
  @js.native
  sealed trait cordova extends StObject
  inline def cordova: cordova = "cordova".asInstanceOf[cordova]
  
  @js.native
  sealed trait `cordova-native` extends StObject
  inline def `cordova-native`: `cordova-native` = "cordova-native".asInstanceOf[`cordova-native`]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fragment
    extends StObject
       with KeycloakResponseMode
  inline def fragment: fragment = "fragment".asInstanceOf[fragment]
  
  @js.native
  sealed trait hybrid
    extends StObject
       with KeycloakFlow
  inline def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  
  @js.native
  sealed trait `id_token token`
    extends StObject
       with KeycloakResponseType
  inline def `id_token token`: `id_token token` = ("id_token token").asInstanceOf[`id_token token`]
  
  @js.native
  sealed trait `implicit`
    extends StObject
       with KeycloakFlow
  inline def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @js.native
  sealed trait login extends StObject
  inline def login: login = "login".asInstanceOf[login]
  
  @js.native
  sealed trait `login-required`
    extends StObject
       with KeycloakOnLoad
  inline def `login-required`: `login-required` = "login-required".asInstanceOf[`login-required`]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait query
    extends StObject
       with KeycloakResponseMode
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait standard
    extends StObject
       with KeycloakFlow
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
}
