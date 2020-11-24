package typings.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lambda-log", "assert")
@js.native
object assert extends js.Object {
  
  def apply(test: js.Any, msg: String): LogMessage = js.native
  def apply(test: js.Any, msg: String, meta: js.UndefOr[scala.Nothing], tags: js.Array[String]): LogMessage = js.native
  def apply(test: js.Any, msg: String, meta: js.Object): LogMessage = js.native
  def apply(test: js.Any, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}
