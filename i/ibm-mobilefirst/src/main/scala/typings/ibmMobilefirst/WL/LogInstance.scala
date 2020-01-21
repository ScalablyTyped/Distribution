package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
@JSGlobal("WL.LogInstance")
@js.native
class LogInstance () extends js.Object {
  def debug(message: String): Unit = js.native
  def error(message: String): Unit = js.native
  def fatal(message: String): Unit = js.native
  def info(message: String): Unit = js.native
  def trace(message: String): Unit = js.native
  def warn(message: String): Unit = js.native
}

