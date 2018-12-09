package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateName extends js.Object {
  def add(name: java.lang.String, job: java.lang.String): js.Promise[scala.Unit] = js.native
  def config(name: java.lang.String): js.Promise[_] = js.native
  def config(name: java.lang.String, xml: java.lang.String): js.Promise[_] = js.native
  @JSName("create")
  def create_list(name: java.lang.String, `type`: jenkinsLib.jenkinsLibStrings.list): js.Promise[scala.Unit] = js.native
  @JSName("create")
  def create_my(name: java.lang.String, `type`: jenkinsLib.jenkinsLibStrings.my): js.Promise[scala.Unit] = js.native
  def destroy(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def exists(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  def get(name: java.lang.String): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
  def remove(name: java.lang.String, job: java.lang.String): js.Promise[scala.Unit] = js.native
}

