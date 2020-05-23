package typings.ibmMobilefirst.global.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
@JSGlobal("WL.LogInstance")
@js.native
class LogInstance ()
  extends typings.ibmMobilefirst.WL.LogInstance {
  /* CompleteClass */
  override def debug(message: String): Unit = js.native
  /* CompleteClass */
  override def error(message: String): Unit = js.native
  /* CompleteClass */
  override def fatal(message: String): Unit = js.native
  /* CompleteClass */
  override def info(message: String): Unit = js.native
  /* CompleteClass */
  override def trace(message: String): Unit = js.native
  /* CompleteClass */
  override def warn(message: String): Unit = js.native
}

