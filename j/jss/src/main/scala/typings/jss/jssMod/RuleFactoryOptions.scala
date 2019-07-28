package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleFactoryOptions[Name /* <: String */] extends js.Object {
  var classes: Classes[Name] = js.native
  @JSName("generateClassName")
  var generateClassName_Original: GenerateClassName[Name] = js.native
  var index: Double = js.native
  var jss: JSS = js.native
  var selector: String = js.native
  var sheet: StyleSheet[Name] = js.native
  def generateClassName(rule: Rule): String = js.native
  def generateClassName(rule: Rule, sheet: StyleSheet[Name]): String = js.native
}

