package typings.keycloakDashJs.keycloakDashJsMod

import typings.keycloakDashJs.Anon_RedirectUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakAdapter extends js.Object {
  def accountManagement(): KeycloakPromise[Unit, Unit] = js.native
  def login(): KeycloakPromise[Unit, Unit] = js.native
  def login(options: KeycloakLoginOptions): KeycloakPromise[Unit, Unit] = js.native
  def logout(): KeycloakPromise[Unit, Unit] = js.native
  def logout(options: js.Any): KeycloakPromise[Unit, Unit] = js.native
  def redirectUri(options: Anon_RedirectUri, encodeHash: Boolean): String = js.native
  def register(): KeycloakPromise[Unit, Unit] = js.native
  def register(options: KeycloakLoginOptions): KeycloakPromise[Unit, Unit] = js.native
}

