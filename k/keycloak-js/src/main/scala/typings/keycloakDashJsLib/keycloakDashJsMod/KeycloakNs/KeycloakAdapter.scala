package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakAdapter extends js.Object {
  def accountManagement(): KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def login(): KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def login(options: KeycloakLoginOptions): KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def logout(): KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def logout(options: js.Any): KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def redirectUri(options: keycloakDashJsLib.Anon_RedirectUri, encodeHash: scala.Boolean): java.lang.String = js.native
  def register(): KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def register(options: KeycloakLoginOptions): KeycloakPromise[scala.Unit, scala.Unit] = js.native
}

