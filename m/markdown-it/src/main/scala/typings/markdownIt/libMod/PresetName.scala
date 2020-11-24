package typings.markdownIt.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MarkdownIt provides named presets as a convenience to quickly
  * enable/disable active syntax rules and options for common use cases.
  *
  * - ["commonmark"](https://github.com/markdown-it/markdown-it/blob/master/lib/presets/commonmark.js) -
  *   configures parser to strict [CommonMark](http://commonmark.org/) mode.
  * - [default](https://github.com/markdown-it/markdown-it/blob/master/lib/presets/default.js) -
  *   similar to GFM, used when no preset name given. Enables all available rules,
  *   but still without html, typographer & autolinker.
  * - ["zero"](https://github.com/markdown-it/markdown-it/blob/master/lib/presets/zero.js) -
  *   all rules disabled. Useful to quickly setup your config via `.enable()`.
  *   For example, when you need only `bold` and `italic` markup and nothing else.
  */
/* Rewritten from type alias, can be one of: 
  - typings.markdownIt.markdownItStrings.default
  - typings.markdownIt.markdownItStrings.zero
  - typings.markdownIt.markdownItStrings.commonmark
*/
trait PresetName extends js.Object
object PresetName {
  
  @scala.inline
  def commonmark: typings.markdownIt.markdownItStrings.commonmark = "commonmark".asInstanceOf[typings.markdownIt.markdownItStrings.commonmark]
  
  @scala.inline
  def default: typings.markdownIt.markdownItStrings.default = "default".asInstanceOf[typings.markdownIt.markdownItStrings.default]
  
  @scala.inline
  def zero: typings.markdownIt.markdownItStrings.zero = "zero".asInstanceOf[typings.markdownIt.markdownItStrings.zero]
}
