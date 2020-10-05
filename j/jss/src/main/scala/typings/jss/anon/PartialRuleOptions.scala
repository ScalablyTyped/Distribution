package typings.jss.anon

import typings.jss.mod.Classes
import typings.jss.mod.ContainerRule
import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Renderer
import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<jss.jss.RuleOptions> */
@js.native
trait PartialRuleOptions extends js.Object {
  var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.native
  var classes: js.UndefOr[Classes[String]] = js.native
  var generateId: js.UndefOr[GenerateId] = js.native
  var index: js.UndefOr[Double] = js.native
  var jss: js.UndefOr[Jss] = js.native
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.native
  var selector: js.UndefOr[String] = js.native
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
}

object PartialRuleOptions {
  @scala.inline
  def apply(): PartialRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRuleOptions]
  }
  @scala.inline
  implicit class PartialRuleOptionsOps[Self <: PartialRuleOptions] (val x: Self) extends AnyVal {
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
    def setClasses(value: Classes[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
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
    def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
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

