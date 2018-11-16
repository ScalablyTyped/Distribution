package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleFactoryOptions[Name /* <: java.lang.String */] extends js.Object {
  var classes: Classes[Name] = js.native
  @JSName("generateClassName")
  var generateClassName_Original: GenerateClassName[Name] = js.native
  var index: scala.Double = js.native
  var jss: JSS = js.native
  var selector: java.lang.String = js.native
  var sheet: StyleSheet[Name] = js.native
  def generateClassName(rule: Rule): java.lang.String = js.native
  def generateClassName(rule: Rule, sheet: StyleSheet[Name]): java.lang.String = js.native
}

