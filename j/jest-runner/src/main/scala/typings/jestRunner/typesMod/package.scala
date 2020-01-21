package typings.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ErrorWithCode = typings.std.Error with typings.jestRunner.AnonCode
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
  type TestFramework = js.Function5[
    /* globalConfig */ typings.jestTypes.configMod.GlobalConfig, 
    /* config */ typings.jestTypes.configMod.ProjectConfig, 
    /* environment */ typings.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typings.jestRuntime.mod.^, 
    /* testPath */ java.lang.String, 
    js.Promise[typings.jestTestResult.typesMod.TestResult]
  ]
}
