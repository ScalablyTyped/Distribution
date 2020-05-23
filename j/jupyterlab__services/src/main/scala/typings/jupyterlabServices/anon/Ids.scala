package typings.jupyterlabServices.anon

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ids extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[IPlugin]
}

object Ids {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IPlugin]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
}

