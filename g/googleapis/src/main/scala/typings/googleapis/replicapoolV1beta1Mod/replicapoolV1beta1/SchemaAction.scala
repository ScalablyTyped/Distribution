package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that gets executed during initialization of the replicas.
  */
@js.native
trait SchemaAction extends js.Object {
  
  /**
    * A list of commands to run, one per line. If any command fails, the whole
    * action is considered a failure and no further actions are run. This also
    * marks the virtual machine or replica as a failure.
    */
  var commands: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of environment variables to use for the commands in this action.
    */
  var envVariables: js.UndefOr[js.Array[SchemaEnvVariable]] = js.native
  
  /**
    * If an action&#39;s commands on a particular replica do not finish in the
    * specified timeoutMilliSeconds, the replica is considered to be in a
    * FAILING state. No efforts are made to stop any processes that were
    * spawned or created as the result of running the action&#39;s commands.
    * The default is the max allowed value, 1 hour (i.e. 3600000 milliseconds).
    */
  var timeoutMilliSeconds: js.UndefOr[Double] = js.native
}
object SchemaAction {
  
  @scala.inline
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  
  @scala.inline
  implicit class SchemaActionOps[Self <: SchemaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommandsVarargs(value: String*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[String]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setEnvVariablesVarargs(value: SchemaEnvVariable*): Self = this.set("envVariables", js.Array(value :_*))
    
    @scala.inline
    def setEnvVariables(value: js.Array[SchemaEnvVariable]): Self = this.set("envVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvVariables: Self = this.set("envVariables", js.undefined)
    
    @scala.inline
    def setTimeoutMilliSeconds(value: Double): Self = this.set("timeoutMilliSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutMilliSeconds: Self = this.set("timeoutMilliSeconds", js.undefined)
  }
}
