package typings.jsnlog.jsnlogMod

import typings.jsnlog.jsnlogMod.JLNs.JSNLogLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsnlog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Declaration of JSNLog as the global symbol JL,
  // for when jsnlog.js is directly loaded via a script tag
  // Ambient declaration of the JL function itself
  def JL(): JSNLogLogger = js.native
  def JL(loggerName: String): JSNLogLogger = js.native
}

