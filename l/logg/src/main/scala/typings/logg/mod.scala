package typings.logg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("logg", "Level")
  @js.native
  def Level: loggingLevels = js.native
  @scala.inline
  def Level_=(x: loggingLevels): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Level")(x.asInstanceOf[js.Any])
  
  @JSImport("logg", "getLogger")
  @js.native
  def getLogger(name: String): Logger = js.native
  
  @JSImport("logg", "getTransientLogger")
  @js.native
  def getTransientLogger(name: String): Logger = js.native
  
  @JSImport("logg", "registerWatcher")
  @js.native
  def registerWatcher: js.Function1[/* watcher */ js.Function1[/* logRecord */ String, Unit], Unit] = js.native
  @scala.inline
  def registerWatcher_=(x: js.Function1[/* watcher */ js.Function1[/* logRecord */ String, Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerWatcher")(x.asInstanceOf[js.Any])
  
  @JSImport("logg", "rootLogger")
  @js.native
  def rootLogger: Logger = js.native
  @scala.inline
  def rootLogger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootLogger")(x.asInstanceOf[js.Any])
}
