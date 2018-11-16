package typings
package lambdaDashLogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object lambdaDashLogLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait log extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def info: info = "info".asInstanceOf[info]
  def log: log = "log".asInstanceOf[log]
  def warn: warn = "warn".asInstanceOf[warn]
}

