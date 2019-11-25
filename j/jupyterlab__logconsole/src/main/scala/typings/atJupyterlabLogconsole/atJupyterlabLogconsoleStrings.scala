package typings.atJupyterlabLogconsole

import typings.atJupyterlabLogconsole.libLoggerMod.FullLogLevel
import typings.atJupyterlabLogconsole.libTokensMod.IContentChange
import typings.atJupyterlabLogconsole.libTokensMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabLogconsoleStrings {
  @js.native
  sealed trait append extends IContentChange
  
  @js.native
  sealed trait clear extends IContentChange
  
  @js.native
  sealed trait critical
    extends FullLogLevel
       with LogLevel
  
  @js.native
  sealed trait debug
    extends FullLogLevel
       with LogLevel
  
  @js.native
  sealed trait error
    extends FullLogLevel
       with LogLevel
  
  @js.native
  sealed trait html extends js.Object
  
  @js.native
  sealed trait info
    extends FullLogLevel
       with LogLevel
  
  @js.native
  sealed trait level extends js.Object
  
  @js.native
  sealed trait metadata extends FullLogLevel
  
  @js.native
  sealed trait output extends js.Object
  
  @js.native
  sealed trait rendermime extends js.Object
  
  @js.native
  sealed trait source extends js.Object
  
  @js.native
  sealed trait text extends js.Object
  
  @js.native
  sealed trait warning
    extends FullLogLevel
       with LogLevel
  
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def level: level = "level".asInstanceOf[level]
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  @scala.inline
  def output: output = "output".asInstanceOf[output]
  @scala.inline
  def rendermime: rendermime = "rendermime".asInstanceOf[rendermime]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

