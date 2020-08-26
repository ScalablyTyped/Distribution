package typings.jenkins.anon

import typings.jenkins.mod.JobBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Copy extends js.Object {
  def build(name: String): js.Promise[_] = js.native
  def build(name: String, parameters: js.UndefOr[scala.Nothing], token: String): js.Promise[_] = js.native
  def build(name: String, parameters: js.Any): js.Promise[_] = js.native
  def build(name: String, parameters: js.Any, token: String): js.Promise[_] = js.native
  def build(opts: JobBuildOptions): js.Promise[_] = js.native
  def config(name: String): js.Promise[_] = js.native
  def config(name: String, xml: String): js.Promise[_] = js.native
  def copy(name: String, from: String): js.Promise[Unit] = js.native
  def create(name: String, xml: String): js.Promise[Unit] = js.native
  def destroy(name: String): js.Promise[Unit] = js.native
  def disable(name: String): js.Promise[Unit] = js.native
  def enable(name: String): js.Promise[Unit] = js.native
  def exists(name: String): js.Promise[Boolean] = js.native
  def get(name: String): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
}

