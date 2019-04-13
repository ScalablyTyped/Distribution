package typings
package gulpDashAngularDashTemplatecacheLib.gulpDashAngularDashTemplatecacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Override file base path.
    */
  var base: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * Name to use when concatenating.
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of AngularJS module.
    */
  var module: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wrap the templateCache in a module system. Currently supported systems: RequireJS, Browserify, ES6 and IIFE (Immediately-Invoked Function Expression).
    */
  var moduleSystem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Prefix for template URLs.
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Create a new AngularJS module, instead of using an existing.
    */
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override template body.
    */
  var templateBody: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override template footer.
    */
  var templateFooter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override template header.
    */
  var templateHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Transform the generated URL before it's put into $templateCache.
    */
  var transformUrl: js.UndefOr[js.Function] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: java.lang.String | js.Function = null,
    filename: java.lang.String = null,
    module: java.lang.String = null,
    moduleSystem: java.lang.String = null,
    root: java.lang.String = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    templateBody: java.lang.String = null,
    templateFooter: java.lang.String = null,
    templateHeader: java.lang.String = null,
    transformUrl: js.Function = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (module != null) __obj.updateDynamic("module")(module)
    if (moduleSystem != null) __obj.updateDynamic("moduleSystem")(moduleSystem)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody)
    if (templateFooter != null) __obj.updateDynamic("templateFooter")(templateFooter)
    if (templateHeader != null) __obj.updateDynamic("templateHeader")(templateHeader)
    if (transformUrl != null) __obj.updateDynamic("transformUrl")(transformUrl)
    __obj.asInstanceOf[Options]
  }
}

