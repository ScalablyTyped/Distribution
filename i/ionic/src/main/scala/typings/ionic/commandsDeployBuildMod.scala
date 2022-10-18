package typings.ionic

import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeployBuildMod {
  
  @JSImport("ionic/commands/deploy/build", "BuildCommand")
  @js.native
  open class BuildCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def createDeployBuild(appflowId: String, token: String, options: CommandLineOptions): js.Promise[DeployBuild] = js.native
    
    def getDeployBuild(appflowId: String, buildId: Double, token: String): js.Promise[DeployBuild] = js.native
    
    def tailBuildLog(appflowId: String, buildId: Double, token: String): js.Promise[DeployBuild] = js.native
  }
  
  trait DeployBuild extends StObject {
    
    var automation_id: Double
    
    var automation_name: String
    
    var caller_id: Double
    
    var commit: Any
    
    var created: String
    
    var environment_id: Double
    
    var environment_name: String
    
    var finished: String
    
    var id: String
    
    var job: Any
    
    var job_id: Double
    
    var native_config_id: Double
    
    var pending_channels: js.Array[String]
    
    var state: String
  }
  object DeployBuild {
    
    inline def apply(
      automation_id: Double,
      automation_name: String,
      caller_id: Double,
      commit: Any,
      created: String,
      environment_id: Double,
      environment_name: String,
      finished: String,
      id: String,
      job: Any,
      job_id: Double,
      native_config_id: Double,
      pending_channels: js.Array[String],
      state: String
    ): DeployBuild = {
      val __obj = js.Dynamic.literal(automation_id = automation_id.asInstanceOf[js.Any], automation_name = automation_name.asInstanceOf[js.Any], caller_id = caller_id.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], native_config_id = native_config_id.asInstanceOf[js.Any], pending_channels = pending_channels.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeployBuild]
    }
    
    extension [Self <: DeployBuild](x: Self) {
      
      inline def setAutomation_id(value: Double): Self = StObject.set(x, "automation_id", value.asInstanceOf[js.Any])
      
      inline def setAutomation_name(value: String): Self = StObject.set(x, "automation_name", value.asInstanceOf[js.Any])
      
      inline def setCaller_id(value: Double): Self = StObject.set(x, "caller_id", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: Any): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_id(value: Double): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: String): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJob(value: Any): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setJob_id(value: Double): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
      
      inline def setNative_config_id(value: Double): Self = StObject.set(x, "native_config_id", value.asInstanceOf[js.Any])
      
      inline def setPending_channels(value: js.Array[String]): Self = StObject.set(x, "pending_channels", value.asInstanceOf[js.Any])
      
      inline def setPending_channelsVarargs(value: String*): Self = StObject.set(x, "pending_channels", js.Array(value*))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
