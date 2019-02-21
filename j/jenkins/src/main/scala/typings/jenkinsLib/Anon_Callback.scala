package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def get(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def log(
    name: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def log(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def log(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def logStream(name: java.lang.String, n: scala.Double): nodeLib.NodeJSNs.ReadableStream = js.native
  def logStream(name: java.lang.String, n: scala.Double, options: Anon_Delay): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("log")
  def log_html(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("log")
  def log_html(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    meta: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("log")
  def log_text(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("log")
  def log_text(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    meta: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stop(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def term(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

