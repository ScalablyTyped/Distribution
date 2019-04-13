package typings
package markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCore
  extends /** Return any for a yet untyped property */
/* undocumented */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var env: js.Any
  var level: scala.Double
  /** Link to parser instance */
  var md: markdownDashItLib.libMod.MarkdownIt
  /** The markdown source code that is being parsed. */
  var src: java.lang.String
  var tokens: js.Array[markdownDashItLib.libTokenMod.^]
}

object StateCore {
  @scala.inline
  def apply(
    env: js.Any,
    level: scala.Double,
    md: markdownDashItLib.libMod.MarkdownIt,
    src: java.lang.String,
    tokens: js.Array[markdownDashItLib.libTokenMod.^],
    StringDictionary: /** Return any for a yet untyped property */
  /* undocumented */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): StateCore = {
    val __obj = js.Dynamic.literal(env = env, level = level, md = md, src = src, tokens = tokens)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StateCore]
  }
}

