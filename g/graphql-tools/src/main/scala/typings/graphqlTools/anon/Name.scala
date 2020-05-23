package typings.graphqlTools.anon

import typings.graphqlTools.interfacesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var operation: Operation
}

object Name {
  @scala.inline
  def apply(name: String, operation: Operation): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

