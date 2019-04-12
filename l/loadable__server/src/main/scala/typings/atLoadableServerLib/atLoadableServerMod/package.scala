package typings
package atLoadableServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atLoadableServerMod {
  type AttrFn = js.Function1[/* chunk */ Chunk, js.Object]
  type ChunkExtractorOptions = atLoadableServerLib.Anon_Entrypoints with (atLoadableServerLib.Anon_StatsFile | atLoadableServerLib.Anon_Stats)
}
