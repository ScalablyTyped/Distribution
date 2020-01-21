package typings.jenkins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig extends js.Object {
  def config(name: String): js.Promise[_] = js.native
  def create(name: String): js.Promise[Unit] = js.native
  def destroy(name: String): js.Promise[Unit] = js.native
  def disable(name: String): js.Promise[Unit] = js.native
  def disable(name: String, message: String): js.Promise[Unit] = js.native
  def disconnect(name: String): js.Promise[Unit] = js.native
  def disconnect(name: String, message: String): js.Promise[Unit] = js.native
  def enable(name: String): js.Promise[Unit] = js.native
  def exists(name: String): js.Promise[Boolean] = js.native
  def get(name: String): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
  def list(full: Boolean): js.Promise[_] = js.native
}

