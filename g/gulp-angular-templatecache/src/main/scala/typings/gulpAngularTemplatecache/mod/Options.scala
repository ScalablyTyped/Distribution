package typings.gulpAngularTemplatecache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Override file base path.
    */
  var base: js.UndefOr[String | js.Function] = js.native
  /**
    * Name to use when concatenating.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Name of AngularJS module.
    */
  var module: js.UndefOr[String] = js.native
  /**
    * Wrap the templateCache in a module system. Currently supported systems: RequireJS, Browserify, ES6 and IIFE (Immediately-Invoked Function Expression).
    */
  var moduleSystem: js.UndefOr[String] = js.native
  /**
    * Prefix for template URLs.
    */
  var root: js.UndefOr[String] = js.native
  /**
    * Create a new AngularJS module, instead of using an existing.
    */
  var standalone: js.UndefOr[Boolean] = js.native
  /**
    * Override template body.
    */
  var templateBody: js.UndefOr[String] = js.native
  /**
    * Override template footer.
    */
  var templateFooter: js.UndefOr[String] = js.native
  /**
    * Override template header.
    */
  var templateHeader: js.UndefOr[String] = js.native
  /**
    * Transform the generated URL before it's put into $templateCache.
    */
  var transformUrl: js.UndefOr[js.Function] = js.native
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
    def setBase(value: String | js.Function): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setModuleSystem(value: String): Self = this.set("moduleSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleSystem: Self = this.set("moduleSystem", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
    @scala.inline
    def setTemplateBody(value: String): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
    @scala.inline
    def setTemplateFooter(value: String): Self = this.set("templateFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateFooter: Self = this.set("templateFooter", js.undefined)
    @scala.inline
    def setTemplateHeader(value: String): Self = this.set("templateHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateHeader: Self = this.set("templateHeader", js.undefined)
    @scala.inline
    def setTransformUrl(value: js.Function): Self = this.set("transformUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformUrl: Self = this.set("transformUrl", js.undefined)
  }
  
}

