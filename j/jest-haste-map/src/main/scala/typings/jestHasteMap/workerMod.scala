package typings.jestHasteMap

import typings.jestHasteMap.typesMod.WorkerMessage
import typings.jestHasteMap.typesMod.WorkerMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/worker", JSImport.Namespace)
@js.native
object workerMod extends js.Object {
  def getSha1(data: WorkerMessage): js.Promise[WorkerMetadata] = js.native
  def worker(data: WorkerMessage): js.Promise[WorkerMetadata] = js.native
}

