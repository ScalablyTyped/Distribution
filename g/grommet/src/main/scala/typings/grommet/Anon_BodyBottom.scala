package typings.grommet

import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyBottom extends js.Object {
  var body: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom] = js.undefined
  var bottom: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var footer: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom] = js.undefined
  var header: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom] = js.undefined
  var horizontal: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var left: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var right: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var top: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var vertical: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
}

object Anon_BodyBottom {
  @scala.inline
  def apply(
    body: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom = null,
    bottom: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    footer: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom = null,
    header: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom = null,
    horizontal: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    left: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    right: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    top: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    vertical: xxsmall | xsmall | small | medium | large | xlarge | String = null
  ): Anon_BodyBottom = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyBottom]
  }
}

