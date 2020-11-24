package typings.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnTestFailure = typings.jestRunner.typesMod.OnTestFailure
  
  type OnTestStart = typings.jestRunner.typesMod.OnTestStart
  
  type OnTestSuccess = typings.jestRunner.typesMod.OnTestSuccess
  
  type Test = typings.jestRunner.typesMod.Test
  
  type TestFileEvent = typings.jestRunner.typesMod.TestFileEvent[
    /* keyof jest-runner.jest-runner/build/types.TestEvents */ typings.jestRunner.jestRunnerStrings.`test-file-start` | typings.jestRunner.jestRunnerStrings.`test-file-success` | typings.jestRunner.jestRunnerStrings.`test-file-failure` | typings.jestRunner.jestRunnerStrings.`test-case-result`
  ]
  
  type TestRunnerContext = typings.jestRunner.typesMod.TestRunnerContext
  
  type TestRunnerOptions = typings.jestRunner.typesMod.TestRunnerOptions
  
  type TestWatcher = typings.jestRunner.typesMod.TestWatcher
}
