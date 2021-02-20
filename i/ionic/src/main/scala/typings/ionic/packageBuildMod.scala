package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageBuildMod {
  
  @JSImport("ionic/commands/package/build", "BuildCommand")
  @js.native
  class BuildCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def createPackageBuild(appflowId: String, token: String, platform: String, buildType: String, options: CommandLineOptions): js.Promise[PackageBuild] = js.native
    
    def downloadBuild(url: String, filename: String): js.Promise[String] = js.native
    
    def getDownloadUrl(appflowId: String, buildId: Double, token: String): js.Promise[DownloadUrl] = js.native
    
    def getPackageBuild(appflowId: String, buildId: Double, token: String): js.Promise[PackageBuild] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def tailBuildLog(appflowId: String, buildId: Double, token: String): js.Promise[PackageBuild] = js.native
  }
  
  @js.native
  trait DownloadUrl extends StObject {
    
    var url: String | Null = js.native
  }
  object DownloadUrl {
    
    @scala.inline
    def apply(): DownloadUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadUrl]
    }
    
    @scala.inline
    implicit class DownloadUrlMutableBuilder[Self <: DownloadUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
  
  @js.native
  trait PackageBuild extends StObject {
    
    var automation_id: Double = js.native
    
    var automation_name: String = js.native
    
    var build_type: String = js.native
    
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
    
    var native_config_name: String = js.native
    
    var platform: String = js.native
    
    var profile_tag: String = js.native
    
    var stack: js.Any = js.native
    
    var state: String = js.native
  }
  object PackageBuild {
    
    @scala.inline
    def apply(
      automation_id: Double,
      automation_name: String,
      build_type: String,
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
      native_config_name: String,
      platform: String,
      profile_tag: String,
      stack: js.Any,
      state: String
    ): PackageBuild = {
      val __obj = js.Dynamic.literal(automation_id = automation_id.asInstanceOf[js.Any], automation_name = automation_name.asInstanceOf[js.Any], build_type = build_type.asInstanceOf[js.Any], caller_id = caller_id.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], native_config_id = native_config_id.asInstanceOf[js.Any], native_config_name = native_config_name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], profile_tag = profile_tag.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageBuild]
    }
    
    @scala.inline
    implicit class PackageBuildMutableBuilder[Self <: PackageBuild] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomation_id(value: Double): Self = StObject.set(x, "automation_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomation_name(value: String): Self = StObject.set(x, "automation_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuild_type(value: String): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
      
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
      def setNative_config_name(value: String): Self = StObject.set(x, "native_config_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_tag(value: String): Self = StObject.set(x, "profile_tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
