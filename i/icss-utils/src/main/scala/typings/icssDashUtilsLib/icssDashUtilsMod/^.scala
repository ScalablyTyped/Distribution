package typings
package icssDashUtilsLib.icssDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("icss-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createICSSRules(imports: CSSImports, exports: CSSExports): js.Array[postcssLib.postcssMod.Rule] = js.native
  def extractICSS(css: postcssLib.postcssMod.Container): ExtractedICSS = js.native
  def extractICSS(css: postcssLib.postcssMod.Container, removeRules: scala.Boolean): ExtractedICSS = js.native
  def replaceSymbols(css: postcssLib.postcssMod.Container, replacements: Replacements): scala.Unit = js.native
  def replaceValueSymbols(value: java.lang.String, replacements: Replacements): java.lang.String = js.native
}

