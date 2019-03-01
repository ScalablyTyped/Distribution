package typings
package lernaDashGetDashPackagesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[Anon_AdditionalTsTypings] = js.undefined
  var main: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var version: java.lang.String
}

object Anon_Config {
  @scala.inline
  def apply(
    name: java.lang.String,
    version: java.lang.String,
    config: Anon_AdditionalTsTypings = null,
    main: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    if (config != null) __obj.updateDynamic("config")(config)
    if (main != null) __obj.updateDynamic("main")(main)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Anon_Config]
  }
}

