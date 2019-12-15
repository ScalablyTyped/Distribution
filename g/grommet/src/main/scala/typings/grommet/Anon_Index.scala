package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var item: js.UndefOr[js.Object] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(index: Int | Double = null, item: js.Object = null): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index]
  }
}

