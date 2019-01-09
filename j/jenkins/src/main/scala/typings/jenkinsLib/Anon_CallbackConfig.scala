package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackConfig extends js.Object {
  def config(
    name: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def create(name: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def destroy(name: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def disable(name: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def disable(
    name: java.lang.String,
    message: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def disconnect(name: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def disconnect(
    name: java.lang.String,
    message: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def enable(name: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def exists(
    name: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def get(
    name: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def list(callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def list(
    full: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

