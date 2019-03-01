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

object Option {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    list: js.UndefOr[scala.Boolean] = js.undefined,
    plugin: js.Array[_] = null,
    regexp: java.lang.String = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    rename: js.Array[RenameOption] = null,
    single_quotes: js.UndefOr[scala.Boolean] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (rename != null) __obj.updateDynamic("rename")(rename)
    if (!js.isUndefined(single_quotes)) __obj.updateDynamic("single_quotes")(single_quotes)
    __obj.asInstanceOf[Option]
  }
}

