package typings.inlineCritical.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inline-critical", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param html The HTML to use to inline critical styles.
    * @param styles The styles to inline.
    * @param options Optional configuration object.
    * @example
    * const html = fs.readFileSync('test/fixtures/index.html', 'utf8')
    * const critical = fs.readFileSync('tests/fixtures/critical.css', 'utf8')
    * const inlined = inline(html, critical)
    *
    * // ignoring stylesheets matching regex
    * const inlined = inline(html, critical, {ignore: [/bootstrap/]})
    */
  def apply(html: String, styles: String): String = js.native
  def apply(html: String, styles: String, options: Options): String = js.native
}
