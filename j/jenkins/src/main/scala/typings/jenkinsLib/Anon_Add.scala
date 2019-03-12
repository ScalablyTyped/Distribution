package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Add extends js.Object {
  def add(
    name: java.lang.String,
    job: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def config(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def config(
    name: java.lang.String,
    xml: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("create")
  def create_list(
    name: java.lang.String,
    `type`: jenkinsLib.jenkinsLibStrings.list,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("create")
  def create_my(
    name: java.lang.String,
    `type`: jenkinsLib.jenkinsLibStrings.my,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def destroy(name: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def exists(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def get(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def list(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def remove(
    name: java.lang.String,
    job: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

