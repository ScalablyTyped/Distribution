package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.libLoggerMod.FullLogLevel
import typings.jupyterlabLogconsole.libTokensMod.IContentChange
import typings.jupyterlabLogconsole.libTokensMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabLogconsoleStrings {
  
  @js.native
  sealed trait append
    extends StObject
       with IContentChange
  inline def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait clear
    extends StObject
       with IContentChange
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait critical
    extends StObject
       with FullLogLevel
       with LogLevel
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug
    extends StObject
       with FullLogLevel
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with FullLogLevel
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait html extends StObject
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait info
    extends StObject
       with FullLogLevel
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait level extends StObject
  inline def level: level = "level".asInstanceOf[level]
  
  @js.native
  sealed trait metadata
    extends StObject
       with FullLogLevel
  inline def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait output extends StObject
  inline def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait rendermime extends StObject
  inline def rendermime: rendermime = "rendermime".asInstanceOf[rendermime]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait warning
    extends StObject
       with FullLogLevel
       with LogLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
}
