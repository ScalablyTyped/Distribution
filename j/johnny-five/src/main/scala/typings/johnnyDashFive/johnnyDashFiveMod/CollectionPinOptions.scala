package typings.johnnyDashFive.johnnyDashFiveMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPinOptions
  extends /* key */ StringDictionary[js.Any] {
  var pins: js.Array[String | Double]
}

object CollectionPinOptions {
  @scala.inline
  def apply(pins: js.Array[String | Double], StringDictionary: /* key */ StringDictionary[js.Any] = null): CollectionPinOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CollectionPinOptions]
  }
}

