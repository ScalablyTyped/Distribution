package typings.graphqlToolsWrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias extends js.Object {
  var alias: String = js.native
  var pathToField: js.Array[String] = js.native
}

object Alias {
  @scala.inline
  def apply(alias: String, pathToField: js.Array[String]): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], pathToField = pathToField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathToFieldVarargs(value: String*): Self = this.set("pathToField", js.Array(value :_*))
    @scala.inline
    def setPathToField(value: js.Array[String]): Self = this.set("pathToField", value.asInstanceOf[js.Any])
  }
  
}

