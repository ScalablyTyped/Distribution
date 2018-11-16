package typings
package ibmDashMobilefirstLib.WLNs

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
  def debug(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String): scala.Unit = js.native
  def fatal(message: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String): scala.Unit = js.native
  def trace(message: java.lang.String): scala.Unit = js.native
  def warn(message: java.lang.String): scala.Unit = js.native
}

