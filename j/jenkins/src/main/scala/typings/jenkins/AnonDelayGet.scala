package typings.jenkins

import typings.jenkins.jenkinsStrings.html
import typings.jenkins.jenkinsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelayGet extends js.Object {
  def get(name: String, n: Double): js.Promise[_] = js.native
  def log(name: String, n: Double): js.Promise[_] = js.native
  def log(name: String, n: Double, start: Double): js.Promise[_] = js.native
  def logStream(name: String, n: Double): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_html(name: String, n: Double, `type`: html): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_html(name: String, n: Double, `type`: html, delay: Double): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_text(name: String, n: Double, `type`: text): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_text(name: String, n: Double, `type`: text, delay: Double): js.Promise[_] = js.native
  @JSName("log")
  def log_html(name: String, n: Double, start: Double, `type`: html): js.Promise[_] = js.native
  @JSName("log")
  def log_html(name: String, n: Double, start: Double, `type`: html, meta: Boolean): js.Promise[_] = js.native
  @JSName("log")
  def log_text(name: String, n: Double, start: Double, `type`: text): js.Promise[_] = js.native
  @JSName("log")
  def log_text(name: String, n: Double, start: Double, `type`: text, meta: Boolean): js.Promise[_] = js.native
  def stop(name: String, n: Double): js.Promise[Unit] = js.native
  def term(name: String, n: Double): js.Promise[Unit] = js.native
}

