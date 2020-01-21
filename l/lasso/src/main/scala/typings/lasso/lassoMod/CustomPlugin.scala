package typings.lasso.lassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPlugin extends js.Object {
  var config: js.Any
  var plugin: String
}

object CustomPlugin {
  @scala.inline
  def apply(config: js.Any, plugin: String): CustomPlugin = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomPlugin]
  }
}

