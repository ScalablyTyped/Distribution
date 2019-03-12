package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Build extends js.Object {
  def build(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def build(
    name: java.lang.String,
    parameters: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def build(
    name: java.lang.String,
    parameters: js.Any,
    token: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def build(
    name: jenkinsLib.jenkinsMod.createNs.JobBuildOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
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
  def copy(
    name: java.lang.String,
    from: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def create(
    name: java.lang.String,
    xml: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def destroy(name: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def disable(name: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def enable(name: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def exists(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def get(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def list(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
}

