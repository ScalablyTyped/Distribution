package typings.jss

import typings.jss.jssMod.GenerateClassName
import typings.jss.jssMod.Rule
import typings.jss.jssMod.StyleSheet
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClassNamePrefix[Name /* <: String */] extends js.Object {
  var classNamePrefix: String = js.native
  var element: HTMLStyleElement = js.native
  @JSName("generateClassName")
  var generateClassName_Original: GenerateClassName[Name] = js.native
  var index: Double = js.native
  var link: Boolean = js.native
  var media: String = js.native
  var meta: String = js.native
  def generateClassName(rule: Rule): String = js.native
  def generateClassName(rule: Rule, sheet: StyleSheet[Name]): String = js.native
}

