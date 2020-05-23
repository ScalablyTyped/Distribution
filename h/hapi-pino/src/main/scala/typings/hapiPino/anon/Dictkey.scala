package typings.hapiPino.anon

import org.scalablytyped.runtime.StringDictionary
import typings.hapiPino.mod.Serializers
import typings.pino.mod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var level: js.UndefOr[Level | String] = js.undefined
  var serializers: js.UndefOr[Serializers] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    level: Level | String = null,
    serializers: Serializers = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

