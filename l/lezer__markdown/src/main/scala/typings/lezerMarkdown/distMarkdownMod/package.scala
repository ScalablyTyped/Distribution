package typings.lezerMarkdown.distMarkdownMod

import typings.lezerMarkdown.distMarkdownMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Punctuation: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("Punctuation").asInstanceOf[js.RegExp]
inline def Punctuation_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Punctuation")(x.asInstanceOf[js.Any])

inline def parser: MarkdownParser = ^.asInstanceOf[js.Dynamic].selectDynamic("parser").asInstanceOf[MarkdownParser]

inline def space(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("space")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type BlockResult = Boolean | Null

/** 
NOTE: Rewritten from type alias:
{{{
type MarkdownExtension = @lezer/markdown.@lezer/markdown/dist/markdown.MarkdownConfig | std.Array<@lezer/markdown.@lezer/markdown/dist/markdown.MarkdownExtension>
}}}
to avoid circular code involving: 
- @lezer/markdown.@lezer/markdown/dist/markdown.MarkdownExtension
*/
type MarkdownExtension = MarkdownConfig | js.Array[Any]
