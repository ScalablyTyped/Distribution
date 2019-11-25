package typings.hapiDashPino

import org.scalablytyped.runtime.StringDictionary
import typings.hapiDashPino.hapiDashPinoMod.Serializers
import typings.pino.pinoMod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var level: js.UndefOr[Level | String] = js.undefined
  var serializers: js.UndefOr[Serializers] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    level: Level | String = null,
    serializers: Serializers = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

