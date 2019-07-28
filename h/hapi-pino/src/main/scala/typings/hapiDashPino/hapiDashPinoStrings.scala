package typings.hapiDashPino

import typings.hapiDashPino.hapiDashPinoMod.LogLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hapiDashPinoStrings {
  @js.native
  sealed trait Options extends js.Object
  
  @js.native
  sealed trait debug extends LogLevels
  
  @js.native
  sealed trait error extends LogLevels
  
  @js.native
  sealed trait info extends LogLevels
  
  @js.native
  sealed trait trace extends LogLevels
  
  @js.native
  sealed trait warn extends LogLevels
  
  @scala.inline
  def Options: Options = "Options".asInstanceOf[Options]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

