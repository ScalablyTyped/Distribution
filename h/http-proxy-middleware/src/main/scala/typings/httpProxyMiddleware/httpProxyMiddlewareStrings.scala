package typings.httpProxyMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object httpProxyMiddlewareStrings {
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait silent extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

