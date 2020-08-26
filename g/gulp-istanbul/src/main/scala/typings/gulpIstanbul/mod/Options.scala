package typings.gulpIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var codeGenerationOptions: js.UndefOr[js.Object] = js.native
  var coverageVariable: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var embedSource: js.UndefOr[Boolean] = js.native
  var includeUntested: js.UndefOr[Boolean] = js.native
  var noAutoWrap: js.UndefOr[Boolean] = js.native
  var noCompact: js.UndefOr[Boolean] = js.native
  var preserveComments: js.UndefOr[Boolean] = js.native
  var walkDebug: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCodeGenerationOptions(value: js.Object): Self = this.set("codeGenerationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeGenerationOptions: Self = this.set("codeGenerationOptions", js.undefined)
    @scala.inline
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageVariable: Self = this.set("coverageVariable", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEmbedSource(value: Boolean): Self = this.set("embedSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedSource: Self = this.set("embedSource", js.undefined)
    @scala.inline
    def setIncludeUntested(value: Boolean): Self = this.set("includeUntested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUntested: Self = this.set("includeUntested", js.undefined)
    @scala.inline
    def setNoAutoWrap(value: Boolean): Self = this.set("noAutoWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAutoWrap: Self = this.set("noAutoWrap", js.undefined)
    @scala.inline
    def setNoCompact(value: Boolean): Self = this.set("noCompact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCompact: Self = this.set("noCompact", js.undefined)
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveComments: Self = this.set("preserveComments", js.undefined)
    @scala.inline
    def setWalkDebug(value: Boolean): Self = this.set("walkDebug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWalkDebug: Self = this.set("walkDebug", js.undefined)
  }
  
}

