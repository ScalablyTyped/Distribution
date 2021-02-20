package typings.ionic

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.anon.ConfigPath
import typings.ionic.anon.PartialReadonlyIProjectCo
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IIntegration
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IMultiProjectConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.errorsMod.BaseException
import typings.ionic.ionicStrings.app
import typings.ionic.ionicStrings.multiapp
import typings.ionic.ionicStrings.unknown
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.ionicCliFramework.mod.BaseConfig
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
import typings.minimist.mod.ParsedArgs
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectMod {
  
  @JSImport("ionic/lib/project", "Project")
  @js.native
  abstract class Project protected () extends IProject {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("config")
    def config_MProject: ProjectConfig = js.native
    
    @JSName("directory")
    def directory_MProject: String = js.native
    
    val e: ProjectDeps = js.native
    
    @JSName("filePath")
    def filePath_MProject: String = js.native
    
    /* protected */ def getIntegrations(): js.Promise[js.Array[IIntegration[ProjectIntegration]]] = js.native
    
    var originalConfigFile: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    def packageJsonPath: String = js.native
    
    @JSName("pathPrefix")
    def pathPrefix_MProject: js.Array[String] = js.native
  }
  
  @JSImport("ionic/lib/project", "ProjectConfig")
  @js.native
  class ProjectConfig protected () extends BaseConfig[IProjectConfig] {
    def this(p: String) = this()
    def this(p: String, hasTypeOptions: ProjectConfigOptions) = this()
    
    def provideDefaults(c: PartialReadonlyIProjectCo): IProjectConfig = js.native
    
    val `type`: js.UndefOr[ProjectType] = js.native
  }
  
  @JSImport("ionic/lib/project", "ProjectDetails")
  @js.native
  class ProjectDetails protected () extends StObject {
    def this(hasRootDirectoryArgsE: ProjectDetailsDeps) = this()
    
    val args: ParsedArgs = js.native
    
    /* protected */ def determineMultiApp(config: IMultiProjectConfig): js.Promise[ProjectDetailsMultiAppResult] = js.native
    
    /* protected */ def determineSingleApp(config: IProjectConfig): js.Promise[ProjectDetailsSingleAppResult] = js.native
    
    val e: ProjectDeps = js.native
    
    def getIdFromArgs(): js.Promise[js.UndefOr[String]] = js.native
    
    def getIdFromDefaultProject(config: IMultiProjectConfig): js.Promise[js.UndefOr[String]] = js.native
    
    def getIdFromPathMatch(config: IMultiProjectConfig): js.Promise[js.UndefOr[String]] = js.native
    
    def getTypeFromConfig(config: IProjectConfig): js.Promise[js.UndefOr[ProjectType]] = js.native
    
    def getTypeFromDetection(): js.Promise[js.UndefOr[ProjectType]] = js.native
    
    def processResult(result: ProjectDetailsResult): Unit = js.native
    
    def readConfig(p: String): js.Promise[StringDictionary[_]] = js.native
    
    /**
      * Gather project details from specified configuration.
      *
      * This method will always resolve with a result object, with an array of
      * errors. Use `processResult()` to log warnings & errors.
      */
    def result(): js.Promise[ProjectDetailsResult] = js.native
    
    val rootDirectory: String = js.native
  }
  
  @JSImport("ionic/lib/project", "ProjectDetailsError")
  @js.native
  class ProjectDetailsError protected () extends BaseException {
    def this(msg: String, /**
      * Unique code for this error.
      */
    code: ProjectDetailsErrorCode) = this()
    def this(
      msg: String,
      /**
      * Unique code for this error.
      */
    code: ProjectDetailsErrorCode,
      /**
      * The underlying error that caused this error.
      */
    error: Error
    ) = this()
    
    /**
      * Unique code for this error.
      */
    @JSName("code")
    val code_ProjectDetailsError: ProjectDetailsErrorCode = js.native
  }
  
  @JSImport("ionic/lib/project", "createProjectFromDetails")
  @js.native
  def createProjectFromDetails(details: ProjectDetailsResult, deps: ProjectDeps): js.Promise[IProject] = js.native
  
  @JSImport("ionic/lib/project", "createProjectFromDirectory")
  @js.native
  def createProjectFromDirectory(rootDirectory: String, args: ParsedArgs, deps: ProjectDeps): js.Promise[js.UndefOr[IProject]] = js.native
  @JSImport("ionic/lib/project", "createProjectFromDirectory")
  @js.native
  def createProjectFromDirectory(
    rootDirectory: String,
    args: ParsedArgs,
    deps: ProjectDeps,
    hasLogErrors: CreateProjectFromDirectoryOptions
  ): js.Promise[js.UndefOr[IProject]] = js.native
  
  @JSImport("ionic/lib/project", "findProjectDirectory")
  @js.native
  def findProjectDirectory(cwd: String): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("ionic/lib/project", "isValidProjectId")
  @js.native
  def isValidProjectId(projectId: String): Boolean = js.native
  
  @JSImport("ionic/lib/project", "prettyProjectName")
  @js.native
  def prettyProjectName(): String = js.native
  @JSImport("ionic/lib/project", "prettyProjectName")
  @js.native
  def prettyProjectName(`type`: String): String = js.native
  
  @js.native
  trait CreateProjectFromDirectoryOptions extends StObject {
    
    var logErrors: js.UndefOr[Boolean] = js.native
  }
  object CreateProjectFromDirectoryOptions {
    
    @scala.inline
    def apply(): CreateProjectFromDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateProjectFromDirectoryOptions]
    }
    
    @scala.inline
    implicit class CreateProjectFromDirectoryOptionsMutableBuilder[Self <: CreateProjectFromDirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogErrors(value: Boolean): Self = StObject.set(x, "logErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogErrorsUndefined: Self = StObject.set(x, "logErrors", js.undefined)
    }
  }
  
  @js.native
  trait ProjectConfigOptions extends BaseConfigOptions {
    
    val `type`: js.UndefOr[ProjectType] = js.native
  }
  object ProjectConfigOptions {
    
    @scala.inline
    def apply(): ProjectConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfigOptions]
    }
    
    @scala.inline
    implicit class ProjectConfigOptionsMutableBuilder[Self <: ProjectConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ProjectDeps extends StObject {
    
    val client: IClient = js.native
    
    val config: IConfig = js.native
    
    val ctx: IonicContext = js.native
    
    val flags: IonicEnvironmentFlags = js.native
    
    val log: ILogger = js.native
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    
    val session: ISession = js.native
    
    val shell: IShell = js.native
  }
  
  @js.native
  trait ProjectDetailsDeps extends StObject {
    
    val args: js.UndefOr[ParsedArgs] = js.native
    
    val e: ProjectDeps = js.native
    
    val rootDirectory: String = js.native
  }
  object ProjectDetailsDeps {
    
    @scala.inline
    def apply(e: ProjectDeps, rootDirectory: String): ProjectDetailsDeps = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsDeps]
    }
    
    @scala.inline
    implicit class ProjectDetailsDepsMutableBuilder[Self <: ProjectDetailsDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: ParsedArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setE(value: ProjectDeps): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.ionicStrings.ERR_INVALID_PROJECT_FILE
    - typings.ionic.ionicStrings.ERR_INVALID_PROJECT_TYPE
    - typings.ionic.ionicStrings.ERR_MISSING_PROJECT_TYPE
    - typings.ionic.ionicStrings.ERR_MULTI_MISSING_CONFIG
    - typings.ionic.ionicStrings.ERR_MULTI_MISSING_ID
  */
  trait ProjectDetailsErrorCode extends StObject
  object ProjectDetailsErrorCode {
    
    @scala.inline
    def ERR_INVALID_PROJECT_FILE: typings.ionic.ionicStrings.ERR_INVALID_PROJECT_FILE = "ERR_INVALID_PROJECT_FILE".asInstanceOf[typings.ionic.ionicStrings.ERR_INVALID_PROJECT_FILE]
    
    @scala.inline
    def ERR_INVALID_PROJECT_TYPE: typings.ionic.ionicStrings.ERR_INVALID_PROJECT_TYPE = "ERR_INVALID_PROJECT_TYPE".asInstanceOf[typings.ionic.ionicStrings.ERR_INVALID_PROJECT_TYPE]
    
    @scala.inline
    def ERR_MISSING_PROJECT_TYPE: typings.ionic.ionicStrings.ERR_MISSING_PROJECT_TYPE = "ERR_MISSING_PROJECT_TYPE".asInstanceOf[typings.ionic.ionicStrings.ERR_MISSING_PROJECT_TYPE]
    
    @scala.inline
    def ERR_MULTI_MISSING_CONFIG: typings.ionic.ionicStrings.ERR_MULTI_MISSING_CONFIG = "ERR_MULTI_MISSING_CONFIG".asInstanceOf[typings.ionic.ionicStrings.ERR_MULTI_MISSING_CONFIG]
    
    @scala.inline
    def ERR_MULTI_MISSING_ID: typings.ionic.ionicStrings.ERR_MULTI_MISSING_ID = "ERR_MULTI_MISSING_ID".asInstanceOf[typings.ionic.ionicStrings.ERR_MULTI_MISSING_ID]
  }
  
  @js.native
  trait ProjectDetailsMultiAppResult extends ProjectDetailsResultBase {
    
    val context: multiapp = js.native
    
    val id: js.UndefOr[String] = js.native
  }
  object ProjectDetailsMultiAppResult {
    
    @scala.inline
    def apply(context: multiapp, errors: js.Array[ProjectDetailsError]): ProjectDetailsMultiAppResult = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsMultiAppResult]
    }
    
    @scala.inline
    implicit class ProjectDetailsMultiAppResultMutableBuilder[Self <: ProjectDetailsMultiAppResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: multiapp): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  type ProjectDetailsResult = (ProjectDetailsSingleAppResult | ProjectDetailsMultiAppResult | ProjectDetailsUnknownResult) with ConfigPath
  
  @js.native
  trait ProjectDetailsResultBase extends StObject {
    
    val errors: js.Array[ProjectDetailsError] = js.native
    
    val `type`: js.UndefOr[ProjectType] = js.native
  }
  object ProjectDetailsResultBase {
    
    @scala.inline
    def apply(errors: js.Array[ProjectDetailsError]): ProjectDetailsResultBase = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsResultBase]
    }
    
    @scala.inline
    implicit class ProjectDetailsResultBaseMutableBuilder[Self <: ProjectDetailsResultBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ProjectDetailsError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ProjectDetailsError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ProjectDetailsSingleAppResult extends ProjectDetailsResultBase {
    
    val context: app = js.native
  }
  object ProjectDetailsSingleAppResult {
    
    @scala.inline
    def apply(context: app, errors: js.Array[ProjectDetailsError]): ProjectDetailsSingleAppResult = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsSingleAppResult]
    }
    
    @scala.inline
    implicit class ProjectDetailsSingleAppResultMutableBuilder[Self <: ProjectDetailsSingleAppResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: app): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectDetailsUnknownResult extends ProjectDetailsResultBase {
    
    val context: unknown = js.native
  }
  object ProjectDetailsUnknownResult {
    
    @scala.inline
    def apply(context: unknown, errors: js.Array[ProjectDetailsError]): ProjectDetailsUnknownResult = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsUnknownResult]
    }
    
    @scala.inline
    implicit class ProjectDetailsUnknownResultMutableBuilder[Self <: ProjectDetailsUnknownResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: unknown): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
