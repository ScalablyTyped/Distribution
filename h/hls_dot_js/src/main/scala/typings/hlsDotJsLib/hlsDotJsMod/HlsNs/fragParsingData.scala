package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingData extends js.Object {
  var endDTS: scala.Double
  var endPTS: scala.Double
  var frag: Fragment
  var id: java.lang.String
  var mdat: js.Any
  var moof: js.Any
  var nb: scala.Double
  var startDTS: scala.Double
  var startPTS: scala.Double
  var `type`: java.lang.String
}

object fragParsingData {
  @scala.inline
  def apply(
    endDTS: scala.Double,
    endPTS: scala.Double,
    frag: Fragment,
    id: java.lang.String,
    mdat: js.Any,
    moof: js.Any,
    nb: scala.Double,
    startDTS: scala.Double,
    startPTS: scala.Double,
    `type`: java.lang.String
  ): fragParsingData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("endDTS")(endDTS)
    __obj.updateDynamic("endPTS")(endPTS)
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("mdat")(mdat)
    __obj.updateDynamic("moof")(moof)
    __obj.updateDynamic("nb")(nb)
    __obj.updateDynamic("startDTS")(startDTS)
    __obj.updateDynamic("startPTS")(startPTS)
    __obj.asInstanceOf[fragParsingData]
  }
}

