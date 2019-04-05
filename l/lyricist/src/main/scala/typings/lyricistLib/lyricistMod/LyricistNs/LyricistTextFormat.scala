package typings
package lyricistLib.lyricistMod.LyricistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LyricistTextFormat extends js.Object

@JSImport("lyricist/Lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends js.Object {
  @js.native
  sealed trait DOM
    extends lyricistLib.lyricistMod.LyricistNs.LyricistTextFormat
  
  @js.native
  sealed trait HTML
    extends lyricistLib.lyricistMod.LyricistNs.LyricistTextFormat
  
  @js.native
  sealed trait PLAIN
    extends lyricistLib.lyricistMod.LyricistNs.LyricistTextFormat
  
}

