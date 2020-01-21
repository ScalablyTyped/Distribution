package typings.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttrFn = js.Function1[/* chunk */ typings.loadableServer.mod.Chunk, js.Object]
  type ChunkExtractorOptions = typings.loadableServer.AnonEntrypoints with (typings.loadableServer.AnonStatsFile | typings.loadableServer.AnonStats)
}
