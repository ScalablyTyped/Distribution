package typings.jestCore

import typings.jestCore.anon.GlobalConfig
import typings.jestCore.anon.IsWatchMode
import typings.jestCore.searchSourceMod.default
import typings.jestCore.testSchedulerMod.TestSchedulerContext
import typings.jestCore.testSchedulerMod.TestSchedulerOptions
import typings.jestRuntime.mod.Context
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getVersion(): String = js.native
  
  def runCLI(argv: Argv, projects: js.Array[Path]): js.Promise[GlobalConfig] = js.native
  
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typings.jestCore.testSchedulerMod.default {
    def this(
      globalConfig: typings.jestTypes.configMod.GlobalConfig,
      options: TestSchedulerOptions,
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typings.jestCore.testWatcherMod.default {
    def this(hasIsWatchMode: IsWatchMode) = this()
  }
}
