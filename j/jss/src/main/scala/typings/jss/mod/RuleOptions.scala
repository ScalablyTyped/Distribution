package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleOptions extends js.Object {
  var Renderer: typings.jss.mod.Renderer = js.native
  var classes: Classes[String] = js.native
  @JSName("generateId")
  var generateId_Original: GenerateId = js.native
  var index: js.UndefOr[Double] = js.native
  var jss: Jss = js.native
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.native
  var selector: js.UndefOr[String] = js.native
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
  def generateId(rule: Rule): String = js.native
  def generateId(rule: Rule, sheet: StyleSheet[String]): String = js.native
}

