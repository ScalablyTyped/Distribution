package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Captions extends js.Object {
  var captions: js.UndefOr[`1`] = js.undefined
  var controls: js.UndefOr[`1`] = js.undefined
  var icons: js.UndefOr[ClosedCaption] = js.undefined
  var scrubber: js.UndefOr[`0`] = js.undefined
}

object Captions {
  @scala.inline
  def apply(captions: `1` = null, controls: `1` = null, icons: ClosedCaption = null, scrubber: `0` = null): Captions = {
    val __obj = js.Dynamic.literal()
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (scrubber != null) __obj.updateDynamic("scrubber")(scrubber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Captions]
  }
}

