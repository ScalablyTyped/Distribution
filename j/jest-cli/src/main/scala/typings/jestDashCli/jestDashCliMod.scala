package typings.jestDashCli

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.atJestCore.Anon_IsWatchMode
import typings.atJestCore.buildTestSchedulerMod.TestSchedulerContext
import typings.atJestCore.buildTestSchedulerMod.TestSchedulerOptions
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashRuntime.jestDashRuntimeMod.Context
import typings.std.Partial
import typings.yargs.yargsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object jestDashCliMod extends js.Object {
  @js.native
  class SearchSource protected ()
    extends typings.atJestCore.atJestCoreMod.SearchSource {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typings.atJestCore.atJestCoreMod.TestScheduler {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typings.atJestCore.atJestCoreMod.TestWatcher {
    def this(hasIsWatchMode: Anon_IsWatchMode) = this()
  }
  
  var getVersion: js.Function0[String] = js.native
  var run: js.Function2[
    /* maybeArgv */ js.UndefOr[js.Array[String]], 
    /* project */ js.UndefOr[Path], 
    js.Promise[Unit]
  ] = js.native
  def runCLI(argv: Arguments[Partial[Anon_All]], projects: js.Array[String]): js.Promise[Anon_GlobalConfig] = js.native
  @js.native
  object SearchSource
    extends TopLevel[
          Instantiable1[/* context */ Context, typings.atJestCore.atJestCoreMod.SearchSource]
        ]
  
  @js.native
  object TestScheduler
    extends TopLevel[
          Instantiable3[
            /* globalConfig */ GlobalConfig, 
            /* options */ TestSchedulerOptions, 
            /* context */ TestSchedulerContext, 
            typings.atJestCore.atJestCoreMod.TestScheduler
          ]
        ]
  
  @js.native
  object TestWatcher
    extends TopLevel[
          Instantiable1[
            /* hasIsWatchMode */ Anon_IsWatchMode, 
            typings.atJestCore.atJestCoreMod.TestWatcher
          ]
        ]
  
}

