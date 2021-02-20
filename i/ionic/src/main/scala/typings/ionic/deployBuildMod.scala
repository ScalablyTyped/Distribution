package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deployBuildMod {
  
  @JSImport("ionic/commands/deploy/build", "BuildCommand")
  @js.native
  class BuildCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def createDeployBuild(appflowId: String, token: String, options: CommandLineOptions): js.Promise[DeployBuild] = js.native
    
    def getDeployBuild(appflowId: String, buildId: Double, token: String): js.Promise[DeployBuild] = js.native
    
    def tailBuildLog(appflowId: String, buildId: Double, token: String): js.Promise[DeployBuild] = js.native
  }
  
  @js.native
  trait DeployBuild extends StObject {
    
    var automation_id: Double = js.native
    
    var automation_name: String = js.native
    
    var caller_id: Double = js.native
    
    var commit: js.Any = js.native
    
    var created: String = js.native
    
    var environment_id: Double = js.native
    
    var environment_name: String = js.native
    
    var finished: String = js.native
    
    var id: String = js.native
    
    var job: js.Any = js.native
    
    var job_id: Double = js.native
    
    var native_config_id: Double = js.native
    
    var pending_channels: js.Array[String] = js.native
    
    var state: String = js.native
  }
  object DeployBuild {
    
    @scala.inline
    def apply(
      automation_id: Double,
      automation_name: String,
      caller_id: Double,
      commit: js.Any,
      created: String,
      environment_id: Double,
      environment_name: String,
      finished: String,
      id: String,
      job: js.Any,
      job_id: Double,
      native_config_id: Double,
      pending_channels: js.Array[String],
      state: String
    ): DeployBuild = {
      val __obj = js.Dynamic.literal(automation_id = automation_id.asInstanceOf[js.Any], automation_name = automation_name.asInstanceOf[js.Any], caller_id = caller_id.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], native_config_id = native_config_id.asInstanceOf[js.Any], pending_channels = pending_channels.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeployBuild]
    }
    
    @scala.inline
    implicit class DeployBuildMutableBuilder[Self <: DeployBuild] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomation_id(value: Double): Self = StObject.set(x, "automation_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomation_name(value: String): Self = StObject.set(x, "automation_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaller_id(value: Double): Self = StObject.set(x, "caller_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: js.Any): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment_id(value: Double): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinished(value: String): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJob(value: js.Any): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJob_id(value: Double): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNative_config_id(value: Double): Self = StObject.set(x, "native_config_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_channels(value: js.Array[String]): Self = StObject.set(x, "pending_channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_channelsVarargs(value: String*): Self = StObject.set(x, "pending_channels", js.Array(value :_*))
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
