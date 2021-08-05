package typings.maquette

import typings.maquette.interfacesMod.ProjectorPerformanceLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowPerformanceProjectorLoggerMod {
  
  @JSImport("maquette/dist/utilities/window-performance-projector-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/utilities/window-performance-projector-logger", "windowPerformanceProjectorLogger")
  @js.native
  def windowPerformanceProjectorLogger: ProjectorPerformanceLogger = js.native
  inline def windowPerformanceProjectorLogger_=(x: ProjectorPerformanceLogger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowPerformanceProjectorLogger")(x.asInstanceOf[js.Any])
}
