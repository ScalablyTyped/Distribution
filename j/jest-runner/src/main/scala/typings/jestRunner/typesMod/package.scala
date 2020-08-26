package typings.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OnTestFailure = js.Function2[
    /* test */ typings.jestRunner.typesMod.Test, 
    /* serializableError */ typings.jestTestResult.typesMod.SerializableError, 
    js.Promise[scala.Unit]
  ]
  type OnTestStart = js.Function1[/* test */ typings.jestRunner.typesMod.Test, js.Promise[scala.Unit]]
  type OnTestSuccess = js.Function2[
    /* test */ typings.jestRunner.typesMod.Test, 
    /* testResult */ typings.jestTestResult.typesMod.TestResult, 
    js.Promise[scala.Unit]
  ]
  type TestFileEvent[T /* <: /* keyof jest-runner.jest-runner/build/types.TestEvents */ typings.jestRunner.jestRunnerStrings.`test-file-start` | typings.jestRunner.jestRunnerStrings.`test-file-success` | typings.jestRunner.jestRunnerStrings.`test-file-failure` | typings.jestRunner.jestRunnerStrings.`test-case-result` */] = js.Function2[
    /* eventName */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: jest-runner.jest-runner/build/types.TestEvents[T] */ /* args */ js.Any, 
    js.Any
  ]
  type TestFramework = js.Function6[
    /* globalConfig */ typings.jestTypes.configMod.GlobalConfig, 
    /* config */ typings.jestTypes.configMod.ProjectConfig, 
    /* environment */ typings.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typings.jestRuntime.mod.RuntimeType, 
    /* testPath */ java.lang.String, 
    /* sendMessageToJest */ js.UndefOr[
      typings.jestRunner.typesMod.TestFileEvent[
        /* keyof jest-runner.jest-runner/build/types.TestEvents */ typings.jestRunner.jestRunnerStrings.`test-file-start` | typings.jestRunner.jestRunnerStrings.`test-file-success` | typings.jestRunner.jestRunnerStrings.`test-file-failure` | typings.jestRunner.jestRunnerStrings.`test-case-result`
      ]
    ], 
    js.Promise[typings.jestTestResult.typesMod.TestResult]
  ]
}
