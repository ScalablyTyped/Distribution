package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions extends js.Object {
  var converters: js.UndefOr[Hash[Converter]] = js.native
  var helpers: js.UndefOr[Hash[_]] = js.native
  var markup: js.Any = js.native
  /* Template options hash */
  var tags: js.UndefOr[Hash[TagSetter]] = js.native
  var templates: js.UndefOr[Hash[TemplateSetter]] = js.native
  var useViews: js.UndefOr[Boolean] = js.native
}

object TemplateOptions {
  @scala.inline
  def apply(markup: js.Any): TemplateOptions = {
    val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOptions]
  }
  @scala.inline
  implicit class TemplateOptionsOps[Self <: TemplateOptions] (val x: Self) extends AnyVal {
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
    def setMarkup(value: js.Any): Self = this.set("markup", value.asInstanceOf[js.Any])
    @scala.inline
    def setConverters(value: Hash[Converter]): Self = this.set("converters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverters: Self = this.set("converters", js.undefined)
    @scala.inline
    def setHelpers(value: Hash[_]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    @scala.inline
    def setTags(value: Hash[TagSetter]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplates(value: Hash[TemplateSetter]): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    @scala.inline
    def setUseViews(value: Boolean): Self = this.set("useViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseViews: Self = this.set("useViews", js.undefined)
  }
  
}

