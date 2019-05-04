package typings
package atJupyterlabServicesLib.libConfigMod.ConfigWithDefaultsNs

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
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default values.
    */
  var defaults: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONObject] = js.undefined
  /**
    * The configuration section.
    */
  var section: atJupyterlabServicesLib.libConfigMod.IConfigSection
}

object IOptions {
  @scala.inline
  def apply(
    section: atJupyterlabServicesLib.libConfigMod.IConfigSection,
    className: java.lang.String = null,
    defaults: atPhosphorCoreutilsLib.libJsonMod.JSONObject = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(section = section)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[IOptions]
  }
}

