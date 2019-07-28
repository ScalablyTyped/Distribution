package typings.icssDashUtils.icssDashUtilsMod

import typings.postcss.postcssMod.Container
import typings.postcss.postcssMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("icss-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createICSSRules(imports: CSSImports, exports: CSSExports): js.Array[Rule] = js.native
  def extractICSS(css: Container): ExtractedICSS = js.native
  def extractICSS(css: Container, removeRules: Boolean): ExtractedICSS = js.native
  def replaceSymbols(css: Container, replacements: Replacements): Unit = js.native
  def replaceValueSymbols(value: String, replacements: Replacements): String = js.native
}

