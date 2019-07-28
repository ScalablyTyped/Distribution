package typings.atJupyterlabServices.libConfigMod.ConfigWithDefaultsNs

import typings.atJupyterlabServices.libConfigMod.IConfigSection
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a ConfigWithDefaults object.
  */
trait IOptions extends js.Object {
  /**
    * The optional classname namespace.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The default values.
    */
  var defaults: js.UndefOr[JSONObject] = js.undefined
  /**
    * The configuration section.
    */
  var section: IConfigSection
}

object IOptions {
  @scala.inline
  def apply(section: IConfigSection, className: String = null, defaults: JSONObject = null): IOptions = {
    val __obj = js.Dynamic.literal(section = section)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[IOptions]
  }
}

