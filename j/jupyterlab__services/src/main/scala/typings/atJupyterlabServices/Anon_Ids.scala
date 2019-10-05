package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[IPlugin]
}

object Anon_Ids {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IPlugin]): Anon_Ids = {
    val __obj = js.Dynamic.literal(ids = ids, values = values)
  
    __obj.asInstanceOf[Anon_Ids]
  }
}

