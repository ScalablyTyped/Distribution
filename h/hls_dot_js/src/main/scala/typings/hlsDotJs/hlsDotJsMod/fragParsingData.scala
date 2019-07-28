package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingData extends js.Object {
  var endDTS: Double
  var endPTS: Double
  var frag: Fragment
  var id: String
  var mdat: js.Any
  var moof: js.Any
  var nb: Double
  var startDTS: Double
  var startPTS: Double
  var `type`: String
}

object fragParsingData {
  @scala.inline
  def apply(
    endDTS: Double,
    endPTS: Double,
    frag: Fragment,
    id: String,
    mdat: js.Any,
    moof: js.Any,
    nb: Double,
    startDTS: Double,
    startPTS: Double,
    `type`: String
  ): fragParsingData = {
    val __obj = js.Dynamic.literal(endDTS = endDTS, endPTS = endPTS, frag = frag, id = id, mdat = mdat, moof = moof, nb = nb, startDTS = startDTS, startPTS = startPTS)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[fragParsingData]
  }
}

