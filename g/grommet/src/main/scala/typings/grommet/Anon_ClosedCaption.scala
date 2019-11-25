package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedCaption extends js.Object {
  var closedCaption: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var configure: js.UndefOr[js.Any] = js.undefined
  var fullScreen: js.UndefOr[js.Any] = js.undefined
  var pause: js.UndefOr[js.Any] = js.undefined
  var play: js.UndefOr[js.Any] = js.undefined
  var reduceVolume: js.UndefOr[js.Any] = js.undefined
  var volume: js.UndefOr[js.Any] = js.undefined
}

object Anon_ClosedCaption {
  @scala.inline
  def apply(
    closedCaption: js.Any = null,
    color: ColorType = null,
    configure: js.Any = null,
    fullScreen: js.Any = null,
    pause: js.Any = null,
    play: js.Any = null,
    reduceVolume: js.Any = null,
    volume: js.Any = null
  ): Anon_ClosedCaption = {
    val __obj = js.Dynamic.literal()
    if (closedCaption != null) __obj.updateDynamic("closedCaption")(closedCaption.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (reduceVolume != null) __obj.updateDynamic("reduceVolume")(reduceVolume.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClosedCaption]
  }
}

