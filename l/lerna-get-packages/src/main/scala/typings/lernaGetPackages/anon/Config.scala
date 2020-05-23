package typings.lernaGetPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: js.UndefOr[AdditionalTsTypings] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var name: String
  var `private`: js.UndefOr[Boolean] = js.undefined
  var version: String
}

object Config {
  @scala.inline
  def apply(
    name: String,
    version: String,
    config: AdditionalTsTypings = null,
    main: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

