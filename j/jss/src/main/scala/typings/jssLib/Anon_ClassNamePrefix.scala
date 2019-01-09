package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClassNamePrefix[Name /* <: java.lang.String */] extends js.Object {
  var classNamePrefix: java.lang.String = js.native
  var element: stdLib.HTMLStyleElement = js.native
  @JSName("generateClassName")
  var generateClassName_Original: jssLib.jssMod.GenerateClassName[Name] = js.native
  var index: scala.Double = js.native
  var link: scala.Boolean = js.native
  var media: java.lang.String = js.native
  var meta: java.lang.String = js.native
  def generateClassName(rule: jssLib.jssMod.Rule): java.lang.String = js.native
  def generateClassName(rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[Name]): java.lang.String = js.native
}

