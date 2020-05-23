package typings.gulpAngularTemplatecache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Override file base path.
    */
  var base: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Name to use when concatenating.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Name of AngularJS module.
    */
  var module: js.UndefOr[String] = js.undefined
  /**
    * Wrap the templateCache in a module system. Currently supported systems: RequireJS, Browserify, ES6 and IIFE (Immediately-Invoked Function Expression).
    */
  var moduleSystem: js.UndefOr[String] = js.undefined
  /**
    * Prefix for template URLs.
    */
  var root: js.UndefOr[String] = js.undefined
  /**
    * Create a new AngularJS module, instead of using an existing.
    */
  var standalone: js.UndefOr[Boolean] = js.undefined
  /**
    * Override template body.
    */
  var templateBody: js.UndefOr[String] = js.undefined
  /**
    * Override template footer.
    */
  var templateFooter: js.UndefOr[String] = js.undefined
  /**
    * Override template header.
    */
  var templateHeader: js.UndefOr[String] = js.undefined
  /**
    * Transform the generated URL before it's put into $templateCache.
    */
  var transformUrl: js.UndefOr[js.Function] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: String | js.Function = null,
    filename: String = null,
    module: String = null,
    moduleSystem: String = null,
    root: String = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    templateBody: String = null,
    templateFooter: String = null,
    templateHeader: String = null,
    transformUrl: js.Function = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (moduleSystem != null) __obj.updateDynamic("moduleSystem")(moduleSystem.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.get.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    if (templateFooter != null) __obj.updateDynamic("templateFooter")(templateFooter.asInstanceOf[js.Any])
    if (templateHeader != null) __obj.updateDynamic("templateHeader")(templateHeader.asInstanceOf[js.Any])
    if (transformUrl != null) __obj.updateDynamic("transformUrl")(transformUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

