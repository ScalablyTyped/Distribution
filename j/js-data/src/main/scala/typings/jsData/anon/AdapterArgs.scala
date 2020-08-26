package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterArgs extends js.Object {
  var beforeAssign: Double = js.native
  var defaults: js.Array[js.Object] = js.native
  var types: js.Array[_] = js.native
  def adapterArgs(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Array[_] = js.native
}

object AdapterArgs {
  @scala.inline
  def apply(
    adapterArgs: (js.Any, js.Any, js.Any, js.Any) => js.Array[_],
    beforeAssign: Double,
    defaults: js.Array[js.Object],
    types: js.Array[_]
  ): AdapterArgs = {
    val __obj = js.Dynamic.literal(adapterArgs = js.Any.fromFunction4(adapterArgs), beforeAssign = beforeAssign.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterArgs]
  }
  @scala.inline
  implicit class AdapterArgsOps[Self <: AdapterArgs] (val x: Self) extends AnyVal {
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
    def setAdapterArgs(value: (js.Any, js.Any, js.Any, js.Any) => js.Array[_]): Self = this.set("adapterArgs", js.Any.fromFunction4(value))
    @scala.inline
    def setBeforeAssign(value: Double): Self = this.set("beforeAssign", value.asInstanceOf[js.Any])
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

