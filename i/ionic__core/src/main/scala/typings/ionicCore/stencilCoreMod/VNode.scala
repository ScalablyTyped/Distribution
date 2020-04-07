package typings.ionicCore.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  @JSName("$attrs$")
  var DollarattrsDollar: js.UndefOr[js.Any] = js.undefined
  @JSName("$children$")
  var DollarchildrenDollar: js.Array[VNode]
  @JSName("$elm$")
  var DollarelmDollar: js.Any
  @JSName("$flags$")
  var DollarflagsDollar: Double
  @JSName("$key$")
  var DollarkeyDollar: js.UndefOr[String | Double] = js.undefined
  @JSName("$name$")
  var DollarnameDollar: js.UndefOr[String] = js.undefined
  @JSName("$tag$")
  var DollartagDollar: String | Double | js.Function
  @JSName("$text$")
  var DollartextDollar: String
}

object VNode {
  @scala.inline
  def apply(
    DollarchildrenDollar: js.Array[VNode],
    DollarelmDollar: js.Any,
    DollarflagsDollar: Double,
    DollartagDollar: String | Double | js.Function,
    DollartextDollar: String,
    DollarattrsDollar: js.Any = null,
    DollarkeyDollar: String | Double = null,
    DollarnameDollar: String = null
  ): VNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$children$")(DollarchildrenDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$elm$")(DollarelmDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$tag$")(DollartagDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$text$")(DollartextDollar.asInstanceOf[js.Any])
    if (DollarattrsDollar != null) __obj.updateDynamic("$attrs$")(DollarattrsDollar.asInstanceOf[js.Any])
    if (DollarkeyDollar != null) __obj.updateDynamic("$key$")(DollarkeyDollar.asInstanceOf[js.Any])
    if (DollarnameDollar != null) __obj.updateDynamic("$name$")(DollarnameDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

