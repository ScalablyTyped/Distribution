package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleFactoryOptions extends js.Object {
  var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
}

object RuleFactoryOptions {
  @scala.inline
  def apply(
    Renderer: Renderer = null,
    classes: js.Object = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    index: Int | Double = null,
    jss: Jss = null,
    selector: String = null,
    sheet: StyleSheet[String | Double | js.Symbol] = null
  ): RuleFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (Renderer != null) __obj.updateDynamic("Renderer")(Renderer.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleFactoryOptions]
  }
}

