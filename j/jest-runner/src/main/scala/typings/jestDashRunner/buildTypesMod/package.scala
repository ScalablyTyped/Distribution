package typings.jestDashRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
  import typings.atJestTestDashResult.buildTypesMod.SerializableError
  import typings.atJestTestDashResult.buildTypesMod.TestResult
  import typings.atJestTypes.buildConfigMod.GlobalConfig
  import typings.atJestTypes.buildConfigMod.ProjectConfig
  import typings.jestDashRunner.Anon_Code
  import typings.jestDashRuntime.jestDashRuntimeMod.^
  import typings.std.Error

  type ErrorWithCode = Error with Anon_Code
  type OnTestFailure = js.Function2[/* test */ Test, /* serializableError */ SerializableError, js.Promise[Unit]]
  type OnTestStart = js.Function1[/* test */ Test, js.Promise[Unit]]
  type OnTestSuccess = js.Function2[/* test */ Test, /* testResult */ TestResult, js.Promise[Unit]]
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ JestEnvironment, 
    /* runtime */ ^, 
    /* testPath */ String, 
    js.Promise[TestResult]
  ]
}
