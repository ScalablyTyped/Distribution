package typings.graphqlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVariables[V] extends js.Object {
  var variables: V
}

object AnonVariables {
  @scala.inline
  def apply[V](variables: V): AnonVariables[V] = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVariables[V]]
  }
}

