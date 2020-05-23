package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.stderr
import typings.jupyterlabServices.jupyterlabServicesStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: stdout | stderr
  var text: String
}

object Name {
  @scala.inline
  def apply(name: stdout | stderr, text: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

