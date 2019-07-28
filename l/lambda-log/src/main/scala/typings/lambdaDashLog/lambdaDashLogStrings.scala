package typings.lambdaDashLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object lambdaDashLogStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait log extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

