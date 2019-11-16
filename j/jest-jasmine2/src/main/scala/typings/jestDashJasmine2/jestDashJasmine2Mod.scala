package typings.jestDashJasmine2

import typings.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashRuntime.jestDashRuntimeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2", JSImport.Namespace)
@js.native
object jestDashJasmine2Mod extends js.Object {
  def apply(
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    environment: JestEnvironment,
    runtime: ^,
    testPath: String
  ): js.Promise[TestResult] = js.native
  type Jasmine = typings.jestDashJasmine2.buildTypesMod.Jasmine
}

