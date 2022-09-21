package typings.ionic

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicAngularMod.IonicAngularProject
import typings.ionic.libDoctorMod.Ailment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularAilmentsMod {
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsMajorUpdateAvailable")
  @js.native
  open class AppScriptsMajorUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsUpdateAvailable")
  @js.native
  open class AppScriptsUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularAilment")
  @js.native
  abstract class IonicAngularAilment protected () extends Ailment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    /* protected */ @JSName("project")
    val project_IonicAngularAilment: IonicAngularProject = js.native
    
    @JSName("projects")
    val projects_IonicAngularAilment: js.Array[ProjectType] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularMajorUpdateAvailable")
  @js.native
  open class IonicAngularMajorUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularPackageJsonHasDefaultIonicBuildCommand")
  @js.native
  open class IonicAngularPackageJsonHasDefaultIonicBuildCommand protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularPackageJsonHasDefaultIonicServeCommand")
  @js.native
  open class IonicAngularPackageJsonHasDefaultIonicServeCommand protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularUpdateAvailable")
  @js.native
  open class IonicAngularUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  trait IonicAngularAilmentDeps
    extends StObject
       with AilmentDeps {
    
    @JSName("project")
    val project_IonicAngularAilmentDeps: IonicAngularProject
  }
  object IonicAngularAilmentDeps {
    
    inline def apply(
      client: IClient,
      config: IConfig,
      log: ILogger,
      project: IonicAngularProject,
      session: ISession,
      shell: IShell
    ): IonicAngularAilmentDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicAngularAilmentDeps]
    }
    
    extension [Self <: IonicAngularAilmentDeps](x: Self) {
      
      inline def setProject(value: IonicAngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
