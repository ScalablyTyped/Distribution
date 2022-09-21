package typings.ionic

import org.scalablytyped.runtime.StringDictionary
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectMod {
  
  @JSImport("ionic/lib/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/project", "Project")
  @js.native
  abstract class Project protected ()
    extends StObject
       with IProject {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("config")
    def config_MProject: ProjectConfig = js.native
    
    @JSName("directory")
    def directory_MProject: String = js.native
    
    /* protected */ val e: ProjectDeps = js.native
    
    @JSName("filePath")
    def filePath_MProject: String = js.native
    
    /* protected */ def getIntegrations(): js.Promise[js.Array[IIntegration[ProjectIntegration]]] = js.native
    
    /* protected */ var originalConfigFile: js.UndefOr[StringDictionary[Any]] = js.native
    
    def packageJsonPath: String = js.native
    
    @JSName("pathPrefix")
    def pathPrefix_MProject: js.Array[String] = js.native
  }
  
  @JSImport("ionic/lib/project", "ProjectConfig")
  @js.native
  open class ProjectConfig protected () extends BaseConfig[IProjectConfig] {
    def this(p: String) = this()
    def this(p: String, hasTypeOptions: ProjectConfigOptions) = this()
    
    def provideDefaults(c: PartialReadonlyIProjectCo): IProjectConfig = js.native
    
    /* protected */ val `type`: js.UndefOr[ProjectType] = js.native
  }
  
  @JSImport("ionic/lib/project", "ProjectDetails")
  @js.native
  open class ProjectDetails protected () extends StObject {
    def this(hasRootDirectoryArgsE: ProjectDetailsDeps) = this()
    
    /* protected */ val args: ParsedArgs = js.native
    
    /* protected */ def determineMultiApp(config: IMultiProjectConfig): js.Promise[ProjectDetailsMultiAppResult] = js.native
    
    /* protected */ def determineSingleApp(config: IProjectConfig): js.Promise[ProjectDetailsSingleAppResult] = js.native
    
    /* protected */ val e: ProjectDeps = js.native
    
    def getIdFromArgs(): js.Promise[js.UndefOr[String]] = js.native
    
    def getIdFromDefaultProject(config: IMultiProjectConfig): js.Promise[js.UndefOr[String]] = js.native
    
    def getIdFromPathMatch(config: IMultiProjectConfig): js.Promise[js.UndefOr[String]] = js.native
    
    def getTypeFromConfig(config: IProjectConfig): js.Promise[js.UndefOr[ProjectType]] = js.native
    
    def getTypeFromDetection(): js.Promise[js.UndefOr[ProjectType]] = js.native
    
    def processResult(result: ProjectDetailsResult): Unit = js.native
    
    def readConfig(p: String): js.Promise[StringDictionary[Any]] = js.native
    
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
  open class ProjectDetailsError protected () extends BaseException {
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
    error: js.Error
    ) = this()
    
    /**
      * Unique code for this error.
      */
    @JSName("code")
    val code_ProjectDetailsError: ProjectDetailsErrorCode = js.native
  }
  
  inline def createProjectFromDetails(details: ProjectDetailsResult, deps: ProjectDeps): js.Promise[IProject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjectFromDetails")(details.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IProject]]
  
  inline def createProjectFromDirectory(rootDirectory: String, args: ParsedArgs, deps: ProjectDeps): js.Promise[js.UndefOr[IProject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjectFromDirectory")(rootDirectory.asInstanceOf[js.Any], args.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IProject]]]
  inline def createProjectFromDirectory(
    rootDirectory: String,
    args: ParsedArgs,
    deps: ProjectDeps,
    hasLogErrors: CreateProjectFromDirectoryOptions
  ): js.Promise[js.UndefOr[IProject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjectFromDirectory")(rootDirectory.asInstanceOf[js.Any], args.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], hasLogErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IProject]]]
  
  inline def findProjectDirectory(cwd: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findProjectDirectory")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def isValidProjectId(projectId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidProjectId")(projectId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prettyProjectName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyProjectName")().asInstanceOf[String]
  inline def prettyProjectName(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyProjectName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CreateProjectFromDirectoryOptions extends StObject {
    
    var logErrors: js.UndefOr[Boolean] = js.undefined
  }
  object CreateProjectFromDirectoryOptions {
    
    inline def apply(): CreateProjectFromDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateProjectFromDirectoryOptions]
    }
    
    extension [Self <: CreateProjectFromDirectoryOptions](x: Self) {
      
      inline def setLogErrors(value: Boolean): Self = StObject.set(x, "logErrors", value.asInstanceOf[js.Any])
      
      inline def setLogErrorsUndefined: Self = StObject.set(x, "logErrors", js.undefined)
    }
  }
  
  trait ProjectConfigOptions
    extends StObject
       with BaseConfigOptions {
    
    val `type`: js.UndefOr[ProjectType] = js.undefined
  }
  object ProjectConfigOptions {
    
    inline def apply(): ProjectConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfigOptions]
    }
    
    extension [Self <: ProjectConfigOptions](x: Self) {
      
      inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ProjectDeps extends StObject {
    
    val client: IClient
    
    val config: IConfig
    
    val ctx: IonicContext
    
    val flags: IonicEnvironmentFlags
    
    val log: ILogger
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox]
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm]
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther]
    @JSName("prompt")
    val prompt_Original: PromptModule
    
    val session: ISession
    
    val shell: IShell
  }
  object ProjectDeps {
    
    inline def apply(
      client: IClient,
      config: IConfig,
      ctx: IonicContext,
      flags: IonicEnvironmentFlags,
      log: ILogger,
      prompt: PromptModule,
      session: ISession,
      shell: IShell
    ): ProjectDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDeps]
    }
    
    extension [Self <: ProjectDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: IonicEnvironmentFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: PromptModule): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectDetailsDeps extends StObject {
    
    val args: js.UndefOr[ParsedArgs] = js.undefined
    
    val e: ProjectDeps
    
    val rootDirectory: String
  }
  object ProjectDetailsDeps {
    
    inline def apply(e: ProjectDeps, rootDirectory: String): ProjectDetailsDeps = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsDeps]
    }
    
    extension [Self <: ProjectDetailsDeps](x: Self) {
      
      inline def setArgs(value: ParsedArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setE(value: ProjectDeps): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
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
    
    inline def ERR_INVALID_PROJECT_FILE: typings.ionic.ionicStrings.ERR_INVALID_PROJECT_FILE = "ERR_INVALID_PROJECT_FILE".asInstanceOf[typings.ionic.ionicStrings.ERR_INVALID_PROJECT_FILE]
    
    inline def ERR_INVALID_PROJECT_TYPE: typings.ionic.ionicStrings.ERR_INVALID_PROJECT_TYPE = "ERR_INVALID_PROJECT_TYPE".asInstanceOf[typings.ionic.ionicStrings.ERR_INVALID_PROJECT_TYPE]
    
    inline def ERR_MISSING_PROJECT_TYPE: typings.ionic.ionicStrings.ERR_MISSING_PROJECT_TYPE = "ERR_MISSING_PROJECT_TYPE".asInstanceOf[typings.ionic.ionicStrings.ERR_MISSING_PROJECT_TYPE]
    
    inline def ERR_MULTI_MISSING_CONFIG: typings.ionic.ionicStrings.ERR_MULTI_MISSING_CONFIG = "ERR_MULTI_MISSING_CONFIG".asInstanceOf[typings.ionic.ionicStrings.ERR_MULTI_MISSING_CONFIG]
    
    inline def ERR_MULTI_MISSING_ID: typings.ionic.ionicStrings.ERR_MULTI_MISSING_ID = "ERR_MULTI_MISSING_ID".asInstanceOf[typings.ionic.ionicStrings.ERR_MULTI_MISSING_ID]
  }
  
  trait ProjectDetailsMultiAppResult
    extends StObject
       with ProjectDetailsResultBase {
    
    val context: multiapp
    
    val id: js.UndefOr[String] = js.undefined
  }
  object ProjectDetailsMultiAppResult {
    
    inline def apply(errors: js.Array[ProjectDetailsError]): ProjectDetailsMultiAppResult = {
      val __obj = js.Dynamic.literal(context = "multiapp", errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsMultiAppResult]
    }
    
    extension [Self <: ProjectDetailsMultiAppResult](x: Self) {
      
      inline def setContext(value: multiapp): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.anon.ProjectDetailsSingleAppRe
    - typings.ionic.anon.ProjectDetailsMultiAppRes
    - typings.ionic.anon.ProjectDetailsUnknownResu
  */
  trait ProjectDetailsResult extends StObject
  object ProjectDetailsResult {
    
    inline def ProjectDetailsMultiAppRes(configPath: String, errors: js.Array[ProjectDetailsError]): typings.ionic.anon.ProjectDetailsMultiAppRes = {
      val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any], context = "multiapp", errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.anon.ProjectDetailsMultiAppRes]
    }
    
    inline def ProjectDetailsSingleAppRe(configPath: String, errors: js.Array[ProjectDetailsError]): typings.ionic.anon.ProjectDetailsSingleAppRe = {
      val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any], context = "app", errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.anon.ProjectDetailsSingleAppRe]
    }
    
    inline def ProjectDetailsUnknownResu(configPath: String, errors: js.Array[ProjectDetailsError]): typings.ionic.anon.ProjectDetailsUnknownResu = {
      val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any], context = "unknown", errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.anon.ProjectDetailsUnknownResu]
    }
  }
  
  trait ProjectDetailsResultBase extends StObject {
    
    val errors: js.Array[ProjectDetailsError]
    
    val `type`: js.UndefOr[ProjectType] = js.undefined
  }
  object ProjectDetailsResultBase {
    
    inline def apply(errors: js.Array[ProjectDetailsError]): ProjectDetailsResultBase = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsResultBase]
    }
    
    extension [Self <: ProjectDetailsResultBase](x: Self) {
      
      inline def setErrors(value: js.Array[ProjectDetailsError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ProjectDetailsError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ProjectDetailsSingleAppResult
    extends StObject
       with ProjectDetailsResultBase {
    
    val context: app
  }
  object ProjectDetailsSingleAppResult {
    
    inline def apply(errors: js.Array[ProjectDetailsError]): ProjectDetailsSingleAppResult = {
      val __obj = js.Dynamic.literal(context = "app", errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsSingleAppResult]
    }
    
    extension [Self <: ProjectDetailsSingleAppResult](x: Self) {
      
      inline def setContext(value: app): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectDetailsUnknownResult
    extends StObject
       with ProjectDetailsResultBase {
    
    val context: unknown
  }
  object ProjectDetailsUnknownResult {
    
    inline def apply(errors: js.Array[ProjectDetailsError]): ProjectDetailsUnknownResult = {
      val __obj = js.Dynamic.literal(context = "unknown", errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDetailsUnknownResult]
    }
    
    extension [Self <: ProjectDetailsUnknownResult](x: Self) {
      
      inline def setContext(value: unknown): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
