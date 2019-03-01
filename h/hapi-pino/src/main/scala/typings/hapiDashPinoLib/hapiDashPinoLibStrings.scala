package typings
package hapiDashPinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hapiDashPinoLibStrings {
  @js.native
  sealed trait Options extends js.Object
  
  @js.native
  sealed trait debug
    extends hapiDashPinoLib.hapiDashPinoMod.HapiPinoNs.LogLevels
  
  @js.native
  sealed trait error
    extends hapiDashPinoLib.hapiDashPinoMod.HapiPinoNs.LogLevels
  
  @js.native
  sealed trait info
    extends hapiDashPinoLib.hapiDashPinoMod.HapiPinoNs.LogLevels
  
  @js.native
  sealed trait trace
    extends hapiDashPinoLib.hapiDashPinoMod.HapiPinoNs.LogLevels
  
  @js.native
  sealed trait warn
    extends hapiDashPinoLib.hapiDashPinoMod.HapiPinoNs.LogLevels
  
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

