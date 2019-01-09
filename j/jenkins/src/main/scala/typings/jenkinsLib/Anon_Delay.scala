package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Delay extends js.Object {
  def get(name: java.lang.String, n: scala.Double): js.Promise[_] = js.native
  def log(name: java.lang.String, n: scala.Double): js.Promise[_] = js.native
  def log(name: java.lang.String, n: scala.Double, start: scala.Double): js.Promise[_] = js.native
  def logStream(name: java.lang.String, n: scala.Double): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_html(name: java.lang.String, n: scala.Double, `type`: jenkinsLib.jenkinsLibStrings.html): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_html(
    name: java.lang.String,
    n: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    delay: scala.Double
  ): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_text(name: java.lang.String, n: scala.Double, `type`: jenkinsLib.jenkinsLibStrings.text): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_text(
    name: java.lang.String,
    n: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    delay: scala.Double
  ): js.Promise[_] = js.native
  @JSName("log")
  def log_html(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html
  ): js.Promise[_] = js.native
  @JSName("log")
  def log_html(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    meta: scala.Boolean
  ): js.Promise[_] = js.native
  @JSName("log")
  def log_text(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text
  ): js.Promise[_] = js.native
  @JSName("log")
  def log_text(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    meta: scala.Boolean
  ): js.Promise[_] = js.native
  def stop(name: java.lang.String, n: scala.Double): js.Promise[scala.Unit] = js.native
  def term(name: java.lang.String, n: scala.Double): js.Promise[scala.Unit] = js.native
}

