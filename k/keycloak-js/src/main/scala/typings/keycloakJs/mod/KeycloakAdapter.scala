package typings.keycloakJs.mod

import typings.keycloakJs.anon.RedirectUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeycloakAdapter extends js.Object {
  
  def accountManagement(): KeycloakPromise[Unit, Unit] = js.native
  
  def login(): KeycloakPromise[Unit, Unit] = js.native
  def login(options: KeycloakLoginOptions): KeycloakPromise[Unit, Unit] = js.native
  
  def logout(): KeycloakPromise[Unit, Unit] = js.native
  def logout(options: KeycloakLogoutOptions): KeycloakPromise[Unit, Unit] = js.native
  
  def redirectUri(options: RedirectUri, encodeHash: Boolean): String = js.native
  
  def register(): KeycloakPromise[Unit, Unit] = js.native
  def register(options: KeycloakRegisterOptions): KeycloakPromise[Unit, Unit] = js.native
}
