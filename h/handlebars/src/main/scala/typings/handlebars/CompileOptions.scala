package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileOptions extends js.Object {
  var assumeObjects: js.UndefOr[Boolean] = js.native
  var compat: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[Boolean] = js.native
  var explicitPartialContext: js.UndefOr[Boolean] = js.native
  var ignoreStandalone: js.UndefOr[Boolean] = js.native
  var knownHelpers: js.UndefOr[KnownHelpers] = js.native
  var knownHelpersOnly: js.UndefOr[Boolean] = js.native
  var noEscape: js.UndefOr[Boolean] = js.native
  var preventIndent: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object CompileOptions {
  @scala.inline
  def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  @scala.inline
  implicit class CompileOptionsOps[Self <: CompileOptions] (val x: Self) extends AnyVal {
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
    def setAssumeObjects(value: Boolean): Self = this.set("assumeObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeObjects: Self = this.set("assumeObjects", js.undefined)
    @scala.inline
    def setCompat(value: Boolean): Self = this.set("compat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompat: Self = this.set("compat", js.undefined)
    @scala.inline
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setExplicitPartialContext(value: Boolean): Self = this.set("explicitPartialContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitPartialContext: Self = this.set("explicitPartialContext", js.undefined)
    @scala.inline
    def setIgnoreStandalone(value: Boolean): Self = this.set("ignoreStandalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreStandalone: Self = this.set("ignoreStandalone", js.undefined)
    @scala.inline
    def setKnownHelpers(value: KnownHelpers): Self = this.set("knownHelpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnownHelpers: Self = this.set("knownHelpers", js.undefined)
    @scala.inline
    def setKnownHelpersOnly(value: Boolean): Self = this.set("knownHelpersOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnownHelpersOnly: Self = this.set("knownHelpersOnly", js.undefined)
    @scala.inline
    def setNoEscape(value: Boolean): Self = this.set("noEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEscape: Self = this.set("noEscape", js.undefined)
    @scala.inline
    def setPreventIndent(value: Boolean): Self = this.set("preventIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventIndent: Self = this.set("preventIndent", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

