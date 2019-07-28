package typings.jenkins

import typings.jenkins.jenkinsStrings.list
import typings.jenkins.jenkinsStrings.my
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Add extends js.Object {
  def add(name: String, job: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def config(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def config(name: String, xml: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("create")
  def create_list(name: String, `type`: list, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("create")
  def create_my(name: String, `type`: my, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def destroy(name: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def exists(name: String, callback: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Unit = js.native
  def get(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def remove(name: String, job: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

