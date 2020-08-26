package typings.jsonQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var key: String = js.native
  var parents: js.Array[String] = js.native
  var references: js.Array[_] = js.native
  var value: js.Any = js.native
}

object Result {
  @scala.inline
  def apply(key: String, parents: js.Array[String], references: js.Array[_], value: js.Any): Result = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencesVarargs(value: js.Any*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[_]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

