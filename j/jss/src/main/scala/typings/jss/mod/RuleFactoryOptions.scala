package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleFactoryOptions extends js.Object {
  var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.native
  var classes: js.UndefOr[js.Object] = js.native
  var generateId: js.UndefOr[GenerateId] = js.native
  var index: js.UndefOr[Double] = js.native
  var jss: js.UndefOr[Jss] = js.native
  var selector: js.UndefOr[String] = js.native
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
}

object RuleFactoryOptions {
  @scala.inline
  def apply(): RuleFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleFactoryOptions]
  }
  @scala.inline
  implicit class RuleFactoryOptionsOps[Self <: RuleFactoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("Renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("Renderer", js.undefined)
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = this.set("generateId", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setJss(value: Jss): Self = this.set("jss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJss: Self = this.set("jss", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = this.set("sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
  }
  
}

