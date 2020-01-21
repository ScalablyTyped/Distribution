package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleListOptions extends js.Object {
  var Renderer: typings.jss.mod.Renderer = js.native
  var classes: Classes[String] = js.native
  @JSName("generateClassName")
  var generateClassName_Original: GenerateId = js.native
  var jss: Jss = js.native
  var parent: ContainerRule | (StyleSheet[String | Double | js.Symbol]) = js.native
  var sheet: StyleSheet[String | Double | js.Symbol] = js.native
  def generateClassName(rule: Rule): String = js.native
  def generateClassName(rule: Rule, sheet: StyleSheet[String]): String = js.native
}

