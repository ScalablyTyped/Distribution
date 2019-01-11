package typings
package jwtDashThenLib.jwtDashThenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-then", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sign(payload: java.lang.String, secretOrPrivateKey: jwtDashThenLib.jwtDashThenMod.Secret): js.Promise[java.lang.String] = js.native
  def sign(
    payload: java.lang.String,
    secretOrPrivateKey: jwtDashThenLib.jwtDashThenMod.Secret,
    options: jwtDashThenLib.jwtDashThenMod.SignOptions
  ): js.Promise[java.lang.String] = js.native
  def sign(payload: js.Object, secretOrPrivateKey: jwtDashThenLib.jwtDashThenMod.Secret): js.Promise[java.lang.String] = js.native
  def sign(
    payload: js.Object,
    secretOrPrivateKey: jwtDashThenLib.jwtDashThenMod.Secret,
    options: jwtDashThenLib.jwtDashThenMod.SignOptions
  ): js.Promise[java.lang.String] = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: jwtDashThenLib.jwtDashThenMod.Secret): js.Promise[java.lang.String] = js.native
  def sign(
    payload: nodeLib.Buffer,
    secretOrPrivateKey: jwtDashThenLib.jwtDashThenMod.Secret,
    options: jwtDashThenLib.jwtDashThenMod.SignOptions
  ): js.Promise[java.lang.String] = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String): js.Promise[js.Object | java.lang.String] = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): js.Promise[js.Object | java.lang.String] = js.native
}

