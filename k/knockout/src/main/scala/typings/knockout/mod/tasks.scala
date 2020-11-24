package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "tasks")
@js.native
object tasks extends js.Object {
  
  def cancel(handle: Double): Unit = js.native
  
  def runEarly(): Unit = js.native
  
  def schedule(callback: js.Function0[_]): Double = js.native
  
  var scheduler: js.Function1[/* callback */ js.Function0[js.Any], Unit] = js.native
}
