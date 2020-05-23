package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[Xlarge] = js.undefined
  var text: js.UndefOr[FontWeight] = js.undefined
}

object Text {
  @scala.inline
  def apply(extend: ExtendType = null, size: Xlarge = null, text: FontWeight = null): Text = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

