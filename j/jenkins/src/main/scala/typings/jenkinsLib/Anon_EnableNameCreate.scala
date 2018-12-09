package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EnableNameCreate extends js.Object {
  def build(name: java.lang.String): js.Promise[_] = js.native
  def build(name: java.lang.String, parameters: js.Any): js.Promise[_] = js.native
  def build(name: java.lang.String, parameters: js.Any, token: java.lang.String): js.Promise[_] = js.native
  def build(opts: jenkinsLib.jenkinsMod.createNs.JobBuildOptions): js.Promise[_] = js.native
  def config(name: java.lang.String): js.Promise[_] = js.native
  def config(name: java.lang.String, xml: java.lang.String): js.Promise[_] = js.native
  def copy(name: java.lang.String, from: java.lang.String): js.Promise[scala.Unit] = js.native
  def create(name: java.lang.String, xml: java.lang.String): js.Promise[scala.Unit] = js.native
  def destroy(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def disable(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def enable(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def exists(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  def get(name: java.lang.String): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
}

