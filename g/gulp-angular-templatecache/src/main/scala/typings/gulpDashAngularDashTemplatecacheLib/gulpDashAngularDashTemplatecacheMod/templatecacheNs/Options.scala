package typings
package gulpDashAngularDashTemplatecacheLib.gulpDashAngularDashTemplatecacheMod.templatecacheNs

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

