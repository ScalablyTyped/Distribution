package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "CommandStatus")
@js.native
class CommandStatus () extends StObject
object CommandStatus {
  
  @JSImport("lime-js", "CommandStatus")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("lime-js", "CommandStatus.failure")
  @js.native
  def failure: String = js.native
  @scala.inline
  def failure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failure")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("lime-js", "CommandStatus.success")
  @js.native
  def success: String = js.native
  @scala.inline
  def success_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
}
