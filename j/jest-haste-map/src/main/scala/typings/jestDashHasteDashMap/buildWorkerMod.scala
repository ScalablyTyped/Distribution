package typings.jestDashHasteDashMap

import typings.jestDashHasteDashMap.buildTypesMod.WorkerMessage
import typings.jestDashHasteDashMap.buildTypesMod.WorkerMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/worker", JSImport.Namespace)
@js.native
object buildWorkerMod extends js.Object {
  def getSha1(data: WorkerMessage): js.Promise[WorkerMetadata] = js.native
  def worker(data: WorkerMessage): js.Promise[WorkerMetadata] = js.native
}

