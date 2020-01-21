package typings.jestCli

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.jestCore.AnonIsWatchMode
import typings.jestCore.testSchedulerMod.TestSchedulerContext
import typings.jestCore.testSchedulerMod.TestSchedulerOptions
import typings.jestRuntime.mod.Context
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.std.Partial
import typings.yargs.mod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SearchSource protected ()
    extends typings.jestCore.mod.SearchSource {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typings.jestCore.mod.TestScheduler {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typings.jestCore.mod.TestWatcher {
    def this(hasIsWatchMode: AnonIsWatchMode) = this()
  }
  
  var getVersion: js.Function0[String] = js.native
  var run: js.Function2[
    /* maybeArgv */ js.UndefOr[js.Array[String]], 
    /* project */ js.UndefOr[Path], 
    js.Promise[Unit]
  ] = js.native
  def runCLI(argv: Arguments[Partial[AnonAll]], projects: js.Array[String]): js.Promise[AnonGlobalConfig] = js.native
  @js.native
  object SearchSource
    extends TopLevel[Instantiable1[/* context */ Context, typings.jestCore.mod.SearchSource]]
  
  @js.native
  object TestScheduler
    extends TopLevel[
          Instantiable3[
            /* globalConfig */ GlobalConfig, 
            /* options */ TestSchedulerOptions, 
            /* context */ TestSchedulerContext, 
            typings.jestCore.mod.TestScheduler
          ]
        ]
  
  @js.native
  object TestWatcher
    extends TopLevel[
          Instantiable1[/* hasIsWatchMode */ AnonIsWatchMode, typings.jestCore.mod.TestWatcher]
        ]
  
}

