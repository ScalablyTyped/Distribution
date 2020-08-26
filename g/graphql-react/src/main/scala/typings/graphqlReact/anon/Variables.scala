package typings.graphqlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variables[V] extends js.Object {
  var variables: V = js.native
}

object Variables {
  @scala.inline
  def apply[V](variables: V): Variables[V] = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables[V]]
  }
  @scala.inline
  implicit class VariablesOps[Self <: Variables[_], V] (val x: Self with Variables[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVariables(value: V): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

