package typings.atJupyterlabServices

import typings.atJupyterlabServices.atJupyterlabServicesStrings.stderr
import typings.atJupyterlabServices.atJupyterlabServicesStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: stdout | stderr
  var text: String
}

object Anon_Name {
  @scala.inline
  def apply(name: stdout | stderr, text: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

