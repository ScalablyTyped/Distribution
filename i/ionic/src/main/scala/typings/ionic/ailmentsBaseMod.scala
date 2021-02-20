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
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ailmentsBaseMod {
  
  @JSImport("ionic/lib/doctor/ailments/base", "Ailment")
  @js.native
  abstract class Ailment protected () extends IAilment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    var _debug: js.Any = js.native
    
    val client: IClient = js.native
    
    val config: IConfig = js.native
    
    def debug: Debugger = js.native
    
    def getLocalPackageJson(pkgName: String): js.Promise[js.UndefOr[PackageJson]] = js.native
    
    val log: ILogger = js.native
    
    val project: IProject = js.native
    
    val session: ISession = js.native
    
    val shell: IShell = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments/base", "AilmentRegistry")
  @js.native
  class AilmentRegistry () extends IAilmentRegistry {
    
    var _ailments: js.Array[IAilment] = js.native
    
    @JSName("ailments")
    def ailments_MAilmentRegistry: js.Array[IAilment] = js.native
  }
  
  @js.native
  trait AilmentDeps extends StObject {
    
    var client: IClient = js.native
    
    var config: IConfig = js.native
    
    var log: ILogger = js.native
    
    var project: IProject = js.native
    
    var session: ISession = js.native
    
    var shell: IShell = js.native
  }
  object AilmentDeps {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AilmentDepsMutableBuilder[Self <: AilmentDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
