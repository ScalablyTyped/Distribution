package typings
package gulpDashNgDashAnnotateLib.gulpDashNgDashAnnotateMod.ngAnnotateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//TODO: Should be on ng-annotate module

trait Option extends js.Object {
  /**
           * Add annotations where non-existing
           */
  var add: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable optional matcher
           */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * List optional matchers
           */
  var list: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Load a user plugin with the provided path
           */
  var plugin: js.UndefOr[js.Array[_]] = js.undefined
  /**
           * Restrict matching further or to expand matching
           */
  var regexp: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Remove all existing annotations
           */
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Rename providers (services, factories, controllers, etc.) with a new name when declared and referenced through annotation
           */
  var rename: js.UndefOr[js.Array[RenameOption]] = js.undefined
  /**
           * Output '$scope' instead of "$scope".
           */
  var single_quotes: js.UndefOr[scala.Boolean] = js.undefined
}

