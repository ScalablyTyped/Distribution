package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The setting values for a plugin.
  */
trait ISettingBundle extends PartialJSONObject {
  /**
    * A composite of the user setting values and the plugin schema defaults.
    *
    * #### Notes
    * The `composite` values will always be a superset of the `user` values.
    */
  var composite: PartialJSONObject
  /**
    * The user setting values.
    */
  var user: PartialJSONObject
}

object ISettingBundle {
  @scala.inline
  def apply(composite: PartialJSONObject, user: PartialJSONObject): ISettingBundle = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingBundle]
  }
}

