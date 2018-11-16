package typings
package loggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logg", JSImport.Namespace)
@js.native
object loggMod extends js.Object {
  var Level: loggLib.loggingLevels = js.native
  var registerWatcher: js.Function1[
    /* watcher */ js.Function1[/* logRecord */ java.lang.String, scala.Unit], 
    scala.Unit
  ] = js.native
  var rootLogger: loggLib.Logger = js.native
  def getLogger(name: java.lang.String): loggLib.Logger = js.native
  def getTransientLogger(name: java.lang.String): loggLib.Logger = js.native
}

