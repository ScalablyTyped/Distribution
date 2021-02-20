package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSImport("knockout", "tasks")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "tasks.cancel")
  @js.native
  def cancel(handle: Double): Unit = js.native
  
  @JSImport("knockout", "tasks.runEarly")
  @js.native
  def runEarly(): Unit = js.native
  
  @JSImport("knockout", "tasks.schedule")
  @js.native
  def schedule(callback: js.Function0[_]): Double = js.native
  
  @JSImport("knockout", "tasks.scheduler")
  @js.native
  def scheduler: js.Function1[/* callback */ js.Function0[js.Any], Unit] = js.native
  @scala.inline
  def scheduler_=(x: js.Function1[/* callback */ js.Function0[js.Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(x.asInstanceOf[js.Any])
}
