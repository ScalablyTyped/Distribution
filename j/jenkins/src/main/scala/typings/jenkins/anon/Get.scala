package typings.jenkins.anon

import typings.jenkins.jenkinsStrings.html
import typings.jenkins.jenkinsStrings.text
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  def get(name: String, n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def log(name: String, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def log(name: String, n: Double, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def log(
    name: String,
    n: Double,
    start: Double,
    callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def logStream(name: String, n: Double): ReadableStream = js.native
  def logStream(name: String, n: Double, options: Delay): ReadableStream = js.native
  @JSName("log")
  def log_html(
    name: String,
    n: Double,
    start: Double,
    `type`: html,
    callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("log")
  def log_html(
    name: String,
    n: Double,
    start: Double,
    `type`: html,
    meta: Boolean,
    callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("log")
  def log_text(
    name: String,
    n: Double,
    start: Double,
    `type`: text,
    callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("log")
  def log_text(
    name: String,
    n: Double,
    start: Double,
    `type`: text,
    meta: Boolean,
    callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def stop(name: String, n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def term(name: String, n: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

