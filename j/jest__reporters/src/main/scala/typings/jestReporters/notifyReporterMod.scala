package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestReporters.typesMod.TestSchedulerContext
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/NotifyReporter", JSImport.Namespace)
@js.native
object notifyReporterMod extends js.Object {
  
  @js.native
  trait NotifyReporter extends BaseReporter {
    
    var _context: js.Any = js.native
    
    var _globalConfig: js.Any = js.native
    
    var _notifier: js.Any = js.native
    
    var _startRun: js.Any = js.native
  }
  
  @js.native
  class default protected () extends NotifyReporter {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
  }
}
