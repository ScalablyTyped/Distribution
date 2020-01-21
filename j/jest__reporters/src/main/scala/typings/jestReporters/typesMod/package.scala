package typings.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OnTestFailure = js.Function2[
    /* test */ typings.jestReporters.typesMod.Test, 
    /* error */ typings.jestTestResult.typesMod.SerializableError, 
    js.Promise[js.Any]
  ]
  type OnTestStart = js.Function1[/* test */ typings.jestReporters.typesMod.Test, js.Promise[scala.Unit]]
  type OnTestSuccess = js.Function2[
    /* test */ typings.jestReporters.typesMod.Test, 
    /* result */ typings.jestTestResult.typesMod.TestResult, 
    js.Promise[js.Any]
  ]
  type TestFramework = js.Function5[
    /* globalConfig */ typings.jestTypes.configMod.GlobalConfig, 
    /* config */ typings.jestTypes.configMod.ProjectConfig, 
    /* environment */ typings.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typings.jestRuntime.mod.^, 
    /* testPath */ java.lang.String, 
    js.Promise[typings.jestTestResult.typesMod.TestResult]
  ]
  type TestRunData = js.Array[typings.jestReporters.AnonContext]
}
