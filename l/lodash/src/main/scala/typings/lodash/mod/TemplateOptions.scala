package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// template
@js.native
trait TemplateOptions extends TemplateSettings {
  /**
    * The sourceURL of the template's compiled source.
    */
  var sourceURL: js.UndefOr[String] = js.native
}

object TemplateOptions {
  @scala.inline
  def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
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
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceURL: Self = this.set("sourceURL", js.undefined)
  }
  
}

