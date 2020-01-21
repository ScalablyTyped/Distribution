package typings.grommet

import typings.grommet.grommetStrings.all
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllBody extends js.Object {
  var body: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAll] = js.undefined
  var color: js.UndefOr[String | AnonDark] = js.undefined
  var footer: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAll] = js.undefined
  var header: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAll] = js.undefined
  var side: js.UndefOr[top | left | bottom | right | horizontal | vertical | all] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonAllBody {
  @scala.inline
  def apply(
    body: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAll = null,
    color: String | AnonDark = null,
    footer: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAll = null,
    header: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonAll = null,
    side: top | left | bottom | right | horizontal | vertical | all = null,
    size: xsmall | small | medium | large | xlarge | String = null
  ): AnonAllBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllBody]
  }
}

