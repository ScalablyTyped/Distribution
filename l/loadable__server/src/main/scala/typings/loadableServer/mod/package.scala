package typings.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttrFn = js.Function1[/* chunk */ typings.loadableServer.mod.Chunk, js.Object]
  type ChunkExtractorOptions = typings.loadableServer.anon.Entrypoints with (typings.loadableServer.anon.StatsFile | typings.loadableServer.anon.Stats)
}
