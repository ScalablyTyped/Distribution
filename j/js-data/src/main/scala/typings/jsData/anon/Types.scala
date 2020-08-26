package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var defaults: js.Array[js.Object] = js.native
  var types: js.Array[_] = js.native
}

object Types {
  @scala.inline
  def apply(defaults: js.Array[js.Object], types: js.Array[_]): Types = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
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
    def setDefaultsVarargs(value: js.Object*): Self = this.set("defaults", js.Array(value :_*))
    @scala.inline
    def setDefaults(value: js.Array[js.Object]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: js.Any*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[_]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

