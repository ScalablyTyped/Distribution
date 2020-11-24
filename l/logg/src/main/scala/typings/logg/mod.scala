package typings.logg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logg", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var Level: loggingLevels = js.native
  
  def getLogger(name: String): Logger = js.native
  
  def getTransientLogger(name: String): Logger = js.native
  
  var registerWatcher: js.Function1[/* watcher */ js.Function1[/* logRecord */ String, Unit], Unit] = js.native
  
  var rootLogger: Logger = js.native
}
