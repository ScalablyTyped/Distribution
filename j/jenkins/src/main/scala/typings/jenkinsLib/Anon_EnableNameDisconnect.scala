package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EnableNameDisconnect extends js.Object {
  def config(name: java.lang.String): js.Promise[_] = js.native
  def create(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def destroy(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def disable(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def disable(name: java.lang.String, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def disconnect(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def disconnect(name: java.lang.String, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def enable(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def exists(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  def get(name: java.lang.String): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
  def list(full: scala.Boolean): js.Promise[_] = js.native
}

