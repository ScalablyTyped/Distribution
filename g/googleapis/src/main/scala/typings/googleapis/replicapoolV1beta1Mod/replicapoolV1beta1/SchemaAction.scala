package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that gets executed during initialization of the replicas.
  */
trait SchemaAction extends StObject {
  
  /**
    * A list of commands to run, one per line. If any command fails, the whole
    * action is considered a failure and no further actions are run. This also
    * marks the virtual machine or replica as a failure.
    */
  var commands: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of environment variables to use for the commands in this action.
    */
  var envVariables: js.UndefOr[js.Array[SchemaEnvVariable]] = js.undefined
  
  /**
    * If an action&#39;s commands on a particular replica do not finish in the
    * specified timeoutMilliSeconds, the replica is considered to be in a
    * FAILING state. No efforts are made to stop any processes that were
    * spawned or created as the result of running the action&#39;s commands.
    * The default is the max allowed value, 1 hour (i.e. 3600000 milliseconds).
    */
  var timeoutMilliSeconds: js.UndefOr[Double] = js.undefined
}
object SchemaAction {
  
  @scala.inline
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  
  @scala.inline
  implicit class SchemaActionMutableBuilder[Self <: SchemaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    @scala.inline
    def setEnvVariables(value: js.Array[SchemaEnvVariable]): Self = StObject.set(x, "envVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVariablesUndefined: Self = StObject.set(x, "envVariables", js.undefined)
    
    @scala.inline
    def setEnvVariablesVarargs(value: SchemaEnvVariable*): Self = StObject.set(x, "envVariables", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutMilliSeconds(value: Double): Self = StObject.set(x, "timeoutMilliSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMilliSecondsUndefined: Self = StObject.set(x, "timeoutMilliSeconds", js.undefined)
  }
}
