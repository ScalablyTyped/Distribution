package typings.lyricist.lyricistMod

import org.scalablytyped.runtime.TopLevel
import typings.lyricist.lyricistMod.LyricistTextFormat.DOM
import typings.lyricist.lyricistMod.LyricistTextFormat.HTML
import typings.lyricist.lyricistMod.LyricistTextFormat.PLAIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LyricistTextFormat extends js.Object

@JSImport("lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends js.Object {
  @js.native
  sealed trait DOM extends LyricistTextFormat
  
  @js.native
  sealed trait HTML extends LyricistTextFormat
  
  @js.native
  sealed trait PLAIN extends LyricistTextFormat
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LyricistTextFormat with String] = js.native
  /* "dom" */ @js.native
  object DOM extends TopLevel[DOM with String]
  
  /* "html" */ @js.native
  object HTML extends TopLevel[HTML with String]
  
  /* "plain" */ @js.native
  object PLAIN extends TopLevel[PLAIN with String]
  
}

