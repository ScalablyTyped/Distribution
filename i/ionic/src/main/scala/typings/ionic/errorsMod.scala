package typings.ionic

import typings.ionicCliFramework.mod.BaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("ionic/lib/errors", "BaseException")
  @js.native
  open class BaseException protected () extends BaseError {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "BuildCLIProgramNotFoundException")
  @js.native
  open class BuildCLIProgramNotFoundException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "FatalException")
  @js.native
  open class FatalException () extends BaseException {
    def this(message: String) = this()
    def this(message: String, exitCode: Double) = this()
    def this(message: Unit, exitCode: Double) = this()
    
    @JSName("exitCode")
    var exitCode_FatalException: Double = js.native
    
    var fatal: Boolean = js.native
  }
  
  @JSImport("ionic/lib/errors", "HookException")
  @js.native
  open class HookException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "IntegrationException")
  @js.native
  open class IntegrationException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "IntegrationNotFoundException")
  @js.native
  open class IntegrationNotFoundException protected () extends IntegrationException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "RunnerException")
  @js.native
  open class RunnerException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "RunnerNotFoundException")
  @js.native
  open class RunnerNotFoundException protected () extends RunnerException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "ServeCLIProgramNotFoundException")
  @js.native
  open class ServeCLIProgramNotFoundException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "SessionException")
  @js.native
  open class SessionException protected () extends BaseException {
    def this(message: String) = this()
  }
}
