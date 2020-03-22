package typings.jestCore

import typings.jestCore.searchSourceMod.default
import typings.jestCore.testSchedulerMod.TestSchedulerContext
import typings.jestCore.testSchedulerMod.TestSchedulerOptions
import typings.jestRuntime.mod.Context
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typings.jestCore.testSchedulerMod.default {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typings.jestCore.testWatcherMod.default {
    def this(hasIsWatchMode: AnonIsWatchMode) = this()
  }
  
  def getVersion(): String = js.native
  def runCLI(argv: ArgumentsPartialallboolea, projects: js.Array[String]): js.Promise[AnonGlobalConfig] = js.native
}

