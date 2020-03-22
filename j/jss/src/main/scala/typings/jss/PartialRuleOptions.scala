package typings.jss

import typings.jss.mod.Classes
import typings.jss.mod.ContainerRule
import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Renderer
import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jss.jss.RuleOptions> */
trait PartialRuleOptions extends js.Object {
  var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.undefined
  var classes: js.UndefOr[Classes[String]] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
}

object PartialRuleOptions {
  @scala.inline
  def apply(
    Renderer: Renderer = null,
    classes: Classes[String] = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    index: Int | Double = null,
    jss: Jss = null,
    parent: ContainerRule | (StyleSheet[String | Double | js.Symbol]) = null,
    selector: String = null,
    sheet: StyleSheet[String | Double | js.Symbol] = null
  ): PartialRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (Renderer != null) __obj.updateDynamic("Renderer")(Renderer.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRuleOptions]
  }
}

