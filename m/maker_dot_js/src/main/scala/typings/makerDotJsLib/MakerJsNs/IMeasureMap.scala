package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map of measurements.
  */
trait IMeasureMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[IMeasure]

object IMeasureMap {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[IMeasure] = null): IMeasureMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IMeasureMap]
  }
}

