package typings.jestWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FileChange = js.Function1[/* fs */ typings.jestWatcher.typesMod.JestHookExposedFS, scala.Unit]
  
  type ShouldRunTestSuite = js.Function1[
    /* testSuiteInfo */ typings.jestWatcher.typesMod.TestSuiteInfo, 
    js.Promise[scala.Boolean]
  ]
  
  type TestRunComplete = js.Function1[/* results */ typings.jestTestResult.typesMod.AggregatedResult, scala.Unit]
  
  type UpdateConfigCallback = js.Function1[
    /* config */ js.UndefOr[typings.jestWatcher.typesMod.AllowedConfigOptions], 
    scala.Unit
  ]
}
