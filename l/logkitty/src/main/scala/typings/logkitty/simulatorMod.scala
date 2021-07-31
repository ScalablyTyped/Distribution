package typings.logkitty

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simulatorMod {
  
  @JSImport("logkitty/build/ios/simulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def runSimulatorLoggingProcess(): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("runSimulatorLoggingProcess")().asInstanceOf[ChildProcess]
}
