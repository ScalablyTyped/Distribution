package typings.humanparser.humanparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullerNameOutput extends js.Object {
  var fullName: String
}

object FullerNameOutput {
  @scala.inline
  def apply(fullName: String): FullerNameOutput = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FullerNameOutput]
  }
}

