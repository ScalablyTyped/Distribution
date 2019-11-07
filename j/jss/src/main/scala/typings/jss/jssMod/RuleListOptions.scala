package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleListOptions extends js.Object {
  var Renderer: typings.jss.jssMod.Renderer = js.native
  var classes: Classes[String] = js.native
  @JSName("generateClassName")
  var generateClassName_Original: GenerateId = js.native
  var jss: Jss = js.native
  var parent: ContainerRule | StyleSheet[String] = js.native
  var sheet: StyleSheet[String] = js.native
  def generateClassName(rule: Rule): String = js.native
  def generateClassName(rule: Rule, sheet: StyleSheet[String]): String = js.native
}

