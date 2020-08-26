package typings.html5ToPdf.mod

import typings.node.Buffer
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteer.mod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends js.Object {
  var body: String | Buffer = js.native
  var include: js.Array[FileDef] = js.native
  var launchOptions: LaunchOptions = js.native
  var pdf: PDFOptions = js.native
  var renderDelay: Double = js.native
  var templatePath: String = js.native
  var templateUrl: String = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(
    body: String | Buffer,
    include: js.Array[FileDef],
    launchOptions: LaunchOptions,
    pdf: PDFOptions,
    renderDelay: Double,
    templatePath: String,
    templateUrl: String
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], renderDelay = renderDelay.asInstanceOf[js.Any], templatePath = templatePath.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: String | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVarargs(value: FileDef*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[FileDef]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchOptions(value: LaunchOptions): Self = this.set("launchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPdf(value: PDFOptions): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderDelay(value: Double): Self = this.set("renderDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplatePath(value: String): Self = this.set("templatePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
  }
  
}

