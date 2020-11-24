package typings.hapiHoek.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hoek", "assert")
@js.native
object assert extends js.Object {
  
  def apply(
    condition: js.Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def apply(condition: js.Any, error: Error): Unit = js.native
}
