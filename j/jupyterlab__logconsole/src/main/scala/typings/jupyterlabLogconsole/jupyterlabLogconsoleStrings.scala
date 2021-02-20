package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.loggerMod.FullLogLevel
import typings.jupyterlabLogconsole.tokensMod.IContentChange
import typings.jupyterlabLogconsole.tokensMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabLogconsoleStrings {
  
  @js.native
  sealed trait append extends IContentChange
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait clear extends IContentChange
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait critical
    extends FullLogLevel
       with LogLevel
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug
    extends FullLogLevel
       with LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends FullLogLevel
       with LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait html extends StObject
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait info
    extends FullLogLevel
       with LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait level extends StObject
  @scala.inline
  def level: level = "level".asInstanceOf[level]
  
  @js.native
  sealed trait metadata extends FullLogLevel
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait output extends StObject
  @scala.inline
  def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait rendermime extends StObject
  @scala.inline
  def rendermime: rendermime = "rendermime".asInstanceOf[rendermime]
  
  @js.native
  sealed trait source extends StObject
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait text extends StObject
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait warning
    extends FullLogLevel
       with LogLevel
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
