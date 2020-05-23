package typings.gulpNgAnnotate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//TODO: Should be on ng-annotate module
trait Option extends js.Object {
  /**
    * Add annotations where non-existing
    */
  var add: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable optional matcher
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * List optional matchers
    */
  var list: js.UndefOr[Boolean] = js.undefined
  /**
    * Load a user plugin with the provided path
    */
  var plugin: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Restrict matching further or to expand matching
    */
  var regexp: js.UndefOr[String] = js.undefined
  /**
    * Remove all existing annotations
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  /**
    * Rename providers (services, factories, controllers, etc.) with a new name when declared and referenced through annotation
    */
  var rename: js.UndefOr[js.Array[RenameOption]] = js.undefined
  /**
    * Output '$scope' instead of "$scope".
    */
  var single_quotes: js.UndefOr[Boolean] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Boolean] = js.undefined,
    list: js.UndefOr[Boolean] = js.undefined,
    plugin: js.Array[_] = null,
    regexp: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    rename: js.Array[RenameOption] = null,
    single_quotes: js.UndefOr[Boolean] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.get.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (!js.isUndefined(single_quotes)) __obj.updateDynamic("single_quotes")(single_quotes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

