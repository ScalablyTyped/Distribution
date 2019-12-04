package typings.graphqlDashTools

import typings.graphqlDashTools.distInterfacesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var operation: Operation
}

object Anon_Name {
  @scala.inline
  def apply(name: String, operation: Operation): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

