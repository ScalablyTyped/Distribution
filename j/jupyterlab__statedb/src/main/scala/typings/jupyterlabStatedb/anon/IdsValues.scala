package typings.jupyterlabStatedb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdsValues extends js.Object {
  var ids: js.Array[String] = js.native
  var values: js.Array[String] = js.native
}

object IdsValues {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[String]): IdsValues = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdsValues]
  }
  @scala.inline
  implicit class IdsValuesOps[Self <: IdsValues] (val x: Self) extends AnyVal {
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
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

