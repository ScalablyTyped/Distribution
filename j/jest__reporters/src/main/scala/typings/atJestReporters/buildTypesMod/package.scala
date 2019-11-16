package typings.atJestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
  import typings.atJestReporters.Anon_Context
  import typings.atJestTestDashResult.buildTypesMod.SerializableError
  import typings.atJestTestDashResult.buildTypesMod.TestResult
  import typings.atJestTypes.buildConfigMod.GlobalConfig
  import typings.atJestTypes.buildConfigMod.ProjectConfig
  import typings.jestDashRuntime.jestDashRuntimeMod.^

  type OnTestFailure = js.Function2[/* test */ Test, /* error */ SerializableError, js.Promise[js.Any]]
  type OnTestStart = js.Function1[/* test */ Test, js.Promise[Unit]]
  type OnTestSuccess = js.Function2[/* test */ Test, /* result */ TestResult, js.Promise[js.Any]]
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ JestEnvironment, 
    /* runtime */ ^, 
    /* testPath */ String, 
    js.Promise[TestResult]
  ]
  type TestRunData = js.Array[Anon_Context]
}
