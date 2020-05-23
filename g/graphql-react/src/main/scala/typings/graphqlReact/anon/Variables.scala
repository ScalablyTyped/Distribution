package typings.graphqlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variables[V] extends js.Object {
  var variables: V
}

object Variables {
  @scala.inline
  def apply[V](variables: V): Variables[V] = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables[V]]
  }
}

