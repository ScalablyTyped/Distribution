package typings.graphqlTools

import typings.graphqlTools.interfacesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var operation: Operation
}

object AnonName {
  @scala.inline
  def apply(name: String, operation: Operation): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

