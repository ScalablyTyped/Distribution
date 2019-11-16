package typings.atJestCore

import typings.atJestCore.buildSearchSourceMod.default
import typings.atJestCore.buildTestSchedulerMod.TestSchedulerContext
import typings.atJestCore.buildTestSchedulerMod.TestSchedulerOptions
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.jestDashRuntime.jestDashRuntimeMod.Context
import typings.std.Partial
import typings.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object atJestCoreMod extends js.Object {
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typings.atJestCore.buildTestSchedulerMod.default {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typings.atJestCore.buildTestWatcherMod.default {
    def this(hasIsWatchMode: Anon_IsWatchMode) = this()
  }
  
  def getVersion(): String = js.native
  def runCLI(argv: Arguments[Partial[Anon_All]], projects: js.Array[String]): js.Promise[Anon_GlobalConfig] = js.native
}

