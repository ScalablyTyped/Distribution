package typings.jestDashRunner.buildTestWorkerMod

import typings.atJestTestDashResult.buildTypesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner/build/testWorker", "worker")
@js.native
object worker extends js.Object {
  def apply(hasConfigGlobalConfigPathContext: WorkerData): js.Promise[TestResult] = js.native
}

