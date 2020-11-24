package typings.jestRunner.testWorkerMod

import typings.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-runner/build/testWorker", "worker")
@js.native
object worker extends js.Object {
  
  def apply(hasConfigGlobalConfigPathContext: WorkerData): js.Promise[TestResult] = js.native
}
