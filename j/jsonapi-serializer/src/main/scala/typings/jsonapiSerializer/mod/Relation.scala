package typings.jsonapiSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relation extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.native
  var included: js.UndefOr[Boolean] = js.native
  var ref: String | RefFunction = js.native
}

object Relation {
  @scala.inline
  def apply(ref: String | RefFunction): Relation = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relation]
  }
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
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
    def setRefFunction2(value: (/* current */ js.Any, /* item */ js.Any) => String): Self = this.set("ref", js.Any.fromFunction2(value))
    @scala.inline
    def setRef(value: String | RefFunction): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
  }
  
}

