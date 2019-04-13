package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LyricistTextFormat extends js.Object

@JSImport("lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends js.Object {
  @js.native
  sealed trait DOM
    extends lyricistLib.lyricistMod.LyricistTextFormat
  
  @js.native
  sealed trait HTML
    extends lyricistLib.lyricistMod.LyricistTextFormat
  
  @js.native
  sealed trait PLAIN
    extends lyricistLib.lyricistMod.LyricistTextFormat
  
  /* "dom" */ val DOM: DOM with java.lang.String = js.native
  /* "html" */ val HTML: HTML with java.lang.String = js.native
  /* "plain" */ val PLAIN: PLAIN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[lyricistLib.lyricistMod.LyricistTextFormat with java.lang.String] = js.native
}

