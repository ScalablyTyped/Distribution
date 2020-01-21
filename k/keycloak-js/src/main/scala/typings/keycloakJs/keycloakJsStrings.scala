package typings.keycloakJs

import typings.keycloakJs.mod.KeycloakFlow
import typings.keycloakJs.mod.KeycloakOnLoad
import typings.keycloakJs.mod.KeycloakResponseMode
import typings.keycloakJs.mod.KeycloakResponseType
import typings.keycloakJs.mod._KeycloakAdapterName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object keycloakJsStrings {
  @js.native
  sealed trait S256 extends js.Object
  
  @js.native
  sealed trait `check-sso` extends KeycloakOnLoad
  
  @js.native
  sealed trait code extends KeycloakResponseType
  
  @js.native
  sealed trait `code id_token token` extends KeycloakResponseType
  
  @js.native
  sealed trait cordova extends _KeycloakAdapterName
  
  @js.native
  sealed trait `cordova-native` extends _KeycloakAdapterName
  
  @js.native
  sealed trait default extends _KeycloakAdapterName
  
  @js.native
  sealed trait fragment extends KeycloakResponseMode
  
  @js.native
  sealed trait hybrid extends KeycloakFlow
  
  @js.native
  sealed trait `id_token token` extends KeycloakResponseType
  
  @js.native
  sealed trait `implicit` extends KeycloakFlow
  
  @js.native
  sealed trait login extends js.Object
  
  @js.native
  sealed trait `login-required` extends KeycloakOnLoad
  
  @js.native
  sealed trait native extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait query extends KeycloakResponseMode
  
  @js.native
  sealed trait register extends js.Object
  
  @js.native
  sealed trait standard extends KeycloakFlow
  
  @scala.inline
  def S256: S256 = "S256".asInstanceOf[S256]
  @scala.inline
  def `check-sso`: `check-sso` = "check-sso".asInstanceOf[`check-sso`]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def `code id_token token`: `code id_token token` = "code id_token token".asInstanceOf[`code id_token token`]
  @scala.inline
  def cordova: cordova = "cordova".asInstanceOf[cordova]
  @scala.inline
  def `cordova-native`: `cordova-native` = "cordova-native".asInstanceOf[`cordova-native`]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def fragment: fragment = "fragment".asInstanceOf[fragment]
  @scala.inline
  def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  @scala.inline
  def `id_token token`: `id_token token` = "id_token token".asInstanceOf[`id_token token`]
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  @scala.inline
  def login: login = "login".asInstanceOf[login]
  @scala.inline
  def `login-required`: `login-required` = "login-required".asInstanceOf[`login-required`]
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def register: register = "register".asInstanceOf[register]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
}

