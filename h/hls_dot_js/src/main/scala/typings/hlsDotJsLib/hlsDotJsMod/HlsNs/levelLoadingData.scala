package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelLoadingData extends js.Object {
  var level: scala.Double
  var url: java.lang.String
}

object levelLoadingData {
  @scala.inline
  def apply(level: scala.Double, url: java.lang.String): levelLoadingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[levelLoadingData]
  }
}

