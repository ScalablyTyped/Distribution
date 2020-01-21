package typings.lokijs

import typings.lokijs.lokijsStrings.destructured
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestructured extends js.Object {
  var serializationMethod: destructured
}

object AnonDestructured {
  @scala.inline
  def apply(serializationMethod: destructured): AnonDestructured = {
    val __obj = js.Dynamic.literal(serializationMethod = serializationMethod.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDestructured]
  }
}

