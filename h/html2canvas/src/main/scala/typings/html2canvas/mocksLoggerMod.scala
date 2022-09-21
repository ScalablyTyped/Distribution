package typings.html2canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mocksLoggerMod {
  
  @JSImport("html2canvas/dist/types/core/@/mocks/logger", "Logger")
  @js.native
  open class Logger_ () extends StObject {
    
    def debug(): Unit = js.native
    
    def error(): Unit = js.native
    
    def info(): Unit = js.native
  }
  /* static members */
  object Logger_ {
    
    @JSImport("html2canvas/dist/types/core/@/mocks/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Unit]
    
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    inline def getInstance(): Logger_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Logger_]
  }
  
  @JSImport("html2canvas/dist/types/core/@/mocks/logger", "logger")
  @js.native
  val logger: Logger_ = js.native
}
