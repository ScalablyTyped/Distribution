package typings
package markdownDashItLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownIt extends js.Object {
  var block: markdownDashItLib.libParserUnderscoreBlockMod.namespaced = js.native
  var core: markdownDashItLib.libParserUnderscoreCoreMod.namespaced = js.native
  var helpers: js.Any = js.native
  var `inline`: markdownDashItLib.libParserUnderscoreInlineMod.namespaced = js.native
  var linkify: linkifyDashItLib.linkifyDashItMod.LinkifyItNs.LinkifyIt = js.native
  var renderer: markdownDashItLib.libRendererMod.namespaced = js.native
  var utils: markdownDashItLib.Anon_UnescapeMd = js.native
  def disable(rules: java.lang.String): MarkdownIt = js.native
  def disable(rules: java.lang.String, ignoreInvalid: scala.Boolean): MarkdownIt = js.native
  def disable(rules: js.Array[java.lang.String]): MarkdownIt = js.native
  def disable(rules: js.Array[java.lang.String], ignoreInvalid: scala.Boolean): MarkdownIt = js.native
  def enable(rules: java.lang.String): MarkdownIt = js.native
  def enable(rules: java.lang.String, ignoreInvalid: scala.Boolean): MarkdownIt = js.native
  def enable(rules: js.Array[java.lang.String]): MarkdownIt = js.native
  def enable(rules: js.Array[java.lang.String], ignoreInvalid: scala.Boolean): MarkdownIt = js.native
  def normalizeLink(url: java.lang.String): java.lang.String = js.native
  def normalizeLinkText(url: java.lang.String): java.lang.String = js.native
  def parse(src: java.lang.String, env: js.Any): js.Array[markdownDashItLib.libTokenMod.namespaced] = js.native
  def parseInline(src: java.lang.String, env: js.Any): js.Array[markdownDashItLib.libTokenMod.namespaced] = js.native
  def render(md: java.lang.String): java.lang.String = js.native
  def render(md: java.lang.String, env: js.Any): java.lang.String = js.native
  def renderInline(md: java.lang.String): java.lang.String = js.native
  def renderInline(md: java.lang.String, env: js.Any): java.lang.String = js.native
  def set(options: markdownDashItLib.libMod.MarkdownItNs.Options): MarkdownIt = js.native
  /*
      // The following only works in 3.0
      // Since it's still not allowed to target 3.0, i'll leave the code commented out
  
      use<T extends Array<any> = any[]>(
          plugin: (md: MarkdownIt, ...params: T) => void,
          ...params: T
      ): MarkdownIt;
      */
  
  def use(plugin: js.Function2[/* md */ this.type, /* repeated */js.Any, scala.Unit], params: js.Any*): MarkdownIt = js.native
  def validateLink(url: java.lang.String): scala.Boolean = js.native
}

