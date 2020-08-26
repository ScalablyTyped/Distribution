package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode extends js.Object {
  @JSName("$attrs$")
  var DollarattrsDollar: js.UndefOr[js.Any] = js.native
  @JSName("$children$")
  var DollarchildrenDollar: js.Array[VNode] = js.native
  @JSName("$elm$")
  var DollarelmDollar: js.Any = js.native
  @JSName("$flags$")
  var DollarflagsDollar: Double = js.native
  @JSName("$key$")
  var DollarkeyDollar: js.UndefOr[String | Double] = js.native
  @JSName("$name$")
  var DollarnameDollar: js.UndefOr[String] = js.native
  @JSName("$tag$")
  var DollartagDollar: String | Double | js.Function = js.native
  @JSName("$text$")
  var DollartextDollar: String = js.native
}

object VNode {
  @scala.inline
  def apply(
    DollarchildrenDollar: js.Array[VNode],
    DollarelmDollar: js.Any,
    DollarflagsDollar: Double,
    DollartagDollar: String | Double | js.Function,
    DollartextDollar: String
  ): VNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$children$")(DollarchildrenDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$elm$")(DollarelmDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$tag$")(DollartagDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$text$")(DollartextDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  @scala.inline
  implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
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
    def setDollarchildrenDollarVarargs(value: VNode*): Self = this.set("$children$", js.Array(value :_*))
    @scala.inline
    def setDollarchildrenDollar(value: js.Array[VNode]): Self = this.set("$children$", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollarelmDollar(value: js.Any): Self = this.set("$elm$", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollarflagsDollar(value: Double): Self = this.set("$flags$", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollartagDollar(value: String | Double | js.Function): Self = this.set("$tag$", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollartextDollar(value: String): Self = this.set("$text$", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollarattrsDollar(value: js.Any): Self = this.set("$attrs$", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDollarattrsDollar: Self = this.set("$attrs$", js.undefined)
    @scala.inline
    def setDollarkeyDollar(value: String | Double): Self = this.set("$key$", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDollarkeyDollar: Self = this.set("$key$", js.undefined)
    @scala.inline
    def setDollarnameDollar(value: String): Self = this.set("$name$", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDollarnameDollar: Self = this.set("$name$", js.undefined)
  }
  
}

