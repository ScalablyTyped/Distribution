package typings.lyricist.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LyricistTextFormat extends js.Object
@JSImport("lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LyricistTextFormat with String] = js.native
  
  @js.native
  sealed trait DOM extends LyricistTextFormat
  /* "dom" */ @js.native
  object DOM extends TopLevel[DOM with String]
  
  @js.native
  sealed trait HTML extends LyricistTextFormat
  /* "html" */ @js.native
  object HTML extends TopLevel[HTML with String]
  
  @js.native
  sealed trait PLAIN extends LyricistTextFormat
  /* "plain" */ @js.native
  object PLAIN extends TopLevel[PLAIN with String]
}
