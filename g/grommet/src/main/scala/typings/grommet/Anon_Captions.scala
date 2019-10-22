package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Captions extends js.Object {
  var captions: js.UndefOr[Anon_BackgroundBackgroundType] = js.undefined
  var controls: js.UndefOr[Anon_BackgroundBackgroundType] = js.undefined
  var icons: js.UndefOr[Anon_ClosedCaption] = js.undefined
  var scrubber: js.UndefOr[Anon_ColorColorType] = js.undefined
}

object Anon_Captions {
  @scala.inline
  def apply(
    captions: Anon_BackgroundBackgroundType = null,
    controls: Anon_BackgroundBackgroundType = null,
    icons: Anon_ClosedCaption = null,
    scrubber: Anon_ColorColorType = null
  ): Anon_Captions = {
    val __obj = js.Dynamic.literal()
    if (captions != null) __obj.updateDynamic("captions")(captions)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (scrubber != null) __obj.updateDynamic("scrubber")(scrubber)
    __obj.asInstanceOf[Anon_Captions]
  }
}

