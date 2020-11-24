package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/SummaryReporter", JSImport.Namespace)
@js.native
object summaryReporterMod extends js.Object {
  
  @js.native
  trait SummaryReporter extends BaseReporter {
    
    var _estimatedTime: js.Any = js.native
    
    var _getTestSummary: js.Any = js.native
    
    var _globalConfig: js.Any = js.native
    
    var _printSnapshotSummary: js.Any = js.native
    
    var _printSummary: js.Any = js.native
    
    var _write: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SummaryReporter {
    def this(globalConfig: GlobalConfig) = this()
  }
}
