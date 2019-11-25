package typings.atLoadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atLoadableServerMod {
  import typings.atLoadableServer.Anon_Entrypoints
  import typings.atLoadableServer.Anon_Stats
  import typings.atLoadableServer.Anon_StatsFile

  type AttrFn = js.Function1[/* chunk */ Chunk, js.Object]
  type ChunkExtractorOptions = Anon_Entrypoints with (Anon_StatsFile | Anon_Stats)
}
