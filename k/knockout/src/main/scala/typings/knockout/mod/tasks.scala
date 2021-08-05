package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSImport("knockout", "tasks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancel(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runEarly(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runEarly")().asInstanceOf[Unit]
  
  inline def schedule(callback: js.Function0[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("knockout", "tasks.scheduler")
  @js.native
  def scheduler: js.Function1[/* callback */ js.Function0[js.Any], Unit] = js.native
  inline def scheduler_=(x: js.Function1[/* callback */ js.Function0[js.Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(x.asInstanceOf[js.Any])
}
