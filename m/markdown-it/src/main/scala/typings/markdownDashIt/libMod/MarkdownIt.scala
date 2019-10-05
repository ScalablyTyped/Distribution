package typings.markdownDashIt.libMod

import typings.linkifyDashIt.linkifyDashItMod.LinkifyIt
import typings.markdownDashIt.Anon_ArrayReplaceAt
import typings.markdownDashIt.libParserUnderscoreBlockMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownIt extends js.Object {
  var block: ^ = js.native
  var core: typings.markdownDashIt.libParserUnderscoreCoreMod.^ = js.native
  var helpers: js.Any = js.native
  var `inline`: typings.markdownDashIt.libParserUnderscoreInlineMod.^ = js.native
  var linkify: LinkifyIt = js.native
  var renderer: typings.markdownDashIt.libRendererMod.^ = js.native
  var utils: Anon_ArrayReplaceAt = js.native
  def disable(rules: String): MarkdownIt = js.native
  def disable(rules: String, ignoreInvalid: Boolean): MarkdownIt = js.native
  def disable(rules: js.Array[String]): MarkdownIt = js.native
  def disable(rules: js.Array[String], ignoreInvalid: Boolean): MarkdownIt = js.native
  def enable(rules: String): MarkdownIt = js.native
  def enable(rules: String, ignoreInvalid: Boolean): MarkdownIt = js.native
  def enable(rules: js.Array[String]): MarkdownIt = js.native
  def enable(rules: js.Array[String], ignoreInvalid: Boolean): MarkdownIt = js.native
  def normalizeLink(url: String): String = js.native
  def normalizeLinkText(url: String): String = js.native
  def parse(src: String, env: js.Any): js.Array[typings.markdownDashIt.libTokenMod.^] = js.native
  def parseInline(src: String, env: js.Any): js.Array[typings.markdownDashIt.libTokenMod.^] = js.native
  def render(md: String): String = js.native
  def render(md: String, env: js.Any): String = js.native
  def renderInline(md: String): String = js.native
  def renderInline(md: String, env: js.Any): String = js.native
  def set(options: Options): MarkdownIt = js.native
  /*
    // The following only works in 3.0
    // Since it's still not allowed to target 3.0, i'll leave the code commented out
    use<T extends Array<any> = any[]>(
    plugin: (md: MarkdownIt, ...params: T) => void,
    ...params: T
    ): MarkdownIt;
    */
  def use(plugin: js.Function2[/* md */ this.type, /* repeated */ js.Any, Unit], params: js.Any*): MarkdownIt = js.native
  def validateLink(url: String): Boolean = js.native
}

