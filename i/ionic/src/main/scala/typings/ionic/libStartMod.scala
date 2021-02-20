package typings.ionic

import typings.ionic.anon.Log
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.definitionsMod.StarterList
import typings.ionic.definitionsMod.StarterManifest
import typings.ionic.definitionsMod.StarterTemplate
import typings.ionic.ionicBooleans.`false`
import typings.ionic.ionicBooleans.`true`
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStartMod {
  
  @JSImport("ionic/lib/start", "STARTER_BASE_URL")
  @js.native
  val STARTER_BASE_URL: /* "https://d2ql0qc7j8u4b2.cloudfront.net" */ String = js.native
  
  @JSImport("ionic/lib/start", "STARTER_TEMPLATES")
  @js.native
  val STARTER_TEMPLATES: js.Array[StarterTemplate] = js.native
  
  @JSImport("ionic/lib/start", "SUPPORTED_FRAMEWORKS")
  @js.native
  val SUPPORTED_FRAMEWORKS: js.Array[SupportedFramework] = js.native
  
  @JSImport("ionic/lib/start", "getAdvertisement")
  @js.native
  def getAdvertisement(): String = js.native
  
  @JSImport("ionic/lib/start", "getStarterList")
  @js.native
  def getStarterList(config: IConfig): js.Promise[StarterList] = js.native
  @JSImport("ionic/lib/start", "getStarterList")
  @js.native
  def getStarterList(config: IConfig, tag: String): js.Promise[StarterList] = js.native
  
  @JSImport("ionic/lib/start", "getStarterProjectTypes")
  @js.native
  def getStarterProjectTypes(): js.Array[String] = js.native
  
  @JSImport("ionic/lib/start", "readStarterManifest")
  @js.native
  def readStarterManifest(p: String): js.Promise[StarterManifest] = js.native
  
  @JSImport("ionic/lib/start", "verifyOptions")
  @js.native
  def verifyOptions(options: CommandLineOptions, hasLog: Log): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.libStartMod.NewAppSchema
    - typings.ionic.libStartMod.ClonedAppSchema
  */
  trait AppSchema extends StObject
  object AppSchema {
    
    @scala.inline
    def ClonedAppSchema(cloned: `true`, projectDir: String, projectId: String, url: String): typings.ionic.libStartMod.ClonedAppSchema = {
      val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.libStartMod.ClonedAppSchema]
    }
    
    @scala.inline
    def NewAppSchema(
      cloned: `false`,
      name: String,
      projectDir: String,
      projectId: String,
      template: String,
      `type`: ProjectType
    ): typings.ionic.libStartMod.NewAppSchema = {
      val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.libStartMod.NewAppSchema]
    }
  }
  
  @js.native
  trait BaseAppSchema extends StObject {
    
    var appflowId: js.UndefOr[String] = js.native
    
    var packageId: js.UndefOr[String] = js.native
    
    var projectDir: String = js.native
    
    var projectId: String = js.native
  }
  object BaseAppSchema {
    
    @scala.inline
    def apply(projectDir: String, projectId: String): BaseAppSchema = {
      val __obj = js.Dynamic.literal(projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAppSchema]
    }
    
    @scala.inline
    implicit class BaseAppSchemaMutableBuilder[Self <: BaseAppSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppflowId(value: String): Self = StObject.set(x, "appflowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppflowIdUndefined: Self = StObject.set(x, "appflowId", js.undefined)
      
      @scala.inline
      def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
      
      @scala.inline
      def setProjectDir(value: String): Self = StObject.set(x, "projectDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClonedAppSchema
    extends BaseAppSchema
       with AppSchema {
    
    var cloned: `true` = js.native
    
    var url: String = js.native
  }
  object ClonedAppSchema {
    
    @scala.inline
    def apply(cloned: `true`, projectDir: String, projectId: String, url: String): ClonedAppSchema = {
      val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClonedAppSchema]
    }
    
    @scala.inline
    implicit class ClonedAppSchemaMutableBuilder[Self <: ClonedAppSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloned(value: `true`): Self = StObject.set(x, "cloned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewAppSchema
    extends BaseAppSchema
       with AppSchema {
    
    var cloned: `false` = js.native
    
    var name: String = js.native
    
    var template: String = js.native
    
    var `type`: ProjectType = js.native
  }
  object NewAppSchema {
    
    @scala.inline
    def apply(
      cloned: `false`,
      name: String,
      projectDir: String,
      projectId: String,
      template: String,
      `type`: ProjectType
    ): NewAppSchema = {
      val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewAppSchema]
    }
    
    @scala.inline
    implicit class NewAppSchemaMutableBuilder[Self <: NewAppSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloned(value: `false`): Self = StObject.set(x, "cloned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SupportedFramework extends StObject {
    
    var description: String = js.native
    
    var name: String = js.native
    
    var `type`: ProjectType = js.native
  }
  object SupportedFramework {
    
    @scala.inline
    def apply(description: String, name: String, `type`: ProjectType): SupportedFramework = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedFramework]
    }
    
    @scala.inline
    implicit class SupportedFrameworkMutableBuilder[Self <: SupportedFramework] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
