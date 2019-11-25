package typings.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownDashIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCore
  extends /** Return any for a yet untyped property */
/* undocumented */ StringDictionary[js.Any] {
  var env: js.Any
  var level: Double
  /** Link to parser instance */
  var md: MarkdownIt
  /** The markdown source code that is being parsed. */
  var src: String
  var tokens: js.Array[typings.markdownDashIt.libTokenMod.^]
}

object StateCore {
  @scala.inline
  def apply(
    env: js.Any,
    level: Double,
    md: MarkdownIt,
    src: String,
    tokens: js.Array[typings.markdownDashIt.libTokenMod.^],
    StringDictionary: /** Return any for a yet untyped property */
  /* undocumented */ StringDictionary[js.Any] = null
  ): StateCore = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StateCore]
  }
}

