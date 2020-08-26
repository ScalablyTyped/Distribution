package typings.jsreportCore.anon

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.Helpers
import typings.jsreportCore.mod.Recipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-core.jsreport-core.Template> */
@js.native
trait PartialTemplate extends js.Object {
  var content: js.UndefOr[String] = js.native
  var engine: js.UndefOr[Engine | String] = js.native
  var helpers: js.UndefOr[Helpers] = js.native
  var recipe: js.UndefOr[Recipe | String] = js.native
}

object PartialTemplate {
  @scala.inline
  def apply(): PartialTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTemplate]
  }
  @scala.inline
  implicit class PartialTemplateOps[Self <: PartialTemplate] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEngine(value: Engine | String): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setHelpers(value: Helpers): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    @scala.inline
    def setRecipe(value: Recipe | String): Self = this.set("recipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipe: Self = this.set("recipe", js.undefined)
  }
  
}

