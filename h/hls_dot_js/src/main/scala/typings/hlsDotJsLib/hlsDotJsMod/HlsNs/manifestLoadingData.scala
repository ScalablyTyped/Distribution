package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait manifestLoadingData extends js.Object {
  var url: java.lang.String
}

object manifestLoadingData {
  @scala.inline
  def apply(url: java.lang.String): manifestLoadingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[manifestLoadingData]
  }
}

