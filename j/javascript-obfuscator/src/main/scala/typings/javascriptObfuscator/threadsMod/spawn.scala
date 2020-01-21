package typings.javascriptObfuscator.threadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("threads", "spawn")
@js.native
object spawn extends js.Object {
  def apply[T, U](spawnCallback: SpawnCallback[T, U]): Thread[T, U] = js.native
}

