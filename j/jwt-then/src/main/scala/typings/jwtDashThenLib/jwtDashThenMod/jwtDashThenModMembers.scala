package typings
package jwtDashThenLib.jwtDashThenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-then", JSImport.Namespace)
@js.native
object jwtDashThenModMembers extends js.Object {
  def sign(payload: java.lang.String, secretOrPrivateKey: Secret): stdLib.Promise[java.lang.String] = js.native
  def sign(payload: java.lang.String, secretOrPrivateKey: Secret, options: SignOptions): stdLib.Promise[java.lang.String] = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret): stdLib.Promise[java.lang.String] = js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): stdLib.Promise[java.lang.String] = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: Secret): stdLib.Promise[java.lang.String] = js.native
  def sign(payload: nodeLib.Buffer, secretOrPrivateKey: Secret, options: SignOptions): stdLib.Promise[java.lang.String] = js.native
  def verify(token: java.lang.String, secretOrPublicKey: java.lang.String): stdLib.Promise[js.Object | java.lang.String] = js.native
  def verify(token: java.lang.String, secretOrPublicKey: nodeLib.Buffer): stdLib.Promise[js.Object | java.lang.String] = js.native
}

