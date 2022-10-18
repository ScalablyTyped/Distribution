package typings.ionic

import typings.debug.mod.Debugger
import typings.ionic.definitionsMod.IAilment
import typings.ionic.definitionsMod.IAilmentRegistry
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.PatientTreatmentStep
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoctorAilmentsBaseMod {
  
  /* note: abstract class */ @JSImport("ionic/lib/doctor/ailments/base", "Ailment")
  @js.native
  open class Ailment protected ()
    extends StObject
       with IAilment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    /* private */ var _debug: Any = js.native
    
    /* protected */ val client: IClient = js.native
    
    /* protected */ val config: IConfig = js.native
    
    def debug: Debugger = js.native
    
    /* CompleteClass */
    override def detected(): js.Promise[Boolean] = js.native
    
    def getLocalPackageJson(pkgName: String): js.Promise[js.UndefOr[PackageJson]] = js.native
    
    /* CompleteClass */
    override def getMessage(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]] = js.native
    
    /* CompleteClass */
    override val id: String = js.native
    
    /* CompleteClass */
    var `implicit`: Boolean = js.native
    
    /* protected */ val log: ILogger = js.native
    
    /* protected */ val project: IProject = js.native
    
    /* protected */ val session: ISession = js.native
    
    /* protected */ val shell: IShell = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments/base", "AilmentRegistry")
  @js.native
  open class AilmentRegistry ()
    extends StObject
       with IAilmentRegistry {
    
    /* protected */ var _ailments: js.Array[IAilment] = js.native
    
    /* CompleteClass */
    var ailments: js.Array[IAilment] = js.native
    @JSName("ailments")
    def ailments_MAilmentRegistry: js.Array[IAilment] = js.native
    
    /* CompleteClass */
    override def get(id: String): js.UndefOr[IAilment] = js.native
    
    /* CompleteClass */
    override def register(ailment: IAilment): Unit = js.native
  }
  
  trait AilmentDeps extends StObject {
    
    var client: IClient
    
    var config: IConfig
    
    var log: ILogger
    
    var project: IProject
    
    var session: ISession
    
    var shell: IShell
  }
  object AilmentDeps {
    
    inline def apply(
      client: IClient,
      config: IConfig,
      log: ILogger,
      project: IProject,
      session: ISession,
      shell: IShell
    ): AilmentDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AilmentDeps]
    }
    
    extension [Self <: AilmentDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
