package typings.jenkins

import typings.jenkins.jenkinsMod.JobBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BuildConfig extends js.Object {
  def build(name: String): js.Promise[_] = js.native
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

