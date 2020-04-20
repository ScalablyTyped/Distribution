package typings.jupyterlabServices

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIds extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[IPlugin]
}

object AnonIds {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IPlugin]): AnonIds = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIds]
  }
}

