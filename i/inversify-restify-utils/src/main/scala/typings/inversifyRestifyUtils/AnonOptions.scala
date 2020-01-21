package typings.inversifyRestifyUtils

import typings.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.Object
  var path: StrOrRegex
}

object AnonOptions {
  @scala.inline
  def apply(options: js.Object, path: StrOrRegex): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}

