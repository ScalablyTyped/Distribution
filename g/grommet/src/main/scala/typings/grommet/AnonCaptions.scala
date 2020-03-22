package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaptions extends js.Object {
  var captions: js.UndefOr[Anon1] = js.undefined
  var controls: js.UndefOr[Anon1] = js.undefined
  var icons: js.UndefOr[AnonClosedCaption] = js.undefined
  var scrubber: js.UndefOr[Anon0] = js.undefined
}

object AnonCaptions {
  @scala.inline
  def apply(
    captions: Anon1 = null,
    controls: Anon1 = null,
    icons: AnonClosedCaption = null,
    scrubber: Anon0 = null
  ): AnonCaptions = {
    val __obj = js.Dynamic.literal()
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (scrubber != null) __obj.updateDynamic("scrubber")(scrubber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaptions]
  }
}

